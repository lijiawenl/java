package JavaDataStructure;

import javax.xml.soap.Node;
import java.awt.event.ItemEvent;

/**
 * Created by Gunwen on 2017/3/19.
 */
public class BST<Key extends Comparable<Key>,Value> {
    private class TreeNode {
        /**
         * @param level
         * @param data 
         */
        private Value value;
        private Key key;
        private boolean isVisted;
        private TreeNode leftChild;
        private TreeNode rightChild;
        private int N;

        public TreeNode(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    private TreeNode root;

    public int size() {
        /**
         * 
         */
        return size(root);
    }

    private int size(TreeNode x) {
        if (x == null)
            return 0;
        else return x.N;

    }

    public Value get(Key key) {
        /**
         * 
         */
        return get(root,key);

    }

    private Value get(TreeNode x, Key key) {

    	if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp ==0) return x.value;
        if (cmp < 0) get(x.leftChild, key);
        else if (cmp > 0) get(x.rightChild, key);
        return null;

    }
    
    private Value get1(TreeNode x, Key key) {

    	if (x == null) return null;
        while(x!=null){
        	int cmp = key.compareTo(x.key);
        	if(cmp ==0) return x.value;
            if (cmp < 0) x =x.leftChild;
            else if (cmp > 0) x =x.rightChild;
        }
     
        return null;

    }
    //非递归的版本的get方法
    

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private TreeNode put(TreeNode x, Key key, Value value) {
        if (x == null) return new TreeNode(key, value, 1);//
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.leftChild = put(x.leftChild, key, value);//
        //
        if (cmp > 0) x.rightChild = put(x.rightChild, key, value);
        else x.value = value;
        x.N = size(x.leftChild) + size(x.rightChild) + 1;//
        return x;

    }
   public Key min(){
       /**
        * 
        */
       return min(root).key;
   }
   private TreeNode min(TreeNode x){
       if (x.leftChild == null ) return  x;
       else return min(x.leftChild);
   }
    public Key max(){
        /**
         * 
         */
        return max(root).key;
    }
    private TreeNode max(TreeNode x){
        if (x.rightChild == null ) return  x;
        else return max(x.rightChild);
    }
    /*
     删除操作
     */
    public void deleteMin(){
    	root = deleteMin(root);
    }
    private TreeNode deleteMin(TreeNode x){
    	if (x.leftChild ==null) return x.rightChild;
    	x.leftChild =deleteMin(x.leftChild);//递归返回一个右节点即可x.leftChild =x.leftChild.rightChild;
    	x.N =size(x.leftChild)+size(x.rightChild)+1;
    	return x;
    }
    
    public void delete(Key key){
    	root = delete(root,key);
    }
    private TreeNode delete(TreeNode x,Key key){
    	if(x==null) return null;
    	int cmp = key.compareTo(x.key);
    	if(cmp<0) x.leftChild =delete(x.leftChild,key);//小于零，x的左节点是左子树删除得到的结果；
    	else if(cmp>0) x.rightChild =delete(x.rightChild,key);//大于零，x的左节点是左子树删除得到的结果；
    
    	if (x.rightChild==null) return x.leftChild;
    	if(x.leftChild==null) return x.rightChild;
    	TreeNode t =x;
    	x =min(t.rightChild);
    	x.rightChild =deleteMin(t.rightChild);
    	x.leftChild =t.leftChild;
    	x.N =size(x.leftChild)+size(x.rightChild)+1;
    	return x;//对于当前节点的更新，递归返回后会将x和之前的连接一起代码行135和136
    }
    
    
    



}
