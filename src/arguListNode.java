/**
 * Created by Shining on 2016/4/26.
 */

public class arguListNode extends ExpNode{
    arguListNode(ExpNode ls,ExpNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
    void visit3(mxxTable table,int scope){
        this.lsNode.visit3(table,scope);
        this.rsNode.visit3(table,scope);
        this.ok = 1;
    }
    arguListNode(){}
}