import java.util.*;

public class IR {
    public List<Function> fragments;
    public List<funcDefNode> funcs;

    public IR() {
        fragments = new LinkedList<Function>();
        funcs = new ArrayList<funcDefNode>();
    }

    public IR(List<Function> fragments) {
        this.fragments = fragments;
    }

    public void printMIPS(Map<String,Function> table){
        for (int i=0;i<fragments.size();++i){
            fragments.get(i).printMIPS(table);
            System.out.println("");
        }
    }

    public void print(){
        for (int i=0;i<fragments.size();++i){
            fragments.get(i).print();
            System.out.println("");
        }
    }
}
