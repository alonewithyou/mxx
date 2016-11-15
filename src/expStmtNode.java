/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class expStmtNode extends StmtNode{
    ExpNode lsNode;
    semiMark rsNode;
    expStmtNode(ExpNode ls,semiMark rs){
        this.lsNode = ls;
        this.rsNode = rs;
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
        if	(this.lsNode != null){
            this.lsNode.visit3(table, scope);
            this.ok&=this.lsNode.ok;
        }
    }
    void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label nexlab){
        //System.out.println(this.lsNode.getClass().getSimpleName());
        this.lsNode.buildExp(quadList,getSize,table,scope);
    }
}