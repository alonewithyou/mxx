/**
 * Created by Shining on 2016/4/26.
 */

public class unaryOpNode extends ASTNode{
    int symbl;
    unaryOpNode(char ope){
        switch	(ope){
            case	'+':this.symbl=0;break;
            case	'-':this.symbl=1;break;
            case	'~':this.symbl=2;break;
            case	'!':this.symbl=3;break;
            case	'a':this.symbl=4;break;
            case	'd':this.symbl=5;break;
        }
    }
}