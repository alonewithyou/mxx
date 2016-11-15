import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class boolconstNode extends ExpNode{
    public boolean boolkey;
    boolconstNode(String curkey){
        if (curkey.equals("true")) boolkey = true;
        else boolkey = false;
    }
    void visit3(mxxTable table,int scope){
        this.calcRes = new keyNode();
        this.calcRes.lvalue = false;
        this.calcRes.depth = 0;
        this.calcRes.typeID = "bool";
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table, int scope){
        if (this.boolkey == true)   return  new IntegerConst(1);
        else    return  new IntegerConst(0);
    }
}