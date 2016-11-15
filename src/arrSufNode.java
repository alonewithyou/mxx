/**
 * Created by Shining on 2016/4/26.
 */

public class arrSufNode extends ExpNode{
    ExpNode lsNode,rsNode;
    arrSufNode(ExpNode ls,ExpNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
}