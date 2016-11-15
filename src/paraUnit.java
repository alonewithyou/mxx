/**
 * Created by Shining on 2016/4/26.
 */

public class paraUnit extends DecNode{
    typeNameNode lsNode;
    identifierNode rsNode;
    paraUnit(typeNameNode ls,identifierNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
    void visit1(mxxTable table){
        //System.out.println("v1");
        if	(this.lsNode != null){
            this.lsNode.visit1(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit1(table);
            this.ok&=this.rsNode.ok;
        }
    }
}