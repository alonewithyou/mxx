import java.util.*;

/**
 * Created by Shining on 2016/4/26.
 */

public class funcDefNode extends DecNode{
    typeNameNode funcType;
    identifierNode funcName;
    DecNode funcPara;
    StmtNode funcStmt;
    List paraName = new ArrayList(), paraType = new ArrayList();
    void visit1(mxxTable table){
        //System.out.println("v1");
        if	(this.funcPara != null){
            this.funcPara.visit1(table);
            this.ok&=this.funcPara.ok;
        }
        if	(this.funcStmt != null){
            this.funcStmt.visit1(table);
            this.ok&=this.funcStmt.ok;
        }
    }
    void visit2(mxxTable table){
        Symbol name = Symbol.symbol(this.funcType.typeID);

        if	(table.get(name) == null){
            this.ok = 0;
            System.out.println("unknown type for funcdef");
            return	;
        }

        //System.out.println("visiting "+this.funcName.idName+" for 2nd time");

        if (this.funcPara != null){
            if (this.funcPara.getClass().getSimpleName().equals("paraUnit")){
                paraUnit tmp = (paraUnit) this.funcPara;
                this.paraName.add(tmp.rsNode.idName);
                if	(tmp.lsNode.getClass().getSimpleName().equals("arrTypeName")){
                    if (((arrTypeName)(tmp.lsNode)).lsNode.idName.equals("void")){
                        this.ok = 0;
                        System.out.println("not void para allowed");
                    }
                    Symbol tmps = Symbol.symbol(((arrTypeName)(tmp.lsNode)).lsNode.idName);
                    if (table.get(tmps) == null){
                        this.ok = 0;
                        System.out.println("unknown type for para");
                    }
                }
                else{
                    if (tmp.lsNode.typeID.equals("void")){
                        this.ok = 0;
                        System.out.println("not void para allowed");
                    }
                    Symbol tmps = Symbol.symbol(tmp.lsNode.typeID);
                    if (table.get(tmps) == null){
                        this.ok = 0;
                        System.out.println("unknown type for para");
                    }
                }
                this.paraType.add(tmp.lsNode.convert());

                //System.out.println("Giving address to "+this.funcName.idName);

                name = Symbol.symbol(this.funcName.idName);
                Temp te = new Temp();
                te.simple = true;
                /*
                if (this.funcType.getClass().getSimpleName().equals("commonTypeName"))
                    if (this.funcType.typeID.equals("int") || this.funcType.typeID.equals("bool") || this.funcType.typeID.equals("void"))   te.simple = true;
                */
                if (this.funcType.getClass().getSimpleName().equals("commonTypeName"))
                    if (this.funcType.typeID.equals("string"))  te.isString = true;
                this.address = te;

                name = Symbol.symbol(this.funcName.idName);
                if (table.get(name) != null){
                    this.ok = 0;
                    System.out.println("repeated def of func");
                }
                else{
                    table.put(name,this,0);
                }
                return	;
            }
            paraList cur = (paraList) this.funcPara;
            while (true){
                paraUnit tmp = (paraUnit) cur.lsNode;
                this.paraName.add(tmp.rsNode.idName);
                if	(tmp.lsNode.getClass().getSimpleName().equals("arrTypeName")){
                    if (((arrTypeName)(tmp.lsNode)).lsNode.idName.equals("void")){
                        this.ok = 0;
                        System.out.println("no void para allowed");
                        break;
                    }
                    Symbol tmps = Symbol.symbol(((arrTypeName)(tmp.lsNode)).lsNode.idName);
                    if (table.get(tmps) == null){
                        this.ok = 0;
                        System.out.println("unknown type for para");
                        break;
                    }
                }
                else{
                    if (tmp.lsNode.typeID.equals("void")){
                        this.ok = 0;
                        System.out.println("no void para allowed");
                        break;
                    }
                    Symbol tmps = Symbol.symbol(tmp.lsNode.typeID);
                    if (table.get(tmps) == null){
                        this.ok = 0;
                        System.out.println("unknown type for para");
                        break;
                    }
                }
                this.paraType.add(tmp.lsNode.convert());
                if (cur.rsNode.getClass().getSimpleName().equals("paraList"))	cur = (paraList) cur.rsNode;
                else{
                    tmp = (paraUnit) cur.rsNode;
                    this.paraName.add(tmp.rsNode.idName);
                    if	(tmp.lsNode.getClass().getSimpleName().equals("arrTypeName")){
                        if (((arrTypeName)(tmp.lsNode)).lsNode.idName.equals("void")){
                            this.ok = 0;
                            System.out.println("no void para allowed");
                            break;
                        }
                        Symbol tmps = Symbol.symbol(((arrTypeName)(tmp.lsNode)).lsNode.idName);
                        if (table.get(tmps) == null){
                            this.ok = 0;
                            System.out.println("unknown type for para");
                            break;
                        }
                    }
                    else{
                        if (tmp.lsNode.typeID.equals("void")){
                            this.ok = 0;
                            System.out.println("no void para allowed");
                            break;
                        }
                        Symbol tmps = Symbol.symbol(tmp.lsNode.typeID);
                        if (table.get(tmps) == null){
                            this.ok = 0;
                            System.out.println("unknown type for para");
                            break;
                        }
                    }
                    this.paraType.add(tmp.lsNode.convert());
                    break;
                }
            }
            for (int i=0;i<this.paraName.size();++i)
                for	(int j=i+1;j<this.paraName.size();++j)
                    if (this.paraName.get(i).equals(this.paraName.get(j))){
                        this.ok = 0;
                        System.out.println("repeated para idname");
                    }
        }

        //System.out.println("Giving address to "+this.funcName.idName);

        name = Symbol.symbol(this.funcName.idName);
        Temp te = new Temp();
        te.simple = true;

        /*
        if (this.funcType.getClass().getSimpleName().equals("commonTypeName"))
            if (this.funcType.typeID.equals("int") || this.funcType.typeID.equals("bool") || this.funcType.typeID.equals("void"))   te.simple = true;
        */

        if (this.funcType.getClass().getSimpleName().equals("commonTypeName"))
            if (this.funcType.typeID.equals("string"))  te.isString = true;
        this.address = te;

        if (table.get(name) != null){
            this.ok = 0;
            System.out.println("repeated def of func");
        }
        else{
            table.put(name,this,0);
        }
    }
    void visit3(mxxTable table,int scope){
        if	(this.funcStmt != null){
            table.curFuncType.typeID = this.funcType.typeID;
            if (this.funcType.getClass().getSimpleName().equals("commonTypeName")){
                table.curFuncType.depth = 0;
            }
            else{
                table.curFuncType.depth = 0;
                indexExpNode cur;
                if (this.funcType.rsNode.getClass().getSimpleName().equals("indexExpNode")){
                    cur = (indexExpNode) this.funcType.rsNode;
                    if (cur.lsNode != null){
                        this.ok = 0;
                        System.out.println("not exact index allowed");
                    }
                }
                else{
                    arrSufNode tmp = (arrSufNode) this.funcType.rsNode;
                    while (tmp.rsNode.getClass().getSimpleName().equals("arrSufNode")){
                        cur = (indexExpNode) tmp.lsNode;
                        if (cur.lsNode != null){
                            this.ok = 0;
                            System.out.println("not exact index allowed");
                        }
                        else	table.curFuncType.depth++;
                        tmp = (arrSufNode) tmp.rsNode;
                    }
                    cur = (indexExpNode) tmp.lsNode;
                    if (cur.lsNode != null){
                        this.ok = 0;
                        System.out.println("not exact index allowed");
                    }
                    else	table.curFuncType.depth++;
                    cur = (indexExpNode) tmp.rsNode;
                    if (cur.lsNode != null){
                        this.ok = 0;
                        System.out.println("not exact index allowed");
                    }
                    else	table.curFuncType.depth++;
                }
            }
            if	(this.ok == 0)	return	;
            table.beginScope();
            scope++;
            for	(int i=0;i<this.paraName.size();++i){
                Symbol c = Symbol.symbol((String) this.paraName.get(i));
                keyNode tmp = (keyNode) this.paraType.get(i);
                tmp.lvalue = true;
                table.put(c,tmp,scope);
            }
            this.funcStmt.visit3(table,scope);
            this.ok&=this.funcStmt.ok;
            scope--;
            table.endScope();
        }
    }
    void buildFunc(Function curFunc,Map<String,Integer> getSize,mxxTable table,int scope){
        table.beginScope();
        scope++;

        curFunc.name = this.funcName.idName;
        curFunc.baseid = Temp.tempCount;

        table.curBase = curFunc.baseid;

        int varl = Temp.tempCount;

        for (int i=0;i<this.paraName.size();++i){
            Symbol c = Symbol.symbol((String) this.paraName.get(i));
            keyNode tmp = (keyNode) this.paraType.get(i);
            tmp.lvalue = true;
            tmp.address = new Temp();
            ((Temp)tmp.address).isString = (tmp.typeID.equals("string"));
            table.put(c,tmp,scope);
            curFunc.args.add(tmp.address);
        }

        /*
        Label t = new Label();
        curFunc.body.add(t);
        */

        if (curFunc.name.equals("main")){
            curFunc.body.addAll(Temp.origins);
        }

        if (this.funcStmt != null)
            this.funcStmt.buildQuad(curFunc.body,getSize,table,scope,null);

        int varr = Temp.tempCount;

        if (curFunc.name.equals("main")){
            curFunc.require = Temp.tempCount;
            curFunc.baseid = 0;
        }
        else
            curFunc.require = varr-varl;

        scope--;
        table.endScope();
    }
}
