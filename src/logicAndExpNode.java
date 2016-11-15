import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class logicAndExpNode extends ExpNode{
    logicAndExpNode(ExpNode ls,ExpNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
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
            System.out.println("too many deps for &&");
        }
        if	(this.rsNode.calcRes.depth > 0){
            this.ok = 0;
            System.out.println("too many deps for &&");
        }
        if	(!this.lsNode.calcRes.typeID.equals("bool")){
            this.ok = 0;
            System.out.println("expecting bool for &&");
        }
        if	(!this.rsNode.calcRes.typeID.equals("bool")){
            this.ok = 0;
            System.out.println("expecting bool for ||");
        }
        this.calcRes = new keyNode();
        this.calcRes.typeID = "bool";
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize,mxxTable table,int scope){
        Temp tmp = new Temp();

        Address lef = this.lsNode.buildExp(quadList,getSize,table,scope);

        Label alreadyfalse = new Label(), needcalc = new Label(), expover = new Label();
        quadList.add(new Br(lef,needcalc,alreadyfalse));

        quadList.add(needcalc);
        Address rig = this.rsNode.buildExp(quadList,getSize,table,scope);
        quadList.add(new Assign(tmp,rig));
        quadList.add(new Jump(expover));

        quadList.add(alreadyfalse);
        quadList.add(new Assign(tmp,new IntegerConst(0)));
        quadList.add(new Jump(expover));

        quadList.add(expover);

        return  tmp;
    }
}
