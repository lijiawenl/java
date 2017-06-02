package JavaDataStructure;

/**
 * Created by DELL on 2017/3/18.
 * 基于链表实现栈
 */
public class List<Item,Node> {
    private class Node{
        Item item;
        Node next;
       /**Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        first.item = "to" ;
        second.item = "be" ;
        third.item = "or";
        first.next = second;
        second.next=third;//注意third.next是null,表示该节点指向null.即是一条空的链表
         */
    }
    private Node first;
    private int N;//设置为私有的
    public int size(){ return N;}
    public boolean isempty(){ return first == null;}
    public void push( Item item){
        Node oldfirst = first;
        first = new Node();
        first.item= item;
        first.next=oldfirst;
        N++;

    }
   // public Item pop( ){
       
  //  }

}
