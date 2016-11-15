/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class assExpressionNode extends ExpNode{
    assExpressionNode(ExpNode ls,ExpNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
        //System.out.println(ls.getClass().getSimpleName());
        //System.out.println(rs.getClass().getSimpleName());
    }
    void visit3(mxxTable table,int scope){
        this.lsNode.visit3(table, scope);
        this.ok &= this.lsNode.ok;
        if	(this.lsNode.calcRes.lvalue == false){
            this.ok = 0;
            //System.out.println(this.lsNode.calcRes.typeID);
            System.out.println("not leftvalue");
        }
        //System.out.println(this.lsNode.getClass().getSimpleName());
        //System.out.println(this.rsNode.getClass().getSimpleName());
        this.rsNode.visit3(table, scope);
        this.ok &= this.rsNode.ok;
        this.calcRes = new keyNode();
        this.calcRes = this.rsNode.calcRes;
        if	(this.rsNode.calcRes.typeID.equals("null")){
            if	(this.lsNode.calcRes.depth == 0 &&
                    (this.lsNode.calcRes.typeID.equals("int") ||
                            this.lsNode.calcRes.typeID.equals("void")||
                            this.lsNode.calcRes.typeID.equals("bool")||
                            this.lsNode.calcRes.typeID.equals("string"))){
                this.ok = 0;
                System.out.println("misuse of null");
            }
        }
        else{
            //System.out.println(this.lsNode.calcRes.typeID+" "+this.rsNode.calcRes.typeID);
            //System.out.println(this.lsNode.calcRes.depth+" "+this.rsNode.calcRes.depth);
            if	(!this.lsNode.calcRes.typeID.equals(this.rsNode.calcRes.typeID)){
                this.ok = 0;
                System.out.println("mismatch type of Assign");
            }
            if	(this.lsNode.calcRes.depth != this.rsNode.calcRes.depth){
                this.ok = 0;
                System.out.println("mismatch dep of Assign");
            }
        }
    }

    Address buildExp(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope){
        table.leftvalue = false;
        Address rig = this.rsNode.buildExp(quadList,getSize,table,scope);

            Temp tmp = new Temp();
            quadList.add(new Assign(tmp,rig));
            rig = tmp;

        table.leftvalue = true;
        Address lef = this.lsNode.buildExp(quadList,getSize,table,scope);
        table.leftvalue = false;

        if (((Temp)lef).ever == false) quadList.add(new Assign(lef,rig));
        else    quadList.add(new Store(4,lef,rig,((Temp)lef).offset));
        ((Temp) lef).isString = ((Temp)rig).isString;
        return  rig;
    }
}