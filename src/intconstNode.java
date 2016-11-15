import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class intconstNode extends ExpNode{
    public int intkey;
    intconstNode(int currentkey){
        this.intkey = currentkey;
    }
    void visit3(mxxTable table,int scope){
        this.calcRes = new keyNode();
        this.calcRes.lvalue = false;
        this.calcRes.depth = 0;
        this.calcRes.typeID = "int";
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table, int scope) {
        return new IntegerConst(intkey);
    }
}
