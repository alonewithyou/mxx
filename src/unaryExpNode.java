import java.util.List;
import java.util.Map;

/**
 * Created by Shining on 2016/4/26.
 */

public class unaryExpNode extends ExpNode{
    unaryOpNode lsNode;
    unaryExpNode(unaryOpNode ls,ExpNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
    void visit1(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit1(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit1(table);
            this.ok&=this.rsNode.ok;
        }
    }
    void visit2(mxxTable table){
        if	(this.lsNode != null){
            this.lsNode.visit2(table);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit2(table);
            this.ok&=this.rsNode.ok;
        }
    }
    void visit3(mxxTable table,int scope){
        if	(this.rsNode != null){
            this.rsNode.visit3(table, scope);
            this.ok&=this.rsNode.ok;
        }
        this.calcRes = new keyNode();
        this.calcRes.lvalue = false;
        if	(this.ok == 0)	return	;
        switch (this.lsNode.symbl){
            case	'0':
                if	(!this.rsNode.calcRes.typeID.equals("int"))	this.ok = 0;
                if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
                break;
            case	'1':
                if	(!this.rsNode.calcRes.typeID.equals("int"))	this.ok = 0;
                if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
                break;
            case	'2':
                if	(!this.rsNode.calcRes.typeID.equals("int"))	this.ok = 0;
                if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
                break;
            case	'3':
                if	(!this.rsNode.calcRes.typeID.equals("bool"))	this.ok = 0;
                if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
                break;
            case	'4':
                if	(!this.rsNode.calcRes.typeID.equals("int"))	this.ok = 0;
                if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
                break;
            case	'5':
                if	(!this.rsNode.calcRes.typeID.equals("int"))	this.ok = 0;
                if	(this.rsNode.calcRes.depth > 0)	this.ok = 0;
                break;
        }
        if	(this.ok == 0){
            System.out.println("misuse of unary op");
            return	;
        }
        this.calcRes.typeID = this.rsNode.calcRes.typeID;
    }
    Address buildExp(List<Quadruple> quadList, Map<String,Integer> getSize, mxxTable table,int scope){
        Temp tmp = new Temp() ,ret;
        Address rig;
        switch (this.lsNode.symbl) {
            case 0:
                rig = this.rsNode.buildExp(quadList,getSize,table,scope);
                return  rig;
            case 1:
                rig = this.rsNode.buildExp(quadList,getSize,table,scope);
                quadList.add(new ArithmeticExpr(tmp,ArithmeticOp.MINUS,rig));
                return  tmp;
            case 2:
                rig = this.rsNode.buildExp(quadList,getSize,table,scope);
                quadList.add(new ArithmeticExpr(tmp,ArithmeticOp.TILDE,rig));
                return  tmp;
            case 3:
                rig = this.rsNode.buildExp(quadList,getSize,table,scope);
                quadList.add(new ArithmeticExpr(tmp,ArithmeticOp.TILDE,rig));
                return  tmp;
            case 4:
                table.leftvalue = true;
                rig = this.rsNode.buildExp(quadList,getSize,table,scope);
                table.leftvalue = false;
                if (((Temp)rig).ever){
                    quadList.add(new Load(tmp,4,rig,((Temp)rig).offset));
                    quadList.add(new ArithmeticExpr(tmp,tmp,ArithmeticOp.ADD,new IntegerConst(1)));
                    ret = new Temp();
                    quadList.add(new Assign(ret,tmp));
                    quadList.add(new Store(4,rig,tmp,((Temp)rig).offset));
                }
                else{
                    ret = new Temp();
                    quadList.add(new ArithmeticExpr(rig,rig,ArithmeticOp.ADD,new IntegerConst(1)));
                    quadList.add(new Assign(ret,rig));
                }
                return  ret;
            case 5:
                table.leftvalue = true;
                rig = this.rsNode.buildExp(quadList,getSize,table,scope);
                table.leftvalue = false;
                if (((Temp)rig).ever){
                    quadList.add(new Load(tmp,4,rig,((Temp)rig).offset));
                    quadList.add(new ArithmeticExpr(tmp,tmp,ArithmeticOp.SUB,new IntegerConst(1)));
                    ret = new Temp();
                    quadList.add(new Assign(ret,tmp));
                    quadList.add(new Store(4,rig,tmp,((Temp)rig).offset));
                }
                else{
                    ret = new Temp();
                    quadList.add(new ArithmeticExpr(rig,rig,ArithmeticOp.SUB,new IntegerConst(1)));
                    quadList.add(new Assign(ret,rig));
                }
                return  ret;
            default:
                return  tmp;
        }
    }
}