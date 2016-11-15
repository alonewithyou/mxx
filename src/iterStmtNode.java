/**
 * Created by Shining on 2016/4/26.
 */

import java.util.*;

public class iterStmtNode extends StmtNode{
    String iterName;
    ExpNode exp1,exp2,exp3;
    void visit3(mxxTable table,int scope){
        //System.out.println("**");
        //System.out.println(this.lsNode.getClass().getSimpleName());
        table.beginScope();
        scope++;
        table.inloop ++;
        this.lsNode.visit3(table,scope);
        table.inloop --;
        scope--;
        table.endScope();
        this.ok&=this.lsNode.ok;
        if (this.iterName.equals("for")){
            if	(this.exp1 != null){
                //System.out.println("~");
                this.exp1.visit3(table,scope);
                this.ok&=this.exp1.ok;
            }
            if	(this.exp2 != null){
                this.exp2.visit3(table,scope);
                this.ok&=this.exp2.ok;
                if (!this.exp2.calcRes.typeID.equals("bool")){
                    this.ok = 0;
                    //System.out.println("for iterator condi not bool "+this.exp2.calcRes.typeID+" instead");
                    //System.out.println(this.exp2.getClass().getSimpleName());
                }
            }
            if	(this.exp3 != null){
                this.exp3.visit3(table,scope);
                this.ok&=this.exp3.ok;
                //System.out.println("exp3 "+this.exp2.getClass().getSimpleName());
            }
        }
        else{
            if	(this.exp1 != null){
                this.exp1.visit3(table,scope);
                this.ok&=this.exp1.ok;
                if (!this.exp1.calcRes.typeID.equals("bool")){
                    this.ok = 0;
                    System.out.println("while iterator condi not bool");
                }
            }
        }
    }
    void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label beginlab){
        if (this.iterName.equals("for")){
            Label forbegin = beginlab,forcondi = new Label(),forbody = new Label(),forend = new Label();
            if (this.exp1 != null){
                quadList.add(forbegin);
                this.exp1.buildExp(quadList,getSize,table,scope);
                quadList.add(new Jump(forcondi));
            }
            else forcondi = beginlab;

            quadList.add(forcondi);
            if (this.exp2 != null){
                Address condi = this.exp2.buildExp(quadList,getSize,table,scope);
                quadList.add(new Br(condi,forbody,forend));
            }
            else    quadList.add(new Jump(forbody));

            quadList.add(forbody);

            table.beginScope();;
            scope++;
            Label lastBreak = table.tobreak, lastContinue = table.tocontinue;

            table.tobreak = forend;
            table.tocontinue = forbody;
            this.lsNode.buildQuad(quadList,getSize,table,scope,null);
            table.tobreak = lastBreak;
            table.tocontinue = lastContinue;

            scope--;
            table.endScope();
            if (this.exp3 != null)  this.exp3.buildExp(quadList,getSize,table,scope);
            quadList.add(new Jump(forcondi));

            quadList.add(forend);
        }
        else{
            Label whilecondi = beginlab, whilebody = new Label(), whileend = new Label();
            quadList.add(whilecondi);
            Address condi = this.exp1.buildExp(quadList,getSize,table,scope);
            quadList.add(new Br(condi,whilebody,whileend));

            quadList.add(whilebody);
            table.beginScope();;
            scope++;

            Label lastBreak = table.tobreak, lastContinue = table.tocontinue;
            table.tobreak = whileend;
            table.tocontinue = whilebody;
            this.lsNode.buildQuad(quadList,getSize,table,scope,null);
            table.tobreak = lastBreak;
            table.tocontinue = lastContinue;

            scope--;
            table.endScope();
            quadList.add(new Jump(whilecondi));

            quadList.add(whileend);
        }
    }
}