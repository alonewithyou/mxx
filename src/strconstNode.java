import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class strconstNode extends identifierNode{
    public String strkey;
    public strconstNode(String currentkey){
        super(currentkey);
        this.strkey = currentkey;
    }
    void visit3(mxxTable table,int scope){
        this.calcRes = new keyNode();
        this.calcRes.lvalue = false;
        this.calcRes.depth = 0;
        this.calcRes.typeID = "string";
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table, int scope) {
        Temp ret = new Temp();
        ret.simple = false;
        ret.isString = true;
        ret.value = strkey;
        ret.strconst = true;
        ret.universal = true;
        Temp.strConst.put(ret,strkey);
        return ret;
    }
}