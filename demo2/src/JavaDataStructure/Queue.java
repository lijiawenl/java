package JavaDataStructure;

/**
 * Created by DELL on 2017/3/18.
 */
public class Queue {
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
    private int N;//设置为私有的
    private first = new Node();
    private last = new Node();

    public int size( return N;)
    public boolean isempty(){ return first == null}
    public void push( Item item){
        Node oldlast = last;
        last = new Node();
        last.item= item;
        last.next= null;
        if ( isempty()) first = last;
        else oldlast.next=last;
        N++;

    }
    public Item dequeue( ){
        Item item = first.item;
        first =first.next;
        if ( isempty()) last = null;
        N--;
        return item;

    }
}
