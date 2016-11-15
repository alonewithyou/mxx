/**
 * Created by Shining on 2016/4/26.
 */

public class arrTypeName extends typeNameNode{
    identifierNode lsNode;
    ExpNode rsNode;
    arrTypeName(identifierNode ls,ExpNode rs){
        this.typeID = ls.idName;
        //System.out.println("create arrtypename " + typeID);
        //if (rs != null) System.out.println("rs occur");
        this.lsNode = ls;
        this.rsNode = rs;
    }
    public keyNode convert(){
        keyNode cur = new keyNode();
        cur.typeID = this.typeID;
        cur.depth = 1;
        ExpNode tmp = this.rsNode;
        while	(tmp.getClass().getSimpleName().equals("arrSufNode")){
            cur.depth++;
            tmp = tmp.rsNode;
        }
        return	cur;
    }
}