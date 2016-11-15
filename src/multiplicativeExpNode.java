import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class multiplicativeExpNode extends ExpNode{
    int symbl;
    multiplicativeExpNode(ExpNode ls,ExpNode rs,int cur){
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
        if	(!this.lsNode.calcRes.typeID.equals("int")){
            this.ok = 0;
            System.out.println("expecting int to operate*/");
        }
        if	(this.lsNode.calcRes.depth > 0)	this.ok = 0;
        if	(!this.rsNode.calcRes.typeID.equals("int")){
            this.ok = 0;
            System.out.println("expecting int to operate*/");
        }
        if	(this.rsNode.calcRes.depth > 0){
            this.ok = 0;
            System.out.println("too many deps*/");
        }
        this.calcRes = new keyNode();
        this.calcRes.typeID = "int";
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize,mxxTable table,int scope){
        Address lef = this.lsNode.buildExp(quadList,getSize,table,scope), rig = this.rsNode.buildExp(quadList,getSize,table,scope);
        Temp tmp = new Temp();
        if (this.symbl == 0)
            quadList.add(new ArithmeticExpr(tmp,lef,ArithmeticOp.MUL,rig));
        if (this.symbl == 1)
            quadList.add(new ArithmeticExpr(tmp,lef,ArithmeticOp.DIV,rig));
        if (this.symbl == 2)
            quadList.add(new ArithmeticExpr(tmp,lef,ArithmeticOp.MOD,rig));
        return  tmp;
    }
}