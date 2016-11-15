import java.util.*;

public class Function {
    public String name;
    public int size;
	public int require = 0;
    public int baseid;
    public List<Address> args;
    public List<Quadruple> body;

    public Function() {
        name = null; 
        size = 0;
        args = new LinkedList<Address>();
        body = new LinkedList<Quadruple>();
    }

    void writeload(String tar,Address ori){
        if (ori.getClass().getSimpleName().equals("Temp")){
            Temp tmp = (Temp) ori;
            if (tmp.universal){
                if (!tmp.strconst)
                    System.out.println("lw "+tar+", tmp"+tmp.num);
                else
                    System.out.println("la "+tar+", tmp"+tmp.num);
            }
            else{
                System.out.println("lw "+tar+", "+tmp.calcdis(baseid,require) + "($sp)");
            }
        }
        else{
            System.out.println("li "+tar+", "+((IntegerConst)ori).value);
        }
    }

    void writeStore(String tar,Address ori){
        Temp tmp = (Temp) ori;
        if (tmp.universal){
            System.out.println("sw "+tar+", tmp"+tmp.num);
        }
        else{
            System.out.println("sw "+tar+", "+tmp.calcdis(baseid,require) + "($sp)");
        }
    }

    public void printMIPS(Map<String,Function> table){
        if (!name.equals("main"))   System.out.println(name+"31:");
        else    System.out.println(name+":");
        if  (name.equals("main")){
            System.out.println("sub $sp, $sp, "+(require + 40) * 4);
        }
        for (int i=0;i<body.size();++i){
            if (body.get(i) == null)    continue;
            String type = body.get(i).getClass().getSimpleName();
            if (type.equals("Call")){
                Call cur = (Call) body.get(i);
                String nam = cur.callee;
                Address ttt;

                if (nam.equals("toString")){
                    ttt = cur.paras.get(0);
                    writeload("$a0",ttt);
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__toString");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("println")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__println");
                    System.out.println("lw $ra, 144($sp)");
                    continue;
                }

                if (nam.equals("print")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__print");
                    System.out.println("lw $ra, 144($sp)");
                    continue;
                }

                if (nam.equals("getString")){
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__getString");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("getInt")){
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__getInt");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("length")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__string.length");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("substring")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    ttt = cur.paras.get(1);
                    writeload("$a2",ttt);

                    ttt = cur.paras.get(2);
                    writeload("$a1",ttt);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__string.substring");
                    System.out.println("lw $ra, 144($sp)");

                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("parseInt")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);
                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__string.parseInt");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("ord")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    ttt = cur.paras.get(1);
                    writeload("$a1",ttt);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__string.ord");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("stringunion")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    con = (Temp) cur.paras.get(1);
                    if (con.strconst)
                        System.out.println("la $a1, tmp" + con.num);
                    else
                        writeload("$a1",con);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__stringConcatenate");
                    System.out.println("lw $ra, 144($sp)");

                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("stringequ")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    con = (Temp) cur.paras.get(1);
                    if (con.strconst)
                        System.out.println("la $a1, tmp" + con.num);
                    else
                        writeload("$a1",con);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__stringIsEqual");
                    System.out.println("lw $ra, 144($sp)");

                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("stringneq")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    con = (Temp) cur.paras.get(1);
                    if (con.strconst)
                        System.out.println("la $a1, tmp" + con.num);
                    else
                        writeload("$a1",con);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__stringNeq");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("stringless")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    con = (Temp) cur.paras.get(1);
                    if (con.strconst)
                        System.out.println("la $a1, tmp" + con.num);
                    else
                        writeload("$a1",con);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__stringLess");
                    System.out.println("lw $ra, 144($sp)");
                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                if (nam.equals("stringlarge")){
                    Temp con = (Temp) cur.paras.get(0);
                    if (con.strconst)
                        System.out.println("la $a0, tmp" + con.num);
                    else
                        writeload("$a0",con);

                    con = (Temp) cur.paras.get(1);
                    if (con.strconst)
                        System.out.println("la $a1, tmp" + con.num);
                    else
                        writeload("$a1",con);

                    System.out.println("sw $ra, 144($sp)");
                    System.out.println("jal " + "func__stringLarge");
                    System.out.println("lw $ra, 144($sp)");

                    ttt = cur.ret;
                    writeStore("$v0",ttt);
                    continue;
                }

                Function Callee = (Function) table.get(cur.callee);
                List<Address> para = cur.paras;

                int needSpace = (Callee.require + 40) * 4;
                System.out.println("sub $sp, $sp, "+needSpace);

                int curpos = (Callee.require + 40) * 4;

                if	(para.size()>0)
					for (int j=0;j<para.size();++j){
						Address tp = para.get(para.size()-j-1);
						if (tp.getClass().getSimpleName().equals("Temp")){
                            if (((Temp)tp).universal){
                                if (((Temp)tp).isString)
                                    System.out.println("la $t0, tmp"+((Temp)tp).num);
                                else
                                    System.out.println("lw $t0, tmp"+((Temp)tp).num);
                            }
                            else
                                System.out.println("lw $t0, " + (needSpace+((Temp)tp).calcdis(baseid,require)) + "($sp)");
                        }
                        else
                            System.out.println("li $t0, " + ((IntegerConst)tp).value);
						System.out.println("sw $t0, " + (Callee.require + 40 - j) * 4 + "($sp)");
					}

                System.out.println("sw $ra, "+(144+needSpace)+"($sp)");
                System.out.println("jal " + cur.callee+"31");
                System.out.println("lw $ra, "+(144+needSpace)+"($sp)");
                System.out.println("add $sp, $sp, "+needSpace);

                if (cur.ret != null){
                    Temp tp = (Temp) cur.ret;
                    writeStore("$v0",tp);
                }
            }
            if (type.equals("Assign")){
                writeload("$t0",((Assign)body.get(i)).src);
                writeStore("$t0",((Assign)body.get(i)).dest);
            }
            if (type.equals("Jump")){
                System.out.println("b label"+((Jump)body.get(i)).dest.num);
            }
            if (type.equals("Label")){
                System.out.println("label"+((Label)body.get(i)).num+':');
            }

            if (type.equals("Alloc")){
                writeload("$a0",((Alloc)body.get(i)).size);
                System.out.println("li $v0, 9");
                System.out.println("syscall");
                writeStore("$v0",((Alloc)body.get(i)).dest);
            }
            if (type.equals("Load")){
                Load load = (Load) body.get(i);
                String ss = "";
                if (((Temp)load.src).universal){
                        ss = "tmp" + ((Temp)load.src).num + "";
                        System.out.println("lw $t2, " + ss);
                        System.out.println("lw $t0, " + load.offset + "($t2)");
                    }
                    else{
                        writeload("$t2",load.src);
                        System.out.println("lw $t0, " + load.offset + "($t2)");
                    }
                writeStore("$t0",load.dest);
            }
            if (type.equals("Store")){
                Store store = (Store) body.get(i);

                writeload("$t0",store.src);

                String ss = "";
                    if (((Temp)store.dest).universal){
                        ss = "tmp" + ((Temp)store.dest).num + "";
                        System.out.println("lw $t2, " + ss);
                        System.out.println("sw $t0, " + store.offset + "($t2)");
                    }
                    else{
                        writeload("$t2",store.dest);
                        System.out.println("sw $t0, " + store.offset + "($t2)");
                    }
            }
            if (type.equals("ArithmeticExpr")){
                ArithmeticExpr tar = (ArithmeticExpr) body.get(i);
                tar.printMIPS(baseid,require);
            }
            if (type.equals("RelationalExpr")){
                RelationalExpr tar = (RelationalExpr) body.get(i);
                tar.printMIPS(baseid,require);
            }
            if (type.equals("Br")){
                writeload("$t0",(Temp)((Br)body.get(i)).src);
                System.out.println("bne $t0, $zero, label"+((Label)((Br)body.get(i)).label1).num);
                System.out.println("beq $t0, $zero, label"+((Label)((Br)body.get(i)).label2).num);
            }
            if (type.equals("Return")){
                if (((Return)body.get(i)).value != null){
                    writeload("$v0",((Return)body.get(i)).value);
                }

                System.out.println("jr $ra");
            }
        }
        if ((body.size()==0) || (!body.get(body.size()-1).getClass().getSimpleName().equals("Return"))){
            System.out.println("jr $ra");
        }
    }

    public void print(){
        System.out.print("func "+name);
        for (int i=0;i<args.size();++i){
            System.out.print(" $tmp"+((Temp)args.get(i)).num);
        }
        System.out.println(" {");
        for (int i=0;i<body.size();++i){
            if (body.get(i) == null)    continue;
            String type = body.get(i).getClass().getSimpleName();
            if (type.equals("Call")){
                if (((Call)body.get(i)).ret != null)    System.out.print("$tmp"+((Temp)((Call)body.get(i)).ret).num+" = ");
                System.out.print("call "+((Call)body.get(i)).callee);
                List<Address> p = ((Call)body.get(i)).paras;
                if (p.size() > 0){
                    for (int j=p.size()-1;j>=0;--j){
						if	(p.get(j).getClass().getSimpleName().equals("Temp"))
							System.out.print(" $tmp"+((Temp)p.get(j)).num);
						else
							System.out.print(" "+((IntegerConst)p.get(j)).value);
					}
                }
                System.out.println();
            }
            if (type.equals("Assign")){
                System.out.print("$tmp"+((Temp)((Assign)body.get(i)).dest).num+" = move ");
                if (((Assign)body.get(i)).src.getClass().getSimpleName().equals("Temp"))
                    System.out.println("$tmp"+((Temp)((Assign)body.get(i)).src).num);
                else
                    System.out.println(((IntegerConst)((Assign)body.get(i)).src).value);
            }
            if (type.equals("Jump")){
                if  (((Jump)body.get(i)).dest != null)
                    System.out.println("jump %label"+((Jump)body.get(i)).dest.num);
                else
                    System.out.println("jump null");
            }
            if (type.equals("Label")){
                System.out.println("%label"+((Label)body.get(i)).num+':');
            }
            if (type.equals("Alloc")){
                System.out.print("$tmp"+((Temp)((Alloc)body.get(i)).dest).num+" = alloc ");
                if (((Alloc)body.get(i)).size.getClass().getSimpleName().equals("Temp")){
                    System.out.println("$tmp"+((Temp)((Alloc)body.get(i)).size).num);
                }
                else{
                    System.out.println(((IntegerConst)((Alloc)body.get(i)).size).value);
                }
            }
            if (type.equals("Load")){
                System.out.println("$tmp"+((Temp)((Load)body.get(i)).dest).num+" = load "+((Load)body.get(i)).size+" $tmp"+((Temp)((Load)body.get(i)).src).num+" "+((Load)body.get(i)).offset);
            }
            if (type.equals("Store")){
                System.out.println("store "+((Store)body.get(i)).size+" $tmp"+((Temp)((Store)body.get(i)).dest).num+" $tmp"+
                        ((Temp)((Store)body.get(i)).src).num+" "+ ((Store)body.get(i)).offset);
            }
            if (type.equals("ArithmeticExpr")){
                ArithmeticExpr tar = (ArithmeticExpr) body.get(i);
                tar.print();
            }
            if (type.equals("RelationalExpr")){
                RelationalExpr tar = (RelationalExpr) body.get(i);
                tar.print();
            }
            if (type.equals("Br")){
                System.out.println("br $tmp"+((Temp)((Br)body.get(i)).src).num+" %label"+((Label)((Br)body.get(i)).label1).num+" %label"+((Label)((Br)body.get(i)).label2).num);
            }
            if (type.equals("Return")){
                System.out.print("ret");
                if (((Return)body.get(i)).value != null){
                    if (((Return)body.get(i)).value.getClass().getSimpleName().equals("Temp"))
                        System.out.println(" $tmp"+((Temp)((Return)body.get(i)).value).num);
                    else
                        System.out.println(" "+((IntegerConst)((Return)body.get(i)).value).value);
                }
                else
                    System.out.println("");
            }
        }
        System.out.println("}");
    }
}
