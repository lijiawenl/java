package JavaDataStructure;

import javax.xml.soap.Node;
import java.awt.event.ItemEvent;

/**
 * Created by Gunwen on 2017/3/19.
 */
public class Tree<Key extends Comparable<key>,Value> {
    private class TreeNode {
        /**
         * @param level 层
         * @param data 数据域
         */
        private Value value;
        private Key key;
        private boolean isVisted;
        private Node leftChild;
        private Node rightChild;
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    private TreeNode root;

    public int size() {
        /**
         * 返回树的高度，调用私有方法，保证封装性
         */
        return size(root);
    }

    private size(Node x) {
        if (x == null)
            return 0;
        else return x.N;

    }

    public Value get(Key key) {
        /**
         * 返回树的指定键的值，调用私有方法，保证封装性
         */
        return get(root, key);

    }

    private Value get(Node x, Key key) {

        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) get(x.leftChild, Key);
        if (cmp > 0) get(x.rightChild, Key);
        else return x.value;

    }

    public void put(Key key, Value value) {
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value, 1);//当方法遇到一个空的节点时，会将null的节点生成一个新的节点
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.leftChild = put(x.leftChild, key, value);//返回查找到的节点，递归终结在x==null处，跳出递归后将继续接下去的更新，
        //直到最后返回更新过N根节点。
        if (cmp > 0) x.rightChild = put(x.rightChild, key, value);
        else x.value = value;
        x.N = size(x.leftChild) + size(x.rightChild) + 1;//沿着查找的路径更新每个节点的值
        return x;

    }
   public Key min(){
       /**
        * 返回树的最小值，调用私有方法，保证封装性
        */
       return min(root).key;
   }
   private Node min(Node x){
       if (x.leftChild == null ) return  x;
       else return min(x.leftChild);
   }
    public Key max(){
        /**
         * 返回树的最大值，调用私有方法，保证封装性
         */
        return max(root).key;
    }
    private Node min(Node x){
        if (x.rightChild == null ) return  x;
        else return max(x.rightChild);
    }



}
