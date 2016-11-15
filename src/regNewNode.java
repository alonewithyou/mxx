/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class regNewNode extends ExpNode{
    typeNameNode lsNode;
    regNewNode(typeNameNode ls){
        this.lsNode = ls;
    }
    void visit1(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit1(table);
            this.ok&=this.lsNode.ok;
        }
    }
    void visit2(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit2(table);
            this.ok&=this.lsNode.ok;
        }
    }
    void visit3(mxxTable table,int scope){
        Symbol name = Symbol.symbol(this.lsNode.typeID);
        if (table.get(name) == null){
            this.ok = 0;
            System.out.println("new undefined type");
            return	;
        }
        this.calcRes = new keyNode();
        this.calcRes.typeID = this.lsNode.typeID;
        this.calcRes.lvalue = false;
        this.calcRes.depth = 0;
        if (!this.lsNode.getClass().getSimpleName().equals("commonTypeName")){
            if (((arrTypeName)this.lsNode).rsNode.getClass().getSimpleName().equals("indexExpNode")){
                this.calcRes.depth++;
                return	;
            }
            boolean everEmpty = false;
            arrSufNode cur = (arrSufNode) ((arrTypeName)this.lsNode).rsNode;
            indexExpNode tmp;
            while (cur.rsNode.getClass().getSimpleName().equals("arrSufNode")){
                tmp = (indexExpNode) cur.lsNode;
                if (tmp.lsNode != null){
                    if (everEmpty){
                        this.ok = 0;
                        System.out.println("nonempty index after empty");
                    }
                    tmp.lsNode.visit3(table,scope);
                    this.ok&=tmp.lsNode.ok;
                    if (!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                        this.ok=0;
                        System.out.println("index number not int");
                    }
                }
                else	everEmpty = true;
                this.calcRes.depth++;
                cur = (arrSufNode) cur.rsNode;
            }
            tmp = (indexExpNode) cur.lsNode;
            if (tmp.lsNode != null){
                if (everEmpty){
                    this.ok = 0;
                    System.out.println("nonempty index after empty");
                }
                tmp.lsNode.visit3(table,scope);
                this.ok&=tmp.lsNode.ok;
                if (!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                    this.ok=0;
                    System.out.println("index number not int");
                }
            }
            else	everEmpty = true;
            this.calcRes.depth++;

            tmp = (indexExpNode) cur.rsNode;
            if (tmp.lsNode != null){
                if (everEmpty){
                    this.ok = 0;
                    System.out.println("nonempty index after empty");
                }
                tmp.lsNode.visit3(table,scope);
                this.ok&=tmp.lsNode.ok;
                if (!((ExpNode)tmp.lsNode).calcRes.typeID.equals("int")){
                    this.ok=0;
                    System.out.println("index number not int");
                }
            }
            else	everEmpty = true;
            this.calcRes.depth++;
        }
    }
    Address buildExp(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope){
        if (this.lsNode.getClass().getSimpleName().equals("commonTypeName")){
            Temp tmp = new Temp();
            Symbol type = Symbol.symbol(this.lsNode.typeID);
            if (!getSize.containsKey(this.lsNode.typeID)){
                getSize.put(this.lsNode.typeID,table.get(type).numOfVar*4);
            }
            quadList.add(new Alloc(tmp,new IntegerConst(getSize.get(this.lsNode.typeID))));
            return tmp;
        }
        else{
            Temp tmp = new Temp();
            arrTypeName name = (arrTypeName) this.lsNode;
            Symbol type = Symbol.symbol(name.typeID);
            if (!getSize.containsKey(name.typeID)){
                getSize.put(name.typeID,table.get(type).numOfVar*4);
            }
            int unitSize = getSize.get(name.typeID);
            indexExpNode cur;
            //System.out.println(name.rsNode.getClass().getSimpleName());
            if (name.rsNode.getClass().getSimpleName().equals("arrSufNode")) cur = (indexExpNode) (((arrSufNode)name.rsNode).lsNode);
            else    cur = (indexExpNode) (name.rsNode);
            ExpNode curr = (ExpNode) cur.lsNode;
            Address index = curr.buildExp(quadList,getSize,table,scope);
            Temp size = new Temp();
            quadList.add(new Assign(size,index));
            quadList.add(new ArithmeticExpr(size,size,ArithmeticOp.ADD,new IntegerConst(1)));
            quadList.add(new ArithmeticExpr(tmp,new IntegerConst(4),ArithmeticOp.MUL,size));
            Temp tmp2 = new Temp();
            quadList.add(new Alloc(tmp2,tmp));
            Temp indext = new Temp();
            quadList.add(new Assign(indext,index));
            quadList.add(new Store(4,tmp2,indext,0));
            return  tmp2;
        }
    }
}