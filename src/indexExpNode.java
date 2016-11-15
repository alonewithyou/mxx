import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */
public class indexExpNode extends ExpNode{
    indexExpNode(){}
    indexExpNode(ExpNode exp1){
        this.lsNode = exp1;
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table,int scope){
        return  this.lsNode.buildExp(quadList,getSize,table,scope);
    }
}