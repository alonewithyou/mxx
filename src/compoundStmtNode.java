import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class compoundStmtNode extends StmtNode{
    doubleBrace rsNode;
    compoundStmtNode(StmtNode ls,doubleBrace rs){
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
        table.beginScope();
        scope++;
        if (this.lsNode != null){
            this.lsNode.visit3(table, scope);
            this.ok&=this.lsNode.ok;
        }
        if (this.rsNode != null){
            this.rsNode.visit3(table, scope);
            this.ok&=this.rsNode.ok;
        }
        scope--;
        table.endScope();
    }
    void buildQuad(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table, int scope,Label nexlab){
        table.beginScope();
        scope++;
        if (this.lsNode != null) this.lsNode.buildQuad(quadList,getSize,table,scope,nexlab);
        if (this.rsNode != null) this.rsNode.buildQuad(quadList,getSize,table,scope,nexlab);
        scope--;
        table.endScope();
    }
}