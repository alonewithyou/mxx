public class RelationalExpr extends Quadruple {
    public RelationalOp op;
    public Address dest;
    public Address src1;
    public Address src2;

    void writeload(String tar,Address ori,int baseid,int require){
        if (ori.getClass().getSimpleName().equals("Temp")){
            Temp tmp = (Temp) ori;
            if (tmp.universal){
                System.out.println("lw "+tar+", tmp"+tmp.num);
            }
            else{
                System.out.println("lw "+tar+", "+tmp.calcdis(baseid,require) + "($sp)");
            }
        }
        else{
            System.out.println("li "+tar+", "+((IntegerConst)ori).value);
        }
    }

    void writeStore(String tar,Address ori,int baseid,int require){
        Temp tmp = (Temp) ori;
        if (tmp.universal){
            System.out.println("sw "+tar+", tmp"+tmp.num);
        }
        else{
            System.out.println("sw "+tar+", "+tmp.calcdis(baseid,require) + "($sp)");
        }
    }

    public RelationalExpr() {
        op = null;
        dest = null;
        src1 = null;
        src2 = null;
    }

    public RelationalExpr(Address dest, Address src1, RelationalOp op, Address src2) {
        this.dest = dest;
        this.src1 = src1;
        this.op = op;
        this.src2 = src2;
    }

    public RelationalExpr(Address dest, RelationalOp op, Address src1) {
        this.dest = dest;
        this.op = op;
        this.src1 = src1;
        this.src2 = null;
    }

    public void printMIPS(int baseid,int require){
        String s = "";
        switch (this.op){
            case EQ:s = "seq $t0, $t1, $t2";break;
            case NE:s = "sne $t0, $t1, $t2";break;
            case GT:s = "sgt $t0, $t1, $t2";break;
            case GE:s = "sge $t0, $t1, $t2";break;
            case LT:s = "slt $t0, $t1, $t2";break;
            case LE:s = "sle $t0, $t1, $t2";break;
        }
        writeload("$t1",this.src1,baseid,require);
        writeload("$t2",this.src2,baseid,require);
        System.out.println(s);
        writeStore("$t0",this.dest,baseid,require);
        //System.out.println("sw $t0, "+ ((Temp)this.dest).calcdis(baseid,require) + "($sp)");
    }

    public void print(){
        System.out.print("$tmp"+((Temp)this.dest).num+" = ");
        String s = "";
        switch (this.op){
            case EQ:s = "seq";break;
            case NE:s = "sne";break;
            case GT:s = "sgt";break;
            case GE:s = "sge";break;
            case LT:s = "slt";break;
            case LE:s = "sle";break;
        }
        if (this.src1.getClass().getSimpleName().equals("Temp"))
            System.out.print(s+" $tmp"+((Temp)this.src1).num);
        else
            System.out.print(s+" "+((IntegerConst)this.src1).value);
        if (this.src2.getClass().getSimpleName().equals("Temp"))
            System.out.println(" $tmp"+((Temp)this.src2).num);
        else
            System.out.println(" "+((IntegerConst)this.src2).value);
    }
}
