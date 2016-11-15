import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */
public class exdeclareNode extends DecNode{
    typeNameNode lsNode;
    identifierNode rsNode;
    ExpNode oriKey;
    boolean visited = false;
    exdeclareNode(){}
    void visit1(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit1(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit1(table);
            this.ok&=this.rsNode.ok;
        }
        if	(this.oriKey != null){
            this.oriKey.visit1(table);
            this.ok&=this.oriKey.ok;
        }
    }
    void visit2(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit2(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit2(table);
            this.ok&=this.rsNode.ok;
        }
        if	(this.oriKey != null){
            this.oriKey.visit2(table);
            this.ok&=this.oriKey.ok;
        }
    }
    void visit3(mxxTable table,int scope){
        Symbol name;
        name = Symbol.symbol(this.rsNode.idName);
        if (table.get(name) != null){
            this.ok = 0;
            System.out.println("repeated var def");
            return	;
        }
        name = Symbol.symbol(this.lsNode.typeID);
        if (table.get(name) == null){
            this.ok = 0;
            System.out.println("unknown type defing var");
            return	;
        }

        keyNode todef = new keyNode();
        todef.lvalue = true;
        todef.typeID = this.lsNode.typeID;
        todef.depth = 0;
        if (!this.lsNode.getClass().getSimpleName().equals("commonTypeName")){
            todef.depth = 0;
            indexExpNode cur;
            arrTypeName p = (arrTypeName) this.lsNode;
            if (p.rsNode.getClass().getSimpleName().equals("indexExpNode")){
                cur = (indexExpNode) p.rsNode;
                if (cur.lsNode != null){
                    this.ok = 0;
                    System.out.println("no exact index allowed");
                }
                else	todef.depth++;
            }
            else{
                arrSufNode tmp = (arrSufNode) ((arrTypeName)this.lsNode).rsNode;
                while (tmp.rsNode.getClass().getSimpleName().equals("arrSufNode")){
                    cur = (indexExpNode) tmp.lsNode;
                    if (cur.lsNode != null){
                        this.ok = 0;
                        System.out.println("no exact index allowed");
                    }
                    else	todef.depth++;
                    tmp = (arrSufNode) tmp.rsNode;
                }
                cur = (indexExpNode) tmp.lsNode;
                if (cur.lsNode != null){
                    this.ok = 0;
                    System.out.println("no exact index allowed");
                }
                else	todef.depth++;
                cur = (indexExpNode) tmp.rsNode;
                if (cur.lsNode != null){
                    this.ok = 0;
                    System.out.println("no exact index allowed");
                }
                else	todef.depth++;
            }
        }
        name = Symbol.symbol(this.rsNode.idName);
        table.put(name,todef,scope);
        if (this.oriKey != null){
            this.oriKey.visit3(table, scope);
            this.ok&=this.oriKey.ok;
            if	(this.oriKey.calcRes.typeID.equals("null")){
                keyNode p = todef;
                if	(p.depth == 0){
                    if	(p.typeID.equals("int") || p.typeID.equals("void")
                            ||	 p.typeID.equals("bool") || p.typeID.equals("string")){
                        this.ok = 0;
                        System.out.println("fail to ass null");
                    }
                }
            }
            else{
                //System.out.println(todef.typeID);
                //System.out.println(todef.depth);
                //System.out.println(this.oriKey.getClass().getSimpleName());
                //System.out.println(this.oriKey.calcRes.typeID);
                //System.out.println(this.oriKey.calcRes.depth);
                if	(!(this.oriKey.calcRes.typeID.equals(todef.typeID) && (this.oriKey.calcRes.depth == todef.depth))){
                    this.ok = 0;
                    System.out.println("origin key not match");
                }
            }
        }
    }
    void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label nexlab){
        //System.out.println("defing");
        if (visited)    return  ;
        visited = true;

        keyNode todef = new keyNode();
        todef.lvalue = true;
        todef.typeID = this.lsNode.typeID;
        todef.depth = 0;
        Temp ttmp = new Temp();
        if (!this.lsNode.getClass().getSimpleName().equals("commonTypeName")){
            todef.depth = 0;
            arrTypeName p = (arrTypeName) this.lsNode;
            indexExpNode cur;
            if (p.rsNode.getClass().getSimpleName().equals("indexExpNode")){
                cur = (indexExpNode) p.rsNode;
                todef.depth++;
            }
            else{
                arrSufNode tmp = (arrSufNode) ((arrTypeName)this.lsNode).rsNode;
                while (tmp.rsNode.getClass().getSimpleName().equals("arrSufNode")) {
                    cur = (indexExpNode) tmp.lsNode;
                    todef.depth++;
                    tmp = (arrSufNode) tmp.rsNode;
                }
                todef.depth++;
                todef.depth++;
            }
        }
        ttmp.simple = true;
        if (todef.typeID.equals("string")){
            ttmp.isString = true;
        }

        ttmp.universal = true;
        Temp.univerVar.add(ttmp);

        todef.address = ttmp;

        Symbol name = Symbol.symbol(this.rsNode.idName);
        table.put(name,todef,scope);

        Address curVar = table.get(name).address;

        if ((this.oriKey != null)) {
            Address rig = this.oriKey.buildExp(quadList, getSize, table,scope);
            quadList.add(new Assign(curVar, rig));
        }
    }
}