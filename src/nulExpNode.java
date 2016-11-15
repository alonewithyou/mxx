import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class nulExpNode extends ExpNode{
    nulExpNode(){}
    void visit3(mxxTable table,int scope){
        this.calcRes = new keyNode();
        this.calcRes.typeID = "null";
        return	;
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table, int scope){
        return new IntegerConst(0);
    }
}