/**
 * Created by Shining on 2016/4/27.
 */

public class classDefUnit extends DecNode{
    typeNameNode lsNode;
    identifierNode rsNode;
    classDefUnit(typeNameNode ls,identifierNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
}
