/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class blockListNode extends StmtNode{
    blockListNode(StmtNode ls,StmtNode rs){
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
            this.lsNode.visit3(table,scope);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit3(table,scope);
            this.ok&=this.rsNode.ok;
        }
    }

    void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label nexlab){
        String s = this.rsNode.getClass().getSimpleName();
        String p = this.lsNode.getClass().getSimpleName();
        Label mrk;
        if  (p.equals("selectStmtNode") || p.equals("iterStmtNode")){
            mrk = new Label();
            quadList.add(new Jump(mrk));
            this.lsNode.buildQuad(quadList,getSize,table,scope,mrk);
        }
        else
            this.lsNode.buildQuad(quadList,getSize,table,scope,null);
        if  (s.equals("selectStmtNode") || s.equals("iterStmtNode")){
            mrk = new Label();
            quadList.add(new Jump(mrk));
            this.rsNode.buildQuad(quadList,getSize,table,scope,mrk);
        }
        else
            this.rsNode.buildQuad(quadList,getSize,table,scope,null);
    }
}