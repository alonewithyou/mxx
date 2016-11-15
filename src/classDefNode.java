import java.util.*;

/**
 * Created by Shining on 2016/4/26.
 */

public class classDefNode extends DecNode{
    identifierNode lsNode;
    DecNode rsNode;
    List attriName = new ArrayList(), attriType = new ArrayList();
    Map<String,Integer> pos = new HashMap<String,Integer> ();
    classDefNode(){}
    classDefNode(identifierNode ls,DecNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
    void visit1(mxxTable table){
        Symbol name = Symbol.symbol(this.lsNode.idName);
        if (table.get(name) != null){
            this.ok = 0;
            System.out.println("repeated def of class");
            return	;
        }
        else{
            if (this.rsNode.getClass().getSimpleName().equals("classDefUnit")){
                classDefUnit tmp = (classDefUnit) this.rsNode;
                attriName.add(tmp.rsNode.idName);
                attriType.add(tmp.lsNode.convert());
            }
            else{
                classDecList cur = (classDecList) this.rsNode;
                while (cur.getClass().getSimpleName().equals("classDecList")){
                    classDefUnit tmp = (classDefUnit) cur.lsNode;
                    attriName.add(tmp.rsNode.idName);
                    attriType.add(tmp.lsNode.convert());
                    if (cur.rsNode.getClass().getSimpleName().equals("classDecList"))	cur = (classDecList) cur.rsNode;
                    else{
                        tmp = (classDefUnit) cur.rsNode;
                        attriName.add(tmp.rsNode.idName);
                        attriType.add(tmp.lsNode.convert());
                        break;
                    }
                }
            }
            this.numOfVar = attriName.size();
            for (int i=0;i<attriName.size();++i)
                pos.put((String)attriName.get(i),i);
            table.put(name,this,0);
        }
    }
    void visit2(mxxTable table){
        if (this.rsNode.getClass().getSimpleName().equals("classDefUnit")){
            classDefUnit tmp = (classDefUnit) this.rsNode;
            //attriName.add(tmp.rsNode.idName);
            if	(tmp.lsNode.getClass().getSimpleName().equals("arrTypeName")){
                if (((arrTypeName)(tmp.lsNode)).lsNode.idName.equals("void")){
                    this.ok = 0;
                    System.out.println("no void attri allowed");
                }
                Symbol tmps = Symbol.symbol(((arrTypeName)(tmp.lsNode)).lsNode.idName);
                if (table.get(tmps) == null){
                    this.ok = 0;
                    System.out.println("unknown attri type");
                }
            }
            else{
                if (tmp.lsNode.typeID.equals("void")){
                    this.ok = 0;
                    System.out.println("no void attri allowed");
                }
                Symbol tmps = Symbol.symbol(tmp.lsNode.typeID);
                if (table.get(tmps) == null){
                    this.ok = 0;
                    System.out.println("unknown attri type");
                }
            }
            //attriType.add(tmp.lsNode.convert());
        }
        else{
            classDecList cur = (classDecList) this.rsNode;
            while (cur.getClass().getSimpleName().equals("classDecList")){
                classDefUnit tmp = (classDefUnit) cur.lsNode;
                //attriName.add(tmp.rsNode.idName);
                if	(tmp.lsNode.getClass().getSimpleName().equals("arrTypeName")){
                    if (((arrTypeName)(tmp.lsNode)).lsNode.idName.equals("void")){
                        this.ok = 0;
                        System.out.println("no void attri allowed");
                        break;
                    }
                    Symbol tmps = Symbol.symbol(((arrTypeName)(tmp.lsNode)).lsNode.idName);
                    if (table.get(tmps) == null){
                        this.ok = 0;
                        System.out.println("unknown attri type");
                        break;
                    }
                }
                else{
                    if (tmp.lsNode.typeID.equals("void")){
                        this.ok = 0;
                        System.out.println("no void attri allowed");
                        break;
                    }
                    Symbol tmps = Symbol.symbol(tmp.lsNode.typeID);
                    if (table.get(tmps) == null){
                        this.ok = 0;
                        System.out.println("unknown attri type");
                        break;
                    }
                }
                //attriType.add(tmp.lsNode.convert());
                if (cur.rsNode.getClass().getSimpleName().equals("classDecList"))	cur = (classDecList) cur.rsNode;
                else{
                    tmp = (classDefUnit) cur.rsNode;
                    //attriName.add(tmp.rsNode.idName);
                    if	(tmp.lsNode.getClass().getSimpleName().equals("arrTypeName")){
                        if (((arrTypeName)(tmp.lsNode)).lsNode.idName.equals("void")){
                            this.ok = 0;
                            System.out.println("no void attri allowed");
                            break;
                        }
                        Symbol tmps = Symbol.symbol(((arrTypeName)(tmp.lsNode)).lsNode.idName);
                        if (table.get(tmps) == null){
                            this.ok = 0;
                            System.out.println("unknown attri type");
                            break;
                        }
                    }
                    else{
                        if (tmp.lsNode.typeID.equals("void")){
                            this.ok = 0;
                            System.out.println("no void attri allowed");
                            break;
                        }
                        Symbol tmps = Symbol.symbol(tmp.lsNode.typeID);
                        if (table.get(tmps) == null){
                            this.ok = 0;
                            System.out.println("unknown attri type");
                            break;
                        }
                    }
                    //attriType.add(tmp.lsNode.convert());
                    break;
                }
            }
            for (int i=0;i<this.attriName.size();++i)
                for	(int j=i+1;j<this.attriName.size();++j)
                    if (this.attriName.get(i).equals(this.attriName.get(j))){
                        this.ok = 0;
                        System.out.println("repeated attri idname");
                    }
        }
    }
}