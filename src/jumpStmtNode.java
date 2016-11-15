/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class jumpStmtNode extends StmtNode{
    int jumpType;
    ExpNode retExp;
    void visit1(mxxTable table){
        //System.out.println("v1");
        if	(this.retExp != null){
            this.retExp.visit1(table);
            this.ok&=this.retExp.ok;
        }
    }
    void visit2(mxxTable table){
        //System.out.println("v2");
        if	(this.retExp != null){
            this.retExp.visit2(table);
            this.ok&=this.retExp.ok;
        }
    }
    void visit3(mxxTable table,int scope){
        switch (jumpType){
            case 0: case 1:
                if (scope == 0 || table.inloop == 0){
                    this.ok = 0;
                    System.out.println("cannot break/continue");
                }
                break;
            case 2:
                if	(retExp == null && table.curFuncType.typeID.equals("void"))	break;
                retExp.visit3(table,scope);
                this.ok&=this.retExp.ok;
                if (!(this.retExp.calcRes.typeID.equals(table.curFuncType.typeID) && (this.retExp.calcRes.depth == table.curFuncType.depth))){
                    this.ok = 0;
                    System.out.println("exit exp type not match");
                }
                break;
        }
    }
    void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label nexLab){
        switch (jumpType){
            case 0:
                quadList.add(new Jump(table.tocontinue));
                break;
            case 1:
                quadList.add(new Jump(table.tobreak));
                break;
            case 2:
                if (retExp != null){
                    Address ret = retExp.buildExp(quadList,getSize,table,scope);
                    Temp tmp = new Temp();
                    quadList.add(new Assign(tmp,ret));
                    quadList.add(new Return(tmp));
                }
                else quadList.add(new Return());
                break;
        }
    }
}