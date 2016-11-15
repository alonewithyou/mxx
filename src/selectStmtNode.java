/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class selectStmtNode extends StmtNode{
    ExpNode condition;
    StmtNode lsNode,rsNode;
    void visit1(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit1(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit1(table);
            this.ok&=this.rsNode.ok;
        }
        if	(this.condition != null){
            this.condition.visit1(table);
            this.ok&=this.condition.ok;
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
        if	(this.condition != null){
            this.condition.visit2(table);
            this.ok&=this.condition.ok;
        }
    }
    void visit3(mxxTable table,int scope){
        if	(this.lsNode != null){
            table.beginScope();
            scope++;
            this.lsNode.visit3(table,scope);
            this.ok&=this.lsNode.ok;
            scope--;
            table.endScope();
        }
        if	(this.rsNode != null){
            table.beginScope();
            scope++;
            this.rsNode.visit3(table,scope);
            this.ok&=this.rsNode.ok;
            scope--;
            table.endScope();
        }
        if	(this.condition != null){
            this.condition.visit3(table,scope);
            this.ok&=this.condition.ok;
            if (!this.condition.calcRes.typeID.equals("bool")){
                this.ok = 0;
                System.out.println("condi not a bool exp");
            }
        }
    }
    void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label beginlab){
        Label condLab = beginlab;
        quadList.add(condLab);
        Address condi = this.condition.buildExp(quadList,getSize,table,scope);
        Label truelab = new Label(),falselab = new Label(), nexLab = new Label();
        quadList.add(new Br(condi,truelab,falselab));

        quadList.add(truelab);
        List<Quadruple> cur = new ArrayList();
        if (this.lsNode != null){
            table.beginScope();
            scope++;
            this.lsNode.buildQuad(cur,getSize,table,scope,null);
            scope--;
            table.endScope();
        }
        quadList.addAll(cur);
        quadList.add(new Jump(nexLab));

        quadList.add(falselab);
        cur = new ArrayList();
        if (this.rsNode != null){
            table.beginScope();
            scope++;
            this.rsNode.buildQuad(cur,getSize,table,scope,null);
            scope--;
            table.endScope();
        }
        quadList.addAll(cur);
        quadList.add(new Jump(nexLab));
        quadList.add(nexLab);
    }

}