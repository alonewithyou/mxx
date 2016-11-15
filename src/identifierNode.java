/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class identifierNode extends ExpNode{
    String idName;
    identifierNode(String curID){
        this.idName = curID;
    }
    void visit3(mxxTable table,int scope){
        Symbol c = Symbol.symbol(this.idName);
        this.calcRes = new keyNode();
        if	(table.get(c) == null){
            this.ok = 0;
            System.out.println("undefined ID");
        }
        else{
            if (table.get(c).getClass().getSimpleName().equals("keyNode"))
                this.calcRes = (keyNode) table.get(c);
            else
                this.calcRes.typeID = ((funcDefNode) table.get(c)).funcName.idName;
            //System.out.println(this.calcRes.typeID+" "+this.calcRes.lvalue);
        }
        return	;
    }
    Address buildExp(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope){
        return table.get(Symbol.symbol(this.idName)).address;
    }
}