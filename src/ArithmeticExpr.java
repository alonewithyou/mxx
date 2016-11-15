public class ArithmeticExpr extends Quadruple {
    public ArithmeticOp op;
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

    public ArithmeticExpr() {
        op = null;
        dest = null;
        src1 = null;
        src2 = null;
    }

    public ArithmeticExpr(Address dest, Address src1, ArithmeticOp op, Address src2) {
        this.dest = dest;
        this.src1 = src1;
        this.op = op;
        this.src2 = src2;
    }

    public ArithmeticExpr(Address dest, ArithmeticOp op, Address src1) {
        this.dest = dest;
        this.op = op;
        this.src1 = src1;
        this.src2 = null;
    }

    private void printdoubleMIPS(int baseid,int require){
        String s = "";
        switch (this.op){
            case ADD:s = "add $t0, ";break;
            case SUB:s = "sub $t0, ";break;
            case MUL:s = "mul $t0, ";break;
            case DIV:s = "div $t0, ";break;
            case MOD:s = "rem $t0, ";break;
            case SHL:s = "sll $t0, ";break;
            case SHR:s = "srl $t0, ";break;
            case AND:s = "and $t0, ";break;
            case OR:s = "or $t0, ";break;
            case XOR:s = "xor $t0, ";break;
            case MINUS:s = "sub $t0, $zero, $t1";break;
            case TILDE:s = "li $t2, 1\nsub $t0, $t2, $t1";break;
        }
        if ((this.op != ArithmeticOp.MINUS) && (this.op != ArithmeticOp.TILDE)){
            s = s + "$t1, $t2";
        }
        writeload("$t1",this.src1,baseid,require);
        if (this.src2!=null) writeload("$t2",this.src2,baseid,require);
        /*
        if (this.src1.getClass().getSimpleName().equals("Temp")){
            System.out.println("lw $t1, "+ ((Temp)this.src1).calcdis(baseid,require) + "($sp)");
        }
        else
            System.out.println("li $t1, "+((IntegerConst)this.src1).value);
        if (this.src2 != null){
            if (this.src2.getClass().getSimpleName().equals("Temp"))
                System.out.println("lw $t2, "+ ((Temp)this.src2).calcdis(baseid,require) + "($sp)");
            else
                System.out.println("li $t2, "+((IntegerConst)this.src2).value);
        }
        */
        System.out.println(s);
        writeStore("$t0",this.dest,baseid,require);
        //System.out.println("sw $t0, "+ ((Temp)this.dest).calcdis(baseid,require) + "($sp)");
    }

    public void printMIPS(int baseid,int require){
        if ((this.src2 != null) || (this.op == ArithmeticOp.TILDE) || (this.op == ArithmeticOp.MINUS)){
            printdoubleMIPS(baseid,require);
            return	;
        }
        String s = "";
        switch (this.op){
            case ADD:s = s + "add $t0, $t1, 1";break;
            case SUB:s = s + "sub $t0, $t1, 1";break;
        }
        writeload("$t1",this.src1,baseid,require);
        /*
        if (this.src1.getClass().getSimpleName().equals("Temp")){
            System.out.println("lw $t1, "+ ((Temp)this.src1).calcdis(baseid,require) + "($sp)");
        }
        else
            System.out.println("li $t1, "+((IntegerConst)this.src1).value);
        */
        System.out.println(s);
        writeStore("$t0",this.dest,baseid,require);
        //System.out.println("sw $t0, "+ ((Temp)this.dest).calcdis(baseid,require) + "($sp)");
    }
	
	private void printdouble(){
		System.out.print("$tmp"+((Temp)this.dest).num+" = ");
        String s = "";
        switch (this.op){
            case ADD:s = "add";break;
            case SUB:s = "sub";break;
            case MUL:s = "mul";break;
            case DIV:s = "div";break;
            case MOD:s = "rem";break;
            case SHL:s = "shl";break;
            case SHR:s = "shr";break;
            case AND:s = "and";break;
            case OR:s = "or";break;
            case XOR:s = "xor";break;
            case MINUS:s = "neg";break;
            case TILDE:s = "not";break;
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

    public void print(){
		if (this.src2 != null){
			printdouble();
			return	;
		}
		String s = "$tmp"+((Temp)this.dest).num+" = ";
        switch (this.op){
            case ADD:s = s + "add";break;
            case SUB:s = s + "sub";break;
            case MINUS:s = s + "neg";break;
            case TILDE:s = s + "not";break;
        }
        if (this.src1.getClass().getSimpleName().equals("Temp"))
            s = s + " $tmp"+((Temp)this.src1).num;
        else
            s = s + " " +((IntegerConst)this.src1).value;
		switch (this.op){
            case ADD:s = s + " 1";break;
            case SUB:s = s + " 1";break;
            case MINUS:case TILDE:break;
        }
		System.out.println(s);
    }
}
