import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class relaExpNode extends ExpNode{
    int symbl;
    relaExpNode(ExpNode ls,ExpNode rs,int cur){
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
            System.out.println("too many deps for rela");
        }
        if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
        if	(!this.lsNode.calcRes.typeID.equals(this.rsNode.calcRes.typeID)){
            this.ok = 0;
            System.out.println("dif type for rela");
        }
        if	(!((this.lsNode.calcRes.typeID.equals("int")) || (this.lsNode.calcRes.typeID.equals("string")))){
            this.ok = 0;
            System.out.println("cannot match rela");
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
                if (this.symbl == 0)    quadList.add(new Call(ret,"stringless",cp));
                if (this.symbl == 1)    quadList.add(new Call(ret,"stringlarge",cp));
                return ret;
            }
        }
        Temp tmp = new Temp();
        if (this.symbl == 0)
            quadList.add(new RelationalExpr(tmp,lef,RelationalOp.LT,rig));
        if (this.symbl == 1)
            quadList.add(new RelationalExpr(tmp,lef,RelationalOp.GT,rig));
        if (this.symbl == 2)
            quadList.add(new RelationalExpr(tmp,lef,RelationalOp.LE,rig));
        if (this.symbl == 3)
            quadList.add(new RelationalExpr(tmp,lef,RelationalOp.GE,rig));
        return  tmp;
    }
}