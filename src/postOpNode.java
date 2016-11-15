/**
 * Created by Shining on 2016/4/26.
 */

public class postOpNode extends ASTNode{
    int symbl;
    postOpNode(char ope){
        switch	(ope){
            case	'+':this.symbl=0;break;
            case	'-':this.symbl=1;break;
        }
    }
}
