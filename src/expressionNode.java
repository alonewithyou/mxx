import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class expressionNode extends ExpNode{
    expressionNode(ExpNode ls,ExpNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
    void visit3(mxxTable table,int scope){
        this.lsNode.visit3(table,scope);
        this.ok&=this.lsNode.ok;
        this.rsNode.visit3(table,scope);
        this.ok&=this.rsNode.ok;
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table, int scope){
        this.lsNode.buildExp(quadList,getSize,table,scope);
        return this.rsNode.buildExp(quadList,getSize,table,scope);
    }
}