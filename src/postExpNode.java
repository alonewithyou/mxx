/**
 * Created by Shining on 2016/4/26.
 */
import java.util.*;

public class postExpNode extends ExpNode{
    postOpNode curOp;
    identifierNode curid;
    funcNameNode curfunc;
    int sortOf;

    postExpNode(ExpNode ls,ExpNode rs,int sf){
		/*System.out.println("create postexpnode");
		System.out.println(ls.getClass().getSimpleName());
		if (ls.getClass().getSimpleName().equals("identifierNode")){
			System.out.println(((identifierNode)ls).idName);
		}
		System.out.println(rs.getClass().getSimpleName());
		if (rs.getClass().getSimpleName().equals("identifierNode")){
			System.out.println(((identifierNode)rs).idName);
		}*/
        if	(sf == 1){
            this.lsNode = ls;
            this.rsNode = rs;
            this.curOp = null;
            this.curfunc = null;
            curid = null;
        }
        if	(sf == 2){
            this.lsNode = ls;
            this.rsNode = rs;
            this.curOp = null;
            this.curfunc = null;
            curid = null;
        }
        if	(sf == 3){
            this.lsNode = ls;
            this.curid = (identifierNode) rs;
        }
        this.sortOf = sf;
    }
    postExpNode(ExpNode ls,postOpNode rs,int sf){
        this.lsNode = ls;
        this.rsNode = null;
        this.curOp = rs;
        this.curfunc = null;
        curid = null;
        this.sortOf = sf;
    }
    postExpNode(ExpNode ls,funcNameNode rs,int sf){
        this.lsNode = ls;
        this.rsNode = null;
        this.curOp = null;
        this.curfunc = rs;
        curid = null;
        this.sortOf = sf;
    }

    Address buildExp(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope){
        if	(this.sortOf == 3){
            //member of a class

            boolean tlef = table.leftvalue;
            table.leftvalue = false;
            Address lef = this.lsNode.buildExp(quadList,getSize,table,scope);
            table.leftvalue = tlef;

            Symbol id = Symbol.symbol(this.lsNode.calcRes.typeID);
            if (table.get(id).getClass().getSimpleName().equals("keyNode") && ((keyNode)table.get(id)).typeID.equals("string")){
                //string builtin
                System.out.println("dealing with string builtin,empty tmp created.");
                return  new Temp();
            }

            classDefNode cur = (classDefNode) table.get(id);
            String s = this.curid.idName;
            int delta = cur.pos.get(s) * 4;
            //System.out.println(this.curid.idName+delta);

            /*
            System.out.println(cur.lsNode.idName);
            for (int i=0;i<cur.attriName.size();++i)
                System.out.println(((keyNode)cur.attriType.get(i)).typeID+ " " +cur.attriName.get(i));
            */

            Temp ori = new Temp();

            if (table.leftvalue){
                //quadList.add(new ArithmeticExpr(ori,lef,ArithmeticOp.ADD,new IntegerConst(delta)));
                quadList.add(new Assign(ori,lef));
                ori.ever = true;
                ori.simple = false;
                ori.offset = delta;
                return ori;
            }
            else{
                quadList.add(new Load(ori,4,lef,delta));
                for (int i=0;i<cur.attriName.size();++i)
                    if (cur.attriName.get(i).equals(this.curid.idName))
                        if (((keyNode)cur.attriType.get(i)).typeID.equals("string")){
                            ori.isString = true;
                        }
                return ori;
            }
        }

        if	(this.sortOf == 4){
            //builtin function without para

            if	(this.curfunc.funcName.idName.equals("size")){
                boolean tlef = table.leftvalue;
                table.leftvalue = false;
                Address oripo = this.lsNode.buildExp(quadList,getSize,table,scope);
                table.leftvalue = tlef;

                Temp curpo = new Temp();
                quadList.add(new Load(curpo,4,oripo,0));
                //quadList.add(new Load(newpo,4,curpo,0));
                return curpo;
            }

            /*
            identifierNode idd = new identifierNode("");
            keyNode ke = new keyNode();

            if (this.lsNode.getClass().getSimpleName().equals("identifierNode")) {
                idd = (identifierNode) this.lsNode;
                ke = (keyNode) table.get(Symbol.symbol(idd.idName));
            }
            if	(idd.getClass().getSimpleName().equals("strconstNode") || (ke.typeID.equals("string") && this.lsNode.calcRes.depth == 0)){
            */
            if  (true){
                Temp cur = (Temp) this.lsNode.buildExp(quadList,getSize,table,scope);
                Temp tar = new Temp();
                if	(this.curfunc.funcName.idName.equals("length")){
                    List<Address> cp = new ArrayList<Address>();
                    cp.add(cur);
                    quadList.add(new Call(tar,"length",cp));
                    return  tar;
                }
                if	(this.curfunc.funcName.idName.equals("substring")){
                    System.out.println("WARNING WARNING WARNING");
                }
                if	(this.curfunc.funcName.idName.equals("parseInt")){
                    List<Address> cp = new ArrayList<Address>();
                    cp.add(cur);
                    quadList.add(new Call(tar,"parseInt",cp));
                    return  tar;
                }
            }
        }
        if	(this.sortOf == 1){
            //visiting array

            boolean tlef;
            tlef = table.leftvalue;
            table.leftvalue = false;
            Address oripo = this.lsNode.buildExp(quadList,getSize,table,scope);
            table.leftvalue = tlef;

            Temp curpo = new Temp();
            quadList.add(new Assign(curpo,oripo));

            indexExpNode tmp;
            if	(this.rsNode.getClass().getSimpleName().equals("indexExpNode")){
                tmp = (indexExpNode) this.rsNode;
                tlef = table.leftvalue;
                table.leftvalue = false;
                Address jumpSize = (Address) tmp.buildExp(quadList,getSize,table,scope);
                table.leftvalue = tlef;

                Temp np = new Temp();
                quadList.add(new Assign(np,jumpSize));
                jumpSize = np;
                quadList.add(new ArithmeticExpr(jumpSize,jumpSize,ArithmeticOp.ADD,new IntegerConst(1)));

                Temp jumpTo = new Temp();
                quadList.add(new ArithmeticExpr(jumpTo,jumpSize,ArithmeticOp.MUL,new IntegerConst(4)));
                quadList.add(new ArithmeticExpr(jumpTo,curpo,ArithmeticOp.ADD,jumpTo));
                if  (table.leftvalue){
                    //jumpTo.simple = false;
                    jumpTo.ever = true;
                    jumpTo.simple = false;
                    jumpTo.offset = 0;
                    return jumpTo;
                }
                else{
                    Temp newpo = new Temp();
                    newpo.simple = true;
                    newpo.ever = true;
                    quadList.add(new Load(newpo,4,jumpTo,0));
                    return newpo;
                }
            }
            else {
                System.out.println("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
                /*
                arrSufNode cur = (arrSufNode) (this.rsNode);
                while (cur.rsNode.getClass().getSimpleName().equals("arrSufNode")) {
                    tmp = (indexExpNode) cur.lsNode;
                    Address jumpSize = (Address) tmp.buildExp(quadList,getSize,table,scope);
                    Temp jumpTo = new Temp();
                    quadList.add(new ArithmeticExpr(jumpTo,jumpSize,ArithmeticOp.MUL,new IntegerConst(getSize.get(this.lsNode.calcRes.typeID))));
                    quadList.add(new ArithmeticExpr(jumpTo,curpo,ArithmeticOp.ADD,jumpTo));
                    Temp newpo = new Temp();
                    newpo.simple = false;
                    quadList.add(new Load(newpo,4,jumpTo,0));
                    curpo = newpo;
                    cur = (arrSufNode) cur.rsNode;
                }

                tmp = (indexExpNode) cur.lsNode;
                Address jumpSize = (Address) tmp.buildExp(quadList,getSize,table,scope);
                Temp jumpTo = new Temp();
                quadList.add(new ArithmeticExpr(jumpTo,jumpSize,ArithmeticOp.MUL,new IntegerConst(getSize.get(this.lsNode.calcRes.typeID))));
                quadList.add(new ArithmeticExpr(jumpTo,curpo,ArithmeticOp.ADD,jumpTo));
                Temp newpo = new Temp();
                newpo.simple = false;
                quadList.add(new Load(newpo,4,jumpTo,0));
                curpo = newpo;

                tmp = (indexExpNode) cur.rsNode;
                jumpSize = (Address) tmp.buildExp(quadList,getSize,table,scope);
                jumpTo = new Temp();
                quadList.add(new ArithmeticExpr(jumpTo,jumpSize,ArithmeticOp.MUL,new IntegerConst(getSize.get(this.lsNode.calcRes.typeID))));
                quadList.add(new ArithmeticExpr(jumpTo,curpo,ArithmeticOp.ADD,jumpTo));
                if  (table.leftvalue) {
                    //jumpTo.simple = false;
                    return jumpTo;
                }
                else{
                    newpo = new Temp();
                    newpo.simple = false;
                    quadList.add(new Load(newpo,4,jumpTo,0));
                    return newpo;
                }
                */
            }
        }

        if	(this.sortOf == 2){
            //a function

            if	(this.lsNode.getClass().getSimpleName().equals("postExpNode")){
                //String builtin function

                if	(this.lsNode.lsNode.calcRes.typeID.equals("string")){
                    identifierNode tmp = (identifierNode) this.lsNode.rsNode;
                    Temp cs = (Temp) this.lsNode.lsNode.buildExp(quadList,getSize,table,scope);
                    Temp ret = new Temp();
                    List<Address> cp = new ArrayList<Address>();
                    if (tmp.idName.equals("ord") && (!this.rsNode.getClass().getSimpleName().equals("arguListNode")) && this.rsNode.calcRes.typeID.equals("int")){
                        Temp p0 = new Temp();
                        quadList.add(new Assign(p0,this.rsNode.buildExp(quadList,getSize,table,scope)));

                        //ORDER
                        cp.add(p0);cp.add(cs);

                        quadList.add(new Call(ret,"ord",cp));
                        return  ret;
                    }
                    if (tmp.idName.equals("substring") && this.rsNode.getClass().getSimpleName().equals("arguListNode"))
                        if  (this.rsNode.lsNode.calcRes.typeID.equals("int"))
                            if  (!this.rsNode.rsNode.getClass().getSimpleName().equals("arguListNode"))
                                if  (this.rsNode.rsNode.calcRes.typeID.equals("int")){
                                    Temp p0 = new Temp();
                                    quadList.add(new Assign(p0,this.rsNode.lsNode.buildExp(quadList,getSize,table,scope)));
                                    Temp p1 = new Temp();
                                    quadList.add(new Assign(p1,this.rsNode.rsNode.buildExp(quadList,getSize,table,scope)));
                                    cp.add(cs);cp.add(p0);cp.add(p1);
                                    quadList.add(new Call(ret,"substring",cp));
                                    ret.isString = true;
                                    ret.simple = false;
                                    return  ret;
                                }
                    System.out.println("fail to match string builtin func");
                    return	new Temp();
                }
            }

            Symbol func = Symbol.symbol(((identifierNode)this.lsNode).idName);

            funcDefNode cur = (funcDefNode) table.get(func);
            List curpara = new ArrayList();
            if	(this.rsNode != null){
                if	(!this.rsNode.getClass().getSimpleName().equals("arguListNode")){
                    curpara.add(this.rsNode.buildExp(quadList,getSize,table,scope));
                }
                else{
                    arguListNode cura = (arguListNode) this.rsNode;
                    ExpNode tmp = (ExpNode) (cura.lsNode);
                    curpara.add(tmp.buildExp(quadList,getSize,table,scope));
                    while	(cura.rsNode.getClass().getSimpleName().equals("arguListNode")){
                        cura = (arguListNode) cura.rsNode;
                        tmp = (ExpNode) cura.lsNode;
                        curpara.add(tmp.buildExp(quadList,getSize,table,scope));
                    }
                    tmp = (ExpNode) cura.rsNode;
                    curpara.add(tmp.buildExp(quadList,getSize,table,scope));
                }
            }

            Temp ret = new Temp();
            if (cur.funcType.typeID.equals("void")){
                quadList.add(new Call(null,((identifierNode)this.lsNode).idName,curpara));
            }
            else{
                ret.simple = ((Temp) cur.address).simple;
                quadList.add(new Call(ret,((identifierNode)this.lsNode).idName,curpara));
            }
            //System.out.println(cur.funcName.idName);
            ret.isString = ((Temp)cur.address).isString;
            ret.simple = true;
            //ret.simple = ((Temp)cur.address).simple;
            return ret;
        }
        if	(this.curOp != null){
            Temp rig, ret;
            Temp tmp = new Temp();
            if (this.curOp.symbl == 0){
                table.leftvalue = true;
                rig = (Temp) this.lsNode.buildExp(quadList,getSize,table,scope);
                table.leftvalue = false;
                if (rig.ever){
                    quadList.add(new Load(tmp,4,rig,((Temp)rig).offset));
                    ret = new Temp();
                    quadList.add(new Assign(ret,tmp));
                    quadList.add(new ArithmeticExpr(tmp,tmp,ArithmeticOp.ADD,new IntegerConst(1)));
                    quadList.add(new Store(4,rig,tmp,((Temp)rig).offset));
                }
                else{
                    ret = new Temp();
                    quadList.add(new Assign(ret,rig));
                    quadList.add(new ArithmeticExpr(rig,rig,ArithmeticOp.ADD,new IntegerConst(1)));
                }
                return  ret;
            }
            else{
                table.leftvalue = true;
                rig = (Temp) this.lsNode.buildExp(quadList,getSize,table,scope);
                table.leftvalue = false;
                if (rig.ever){
                    quadList.add(new Load(tmp,4,rig,((Temp)rig).offset));
                    ret = new Temp();
                    quadList.add(new Assign(ret,tmp));
                    quadList.add(new ArithmeticExpr(tmp,tmp,ArithmeticOp.SUB,new IntegerConst(1)));
                    quadList.add(new Store(4,rig,tmp,((Temp)rig).offset));
                }
                else{
                    ret = new Temp();
                    quadList.add(new Assign(ret,rig));
                    quadList.add(new ArithmeticExpr(rig,rig,ArithmeticOp.SUB,new IntegerConst(1)));
                }
                return  ret;
            }
        }

        System.out.println("empty tmp created in postExp");
        return new Temp();
    }

    void visit3(mxxTable table,int scope){
        if	(this.sortOf == 3){
            this.lsNode.visit3(table, scope);
            this.ok &= this.lsNode.ok;

            Symbol id = Symbol.symbol(this.lsNode.calcRes.typeID);
            if (table.get(id).getClass().getSimpleName().equals("keyNode") && ((keyNode)table.get(id)).typeID.equals("string")){
                this.rsNode = this.curid;
                this.rsNode.visit3(table, scope);
                return  ;
            }
            if	((table.get(id) == null) ||
                    ((!table.get(id).getClass().getSimpleName().equals("classDefNode")))
                    ) {
                this.ok = 0;
                System.out.println("not a class name");
                return	;
            }

            classDefNode cur = (classDefNode) table.get(id);

            table.beginScope();
            scope++;
            for	(int i=0;i<cur.attriName.size();++i){
                Symbol c = Symbol.symbol((String) cur.attriName.get(i));
                keyNode tmp = (keyNode) cur.attriType.get(i);
                tmp.lvalue = true;
                table.put(c,tmp,scope);
            }

            this.calcRes = new keyNode();
            id = Symbol.symbol(this.curid.idName);
            if	(table.get(id) == null){
                this.ok = 0;
                System.out.println("cannot find attri");
            }
            else{
                if	(table.get(id).getClass().getSimpleName().equals("classDefNode")){
                    this.calcRes.typeID = ((classDefNode) table.get(id)).lsNode.idName;
                    this.calcRes.lvalue = true;
                    this.calcRes.depth = 0;
                }
                else{
                    if	(table.get(id).getClass().getSimpleName().equals("funcDefNode")){
                        this.ok = 0;
                        System.out.println("not an attri name");
                    }
                    else{
                        this.calcRes = (keyNode) table.get(id);
                    }
                }
            }

            scope--;
            table.endScope();
        }
        if	(this.sortOf == 4){
            this.lsNode.visit3(table, scope);
            this.ok &= this.lsNode.ok;
            this.calcRes = new keyNode();
            if	(this.ok == 0)	return	;
            this.ok = 0;
            if	(this.lsNode.calcRes.typeID.equals("string") && this.lsNode.calcRes.depth == 0){
                if	(this.curfunc.funcName.idName.equals("length")){
                    this.calcRes.typeID = "int";
                    this.ok = 1;
                }
                if	(this.curfunc.funcName.idName.equals("substring")){
                    this.calcRes.typeID = "string";
                    this.ok = 1;
                }
                if	(this.curfunc.funcName.idName.equals("parseInt")){
                    this.calcRes.typeID = "int";
                    this.ok = 1;
                }
                if	(this.curfunc.funcName.idName.equals("ord")){
                    this.calcRes.typeID = "int";
                    this.ok = 1;
                }
            }
            if	(this.lsNode.calcRes.depth > 0 && this.curfunc.funcName.idName.equals("size")){
                this.calcRes.typeID = "int";
                this.ok = 1;
            }
            if	(this.ok == 0)	System.out.println("not inbuilt func");
        }
        if	(this.sortOf == 1){
            indexExpNode tmp;
            int dep = 0;
            if	(this.rsNode.getClass().getSimpleName().equals("indexExpNode")){
                tmp = (indexExpNode) this.rsNode;
                if	(tmp.lsNode == null){
                    this.ok = 0;
                    System.out.println("no defined index number");
                }
                else{
                    tmp.lsNode.visit3(table,scope);
                    this.ok&=tmp.lsNode.ok;
                    if	(!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                        this.ok = 0;
                        System.out.println("index number not int");
                    }
                    else	dep = 1;
                }
            }
            else{
                //System.out.println(this.rsNode.getClass().getSimpleName());
                arrSufNode cur = (arrSufNode) (this.rsNode);
                while (cur.rsNode.getClass().getSimpleName().equals("arrSufNode")){
                    tmp = (indexExpNode) cur.lsNode;
                    if (tmp.lsNode != null){
                        tmp.lsNode.visit3(table,scope);
                        this.ok&=tmp.lsNode.ok;
                        if (!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                            this.ok=0;
                            System.out.println("index number not int");
                        }
                    }
                    else{
                        this.ok = 0;
                        System.out.println("lack index");
                    }
                    dep ++;
                    cur = (arrSufNode) cur.rsNode;
                }
                tmp = (indexExpNode) cur.lsNode;
                if (tmp.lsNode != null){
                    tmp.lsNode.visit3(table,scope);
                    this.ok&=tmp.lsNode.ok;
                    if (!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                        this.ok = 0;
                        System.out.println("index number not int");
                    }
                }
                else{
                    this.ok = 0;
                    System.out.println("lack index number");
                }
                dep ++;

                tmp = (indexExpNode) cur.rsNode;
                if (tmp.lsNode != null){
                    tmp.lsNode.visit3(table,scope);
                    this.ok&=tmp.lsNode.ok;
                    if (!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                        this.ok=0;
                        System.out.println("index number not int");
                    }
                }
                else{
                    this.ok = 0;
                    System.out.println("lack index number");
                }
                dep ++;
            }
            this.lsNode.visit3(table, scope);
            this.ok &= this.lsNode.ok;
            if	(dep > this.lsNode.calcRes.depth){
                this.ok = 0;
                System.out.println("dimension not match");
            }
            if	(this.lsNode.calcRes.lvalue == false){
                this.ok = 0;
                System.out.println("not a lvalue");
            }
            this.calcRes = new keyNode();
            this.calcRes.typeID = this.lsNode.calcRes.typeID;
            this.calcRes.depth = this.lsNode.calcRes.depth - dep;
            this.calcRes.lvalue = this.lsNode.calcRes.lvalue;
            return	;
        }
        if	(this.sortOf == 2){
            this.lsNode.visit3(table,scope);
            this.ok &= this.lsNode.ok;
            this.calcRes = new keyNode();
            if	(this.lsNode.getClass().getSimpleName().equals("postExpNode")){
                this.lsNode.visit3(table, scope);
                this.rsNode.visit3(table, scope);
                if	(this.lsNode.lsNode.calcRes.typeID.equals("string")){
                    this.ok = 0;
                    identifierNode tmp = (identifierNode) this.lsNode.rsNode;
                    if (tmp.idName.equals("ord") && (!this.rsNode.getClass().getSimpleName().equals("arguListNode")) && this.rsNode.calcRes.typeID.equals("int")){
                        this.calcRes.typeID = "int";
                        this.ok = 1;
                        return  ;
                    }
                    if (tmp.idName.equals("substring") && this.rsNode.getClass().getSimpleName().equals("arguListNode")){
                        if  (this.rsNode.lsNode.calcRes.typeID.equals("int")){
                            if  (!this.rsNode.rsNode.getClass().getSimpleName().equals("arguListNode")){
                                if  (this.rsNode.rsNode.calcRes.typeID.equals("int")){
                                    this.ok = 1;
                                    this.calcRes.typeID = "string";
                                    return  ;
                                }
                                else{
                                    System.out.println("substring para2 failed");
                                }
                            }
                            else{
                                System.out.println("substring too much para");
                            }
                        }
                        else{
                            System.out.println("substring para1 failed");
                        }
                    }
                    System.out.println("fail to match string builtin func");
                    return	;
                }
            }
            Symbol func = Symbol.symbol(((identifierNode)this.lsNode).idName);
            if	(table.get(func) == null){
                this.ok = 0;
                System.out.println("no such ID found");
                return	;
            }
            if	(!table.get(func).getClass().getSimpleName().equals("funcDefNode")){
                this.ok = 0;
                System.out.println("given ID not a func");
                return	;
            }
            funcDefNode cur = (funcDefNode) table.get(func);
            List curpara = new ArrayList();
            if	(this.rsNode != null){
                if	(!this.rsNode.getClass().getSimpleName().equals("arguListNode")){
                    this.rsNode.visit3(table,scope);
                    this.ok &= this.rsNode.ok;
                    curpara.add(this.rsNode.calcRes);
                }
                else{
                    arguListNode cura = (arguListNode) this.rsNode;
                    ExpNode tmp = (ExpNode) (cura.lsNode);
                    tmp.visit3(table,scope);
                    this.ok &= tmp.ok;
                    curpara.add(tmp.calcRes);
                    while	(cura.rsNode.getClass().getSimpleName().equals("arguListNode")){
                        cura = (arguListNode) cura.rsNode;
                        tmp = (ExpNode) cura.lsNode;
                        tmp.visit3(table,scope);
                        this.ok &= tmp.ok;
                        curpara.add(tmp.calcRes);
                    }
                    tmp = (ExpNode) cura.rsNode;
                    tmp.visit3(table,scope);
                    this.ok &= tmp.ok;
                    curpara.add(tmp.calcRes);
                }
            }
            if	(curpara.size()!=cur.paraType.size()){
                this.ok = 0;
                System.out.println("para number not match");
            }
            else{
                int sz = curpara.size()-1;
                for	(int i=0;i<curpara.size();++i){
                    if	(!((keyNode)curpara.get(i)).typeID.equals(((keyNode)cur.paraType.get(sz-i)).typeID)){
                        this.ok = 0;
                        System.out.println("para type not match "+((keyNode)curpara.get(i)).typeID+" "+((keyNode)cur.paraType.get(sz-i)).typeID);
                    }
                    if	(((keyNode)curpara.get(i)).depth!=((keyNode)cur.paraType.get(sz-i)).depth){
                        this.ok = 0;
                        System.out.println("para depth not match");
                    }
                }
            }
            this.calcRes = new keyNode();
            this.calcRes.typeID = cur.funcType.typeID;
            this.calcRes.depth = 0;
            this.calcRes.lvalue = false;
            return	;
        }
        if	(this.curOp != null){
            this.lsNode.visit3(table,scope);
            this.ok&=this.lsNode.ok;
            this.calcRes = new keyNode();
            if	(!this.lsNode.calcRes.typeID.equals("int")){
                this.ok = 0;
                System.out.println("fail to act ++/--");
            }
            this.calcRes.typeID = this.lsNode.calcRes.typeID;
            return	;
        }
    }
}