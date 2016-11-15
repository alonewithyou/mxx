import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.*;

public class Main {

	public static void copyToOut(String fileName) {
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			while ((tempString = reader.readLine()) != null) {
				System.out.println(tempString);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        mxxLexer lexer = new mxxLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mxxParser parser = new mxxParser(tokens);
        ParseTree tree = parser.compilationUnit();

        //System.out.println("LISP:");
        //System.out.println(tree.toStringTree(parser));
        //System.out.println();

        //System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        mxxCompiler compileByListener = new mxxCompiler();
        walker.walk(compileByListener, tree);
        mxxTable table = new mxxTable();	
		Symbol oris;
		keyNode tmp = new keyNode();
		tmp.typeID = "int";
		oris = Symbol.symbol("int");
		table.put(oris,tmp,0);
		
		tmp = new keyNode();
		tmp.typeID = "bool";
		oris = Symbol.symbol("bool");
		table.put(oris,tmp,0);
		
		tmp = new keyNode();
		tmp.typeID = "string";
		oris = Symbol.symbol("string");
		table.put(oris,tmp,0);
		
		tmp = new keyNode();
		tmp.typeID = "void";
		oris = Symbol.symbol("void");
		table.put(oris,tmp,0);

		tmp = new keyNode();
		tmp.typeID = "int";
		oris = Symbol.symbol("length");
		table.put(oris,tmp,0);

		tmp = new keyNode();
		tmp.typeID = "string";
		oris = Symbol.symbol("substring");
		table.put(oris,tmp,0);

		tmp = new keyNode();
		tmp.typeID = "int";
		oris = Symbol.symbol("parseInt");
		table.put(oris,tmp,0);

		tmp = new keyNode();
		tmp.typeID = "int";
		oris = Symbol.symbol("ord");
		table.put(oris,tmp,0);

		tmp = new keyNode();
		tmp.typeID = "int";
		oris = Symbol.symbol("size");
		table.put(oris,tmp,0);
		
		funcDefNode fprint = new funcDefNode();
		fprint.funcName = new identifierNode("print");
		fprint.funcType = new commonTypeName("void");
		fprint.funcPara = new paraUnit(new commonTypeName("string"),new identifierNode("str"));
		fprint.address = new Temp();
		
		funcDefNode fprintln = new funcDefNode();
		fprintln.funcName = new identifierNode("println");
		fprintln.funcType = new commonTypeName("void");
		fprintln.funcPara = new paraUnit(new commonTypeName("string"),new identifierNode("str"));
		fprintln.address = new Temp();
		
		funcDefNode ftoString = new funcDefNode();
		ftoString.funcName = new identifierNode("toString");
		ftoString.funcType = new commonTypeName("string");
		ftoString.funcPara = new paraUnit(new commonTypeName("int"),new identifierNode("i"));
		Temp uuuu = new Temp();
		uuuu.isString = true;
		uuuu.simple = false;
		ftoString.address = uuuu;
		
		funcDefNode fgetString = new funcDefNode();
		fgetString.funcName = new identifierNode("getString");
		fgetString.funcType = new commonTypeName("string");
		fgetString.funcPara = null;
		uuuu = new Temp();
		uuuu.isString = true;
		uuuu.simple = false;
		fgetString.address = uuuu;
		
		funcDefNode fgetInt = new funcDefNode();
		fgetInt.funcName = new identifierNode("getInt");
		fgetInt.funcType = new commonTypeName("int");
		fgetInt.funcPara = null;
		fgetInt.address = new Temp();

		IR curIR = new IR();
		Function curFunc = new Function();
		Map<String,Integer> sizeMap = new HashMap<String,Integer>();
		sizeMap.put("int",4);
		sizeMap.put("bool",4);

		PrintStream defaultout = System.out;
		PrintStream tps=new PrintStream(new FileOutputStream("tmp.lib"));
		System.setOut(tps);
		
        if	(compileByListener.AST.get(compileByListener.Root).getClass().getSimpleName().equals("transUnitNode")){
        	transUnitNode root = (transUnitNode) compileByListener.AST.get(compileByListener.Root);
    		
    		root.visit1(table);
    		if	(root.ok == 1) root.visit2(table);
    		else	System.out.println("failed at round 2");
    		
    		oris = Symbol.symbol("main");
    		if	(table.get(oris) == null){
    			root.ok = 0;
    			System.out.println("no func main found");
    		}
    		else 
    			if	(!table.get(oris).getClass().getSimpleName().equals("funcDefNode")){
    				root.ok = 0;
    				System.out.println("main not defined as a func");
    			}
    		else{
    			funcDefNode checkmain = (funcDefNode) table.get(oris);
    			if	(checkmain.funcPara != null){
    				root.ok = 0;
    				System.out.println("too much paras for main");
    			}
    			if	(!checkmain.funcType.getClass().getSimpleName().equals("commonTypeName")){
    				root.ok = 0;
    				System.out.println("not allowed type for main");
    			}
    			else	if	(!checkmain.funcType.typeID.equals("int"))	root.ok = 0;
    		}
    		
    		fprint.visit2(table);
    		fprintln.visit2(table);
    		fgetInt.visit2(table);
    		ftoString.visit2(table);
    		fgetString.visit2(table);
    		
    		if	(root.ok == 1) root.visit3(table,0);
    		else{
				System.out.println("failed checking main");
				throw new RuntimeException("fuck");
			}

			if (root.ok == 0) throw new RuntimeException("fuck");

			//System.out.println("Building IR");
			table.curBase = 0;
			root.buildIR(curIR,sizeMap,table,0);
			Map<String,Function> tablee = new HashMap<String,Function>();
			for (int i=0;i<curIR.fragments.size();++i)
				tablee.put(curIR.fragments.get(i).name,curIR.fragments.get(i));

			//curIR.print();

			/*
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for (int i=0;i<Temp.origins.size();++i)
				System.out.println(Temp.origins.get(i).getClass().getSimpleName());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			*/

			copyToOut("lib.s");
			System.out.println(".data");
			for (Map.Entry<Temp,String> entry:Temp.strConst.entrySet()) {
				int Len = (entry.getValue().length()-2);
				for (int j=0;j<entry.getValue().length();++j)
					if (entry.getValue().charAt(j) == '\\') Len--;
				System.out.println(".word "+Len);
				System.out.println("tmp" + entry.getKey().num + ": .asciiz " + entry.getValue());
				System.out.println(".align 2");
			}
			System.out.println(".data");
			for (int pp=0;pp<Temp.univerVar.size();++pp){
				System.out.println("tmp" + Temp.univerVar.get(pp).num + ": .space 4");
			}
			System.out.println(".text");
			curIR.printMIPS(tablee);
        }
        else{
        	funcDefNode root = (funcDefNode) compileByListener.AST.get(compileByListener.Root);
    		
    		root.visit1(table);
    		if	(root.ok == 1) root.visit2(table);
    		else	System.out.println("failed at round 2");
    		
    		oris = Symbol.symbol("main");
    		if	(table.get(oris) == null){
    			root.ok = 0;
    			System.out.println("no func main found");
    		}
    		else 
    			if	(!table.get(oris).getClass().getSimpleName().equals("funcDefNode")){
    				root.ok = 0;
    				System.out.println("main not defined as a func");
    			}
    		else{
    			funcDefNode checkmain = (funcDefNode) table.get(oris);
    			if	(checkmain.funcPara != null){
    				root.ok = 0;
    				System.out.println("too much paras for main");
    			}
    			if	(!checkmain.funcType.getClass().getSimpleName().equals("commonTypeName")){
    				root.ok = 0;
    				System.out.println("not allowed type for main");
    			}
    			else	if	(!checkmain.funcType.typeID.equals("int"))	root.ok = 0;
    		}
    		
    		fprint.visit2(table);
    		fprintln.visit2(table);
    		fgetInt.visit2(table);
    		ftoString.visit2(table);
    		fgetString.visit2(table);
    		
    		if	(root.ok == 1) root.visit3(table,0);
    		else{
				System.out.println("failed checking main");
				throw new RuntimeException("fuck");
			}

			if	(root.ok == 0)	throw new RuntimeException("fuck");

			//System.out.println("Building IR");
			table.curBase = 0;
			root.buildFunc(curFunc,sizeMap,table,0);
			Map<String,Function> tablee = new HashMap<String,Function>();
			tablee.put("main",curFunc);

			//curFunc.print();

			copyToOut("lib.s");
			System.out.println(".data");
			for (Map.Entry<Temp,String> entry:Temp.strConst.entrySet()) {
				int Len = (entry.getValue().length()-2);
				for (int j=0;j<entry.getValue().length();++j)
					if (entry.getValue().charAt(j) == '\\') Len--;
				System.out.println(".word "+Len);
				System.out.println("tmp" + entry.getKey().num + ": .asciiz " + entry.getValue());
				System.out.println(".align 2");
			}
			/*for (int pp=0;pp<Temp.univerVar.size();++pp){
				System.out.println("tmp"+Temp.univerVar.get(pp).num+": .space 4")
			}*/
			System.out.println(".text");
			curFunc.printMIPS(tablee);
        }

		tps.close();
		System.setOut(defaultout);

		Scanner reader = null;
		try {
			reader = new Scanner(new File("tmp.lib"));
			String tempString = null;
			while (reader.hasNext()) {
				tempString = reader.nextLine();
				if (tempString.equals("main:"))	break;
				System.out.println(tempString);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}