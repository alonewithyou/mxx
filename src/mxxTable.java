import java.util.*;

class Binder {
    ASTNode value;
    Symbol next;
    Binder parent;
    Binder(ASTNode value, Symbol next, Binder parent) {
        this.value = value;
        this.next = next;
        this.parent = parent;
    }
}

public class mxxTable {
    private Dictionary dict = new Hashtable();
    private Symbol top;
    private Binder marks;
    public keyNode curFuncType = new keyNode();
    public int inloop = 0;
	public Label tobreak,tocontinue;
	public boolean leftvalue = false;
	public int curBase;

    public mxxTable(){}

    public void put(Symbol key, ASTNode value, int scope){
        value.scope = scope;
        dict.put(key, new Binder(value, top, (Binder) dict.get(key)));
        top = key;
    }

    public ASTNode get(Symbol key){
        Binder e = (Binder) dict.get(key);
        if (e == null) return null;
        return e.value;
    }

    public void beginScope(){
        marks = new Binder(null, top, marks);
        top = null;
    }

    public void endScope(){
        while (top != null){
            Binder e = (Binder) dict.get(top);
            if (e.parent != null) {
                dict.put(top, e.parent);
            } else {
                dict.remove(top);
            }
            top = e.next;
        }
        top = marks.next;
        marks = marks.parent;
    }
}
