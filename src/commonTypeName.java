/**
 * Created by Shining on 2016/4/26.
 */

public class commonTypeName extends typeNameNode{
    commonTypeName(String cur){
        this.typeID = cur;
    }
    public keyNode convert(){
        keyNode cur = new keyNode();
        cur.typeID = this.typeID;
        cur.depth = 0;
        return	cur;
    }
}
