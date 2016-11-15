import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class equalExpNode extends ExpNode{
    int symbl;
    equalExpNode(ExpNode ls,ExpNode rs,int cur){
        this.lsNode = ls;
        this.rsNode = rs;
        this.symbl = cur;
    }
    void visit1(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit1(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit1(table);
            this.ok&=this.rsNode.ok;
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
    }
    void visit3(mxxTable table,int scope){
        if	(this.lsNode != null){
            this.lsNode.visit3(table, scope);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit3(table, scope);
            this.ok&=this.rsNode.ok;
        }
        if	(this.lsNode.calcRes.depth > 0){
            this.ok = 0;
            System.out.println("too many deps =");
        }
        if	(this.rsNode.calcRes.depth > 0){
            this.ok = 0;
            System.out.println("too many deps =");
        }
        if	(this.lsNode.calcRes.typeID.equals("null")){
            keyNode p = this.rsNode.calcRes;
            if	(p.depth == 0 && (p.typeID.equals("int") || p.typeID.equals("void")
                    ||	 p.typeID.equals("bool") || p.typeID.equals("string"))){
                this.ok = 0;
                System.out.println("fail for null =");
            }
            this.calcRes = new keyNode();
            this.calcRes.typeID = "bool";
            return	;
        }
        if	(this.rsNode.calcRes.typeID.equals("null")){
            keyNode p = this.lsNode.calcRes;
            if	(p.depth == 0 && (p.typeID.equals("int") || p.typeID.equals("void")
                    ||	 p.typeID.equals("bool") || p.typeID.equals("string"))){
                this.ok = 0;
                System.out.println("fail for null =");
            }
            this.calcRes = new keyNode();
            this.calcRes.typeID = "bool";
            return	;
        }
        if	(!this.lsNode.calcRes.typeID.equals(this.rsNode.calcRes.typeID)){
            this.ok = 0;
            System.out.println("cannot match =");
        }
        this.calcRes = new keyNode();
        this.calcRes.typeID = "bool";
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize,mxxTable table,int scope){
        Address lef = this.lsNode.buildExp(quadList,getSize,table,scope), rig = this.rsNode.buildExp(quadList,getSize,table,scope);
        if (lef.getClass().getSimpleName().equals("Temp")){
            Temp tlef = (Temp) lef;
            if (tlef.isString){
                Temp ret = new Temp();
                ret.isString = true;
                List<Address> cp = new ArrayList<Address>();
                cp.add(lef);cp.add(rig);
                if (this.symbl == 0) quadList.add(new Call(ret,"stringequ",cp));
                else    quadList.add(new Call(ret,"stringneq",cp));
                return ret;
            }
        }
        Temp tmp = new Temp();
        if (this.symbl == 0)
            quadList.add(new RelationalExpr(tmp,lef,RelationalOp.EQ,rig));
        else
            quadList.add(new RelationalExpr(tmp,lef,RelationalOp.NE,rig));
        return  tmp;
    }
}