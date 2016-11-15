/**
 * Created by Shining on 2016/4/27.
 */

public class classDecList extends DecNode{
    DecNode lsNode,rsNode;
    classDecList(DecNode ls,DecNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
}