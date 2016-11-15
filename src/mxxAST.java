import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.*;

abstract class ASTNode{
	ASTNode lsNode,rsNode;
	String typeID;
	Address address;
	int numOfVar = 0;
	int ok = 1, scope;
	void visit1(mxxTable table){
		if	(this.lsNode != null){this.lsNode.visit1(table);this.ok&=this.lsNode.ok;}
		if	(this.rsNode != null){this.rsNode.visit1(table);this.ok&=this.rsNode.ok;}
	}
	void visit2(mxxTable table){
		if	(this.lsNode != null){this.lsNode.visit2(table);this.ok&=this.lsNode.ok;}
		if	(this.rsNode != null){this.rsNode.visit2(table);this.ok&=this.rsNode.ok;}
	}
	void visit3(mxxTable table,int scope){}

	void buildIR(IR curIR,Map<String,Integer> getSize,mxxTable table,int scope){}
	void buildFunc(Function curFunc,Map<String,Integer> getSize,mxxTable table,int scope){}
	void buildQuad(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope,Label nexLab){}
	Address buildExp(List<Quadruple> quadList,Map<String,Integer> getSize,mxxTable table,int scope){
		System.out.println(this.getClass().getSimpleName()+" empty temp created");
		return new Temp();
	}
}

class keyNode extends ASTNode{
	boolean lvalue = false;
	String typeID = "";
	int depth = 0;
	Key key;
}

abstract class ExpNode extends ASTNode{
	ExpNode lsNode,rsNode;
	keyNode calcRes;
}

abstract class StmtNode extends ASTNode{
}

abstract class DecNode extends ASTNode{
}

abstract class typeNameNode extends ASTNode{
	public String typeID;
	public abstract keyNode convert();
	void print(){
		//System.out.println("typeNameNode");
	}
}

abstract class revChar extends ASTNode{
	String content;
}

class semiMark extends revChar{
	semiMark(){
		content = ";";
	}
}

class doubleBrace extends revChar{
}

abstract class Key extends ASTNode{
}

class intNode extends Key{
	int key;
}

class boolNode extends Key{
	boolean key;
}

class stringNode extends Key{
	String key;
}

class classNode extends Key{
	List type = new ArrayList(), key = new ArrayList(), name = new ArrayList();
}

class arrNode extends Key{

}

class nulNode extends Key{
}

public class mxxAST{

}