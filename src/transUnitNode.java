/**
 * Created by Shining on 2016/4/27.
 */

import java.util.*;

public class transUnitNode extends DecNode{
    DecNode lsNode,rsNode;
    transUnitNode(){}
    transUnitNode(DecNode ls,DecNode rs){
        this.lsNode = ls;
        this.rsNode = rs;
    }
    void visit1(mxxTable table){
        //System.out.println("v1");
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
        //System.out.println("v2");
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
        //System.out.println("v2");
        if	(this.lsNode != null){
            this.lsNode.visit3(table,scope);
            this.ok&=this.lsNode.ok;
        }
        if	(this.rsNode != null){
            this.rsNode.visit3(table,scope);
            this.ok&=this.rsNode.ok;
        }
    }
    private void Setup(Map<String,Integer> getSize,mxxTable table,int scope){
        if (this.lsNode.getClass().getSimpleName().equals("transUnitNode")){
            transUnitNode ls = (transUnitNode) this.lsNode;
            ls.Setup(getSize,table,scope);
        }
        if (this.lsNode.getClass().getSimpleName().equals("exdeclareNode")){
            this.lsNode.buildQuad(Temp.origins,getSize,table,scope,null);
        }
        if (this.rsNode.getClass().getSimpleName().equals("exdeclareNode")){
            this.rsNode.buildQuad(Temp.origins,getSize,table,scope,null);
        }
    }
    private void buildIR_(IR curIR,Map<String,Integer> getSize,mxxTable table,int scope){
        if (this.lsNode.getClass().getSimpleName().equals("transUnitNode")){
            transUnitNode ls = (transUnitNode) this.lsNode;
            ls.Setup(getSize,table,scope);
        }

        if (this.lsNode.getClass().getSimpleName().equals("exdeclareNode")){
            this.lsNode.buildQuad(Temp.origins,getSize,table,scope,null);
        }
        if (this.rsNode.getClass().getSimpleName().equals("exdeclareNode")){
            this.rsNode.buildQuad(Temp.origins,getSize,table,scope,null);
        }

        if  (this.lsNode.getClass().getSimpleName().equals("transUnitNode")) {
            transUnitNode ls = (transUnitNode) this.lsNode;
            ls.buildIR_(curIR,getSize,table,scope);
        }

        if (this.lsNode.getClass().getSimpleName().equals("funcDefNode")){
            //System.out.println("Adding "+((funcDefNode)this.lsNode).funcName.idName);
            curIR.funcs.add((funcDefNode)this.lsNode);
        }
        if (this.rsNode.getClass().getSimpleName().equals("funcDefNode")) {
            //System.out.println("Adding "+((funcDefNode)this.rsNode).funcName.idName);
            curIR.funcs.add((funcDefNode)this.rsNode);
        }
    }

    void buildIR(IR curIR,Map<String,Integer> getSize,mxxTable table,int scope){
        buildIR_(curIR,getSize,table,scope);
        for (int i=0;i<curIR.funcs.size();++i)
            if (curIR.funcs.get(i).funcName.idName.equals("main")){
                Function tmp = new Function();
                //System.out.println("Adding1 "+((funcDefNode)curIR.funcs.get(i)).funcName.idName);
                curIR.funcs.get(i).buildFunc(tmp,getSize,table,scope);
                curIR.fragments.add(tmp);
            }
        for (int i=0;i<curIR.funcs.size();++i)
            if (!curIR.funcs.get(i).funcName.idName.equals("main")){
                Function tmp = new Function();
                //System.out.println("Adding2 "+((funcDefNode)curIR.funcs.get(i)).funcName.idName);
                curIR.funcs.get(i).buildFunc(tmp,getSize,table,scope);
                curIR.fragments.add(tmp);
            }
    }
}