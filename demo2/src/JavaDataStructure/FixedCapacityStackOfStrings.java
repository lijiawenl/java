package JavaDataStructure;

/**
 * Created by DELL on 2017/3/18.
 */
import java.io.*;
import java.util.Iterator;

public class FixedCapacityStackOfStrings<Item> {
    private  Item[] a; //栈的入口，固定的大小
    private  int N; //栈的大小
    public  FixedCapacityStackOfStrings(int cap)
    {  /*修改为泛型的版本，需要将类型改为Item,类型转换得到泛型数组*/
    }
    public boolean isempty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(Item item)
    {
        if (N == a.length)
            resize(2*a.length);
            a[N++] = item;
    }

    public Item  pop() {
        Item item = a[--N];
        a[N] = null;
        if (N >0 && N == a.length/4) resize(a.length/2);
        return Item;
    }

    private void resize( int max){
        Item[] temp = ( Item[]) new Object[max];
        for ( int i =0; i < N; i++)//这里是重新创建一个数组，有GC所以可以暂时不考虑，不知道会不会内存泄漏
            temp[i] = a[i];
        a = temp ;
    }
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }
    //定义嵌套类,为private
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){return i > 0;}

        public Item  next() {
            return a[--i];}
            public void remove(){}
    }
   /** public static void main(String[] args){
        FixedCapacityStackOfStrings<String> s = new FixedCapacityStackOfStrings<String>(100);
        while(!StdIn.isEmpty.){
            String item =StdIn.readString();
            if (!item.equals("-")){
                s.push(item);
            }
            else if (！s.isempty())
            StdOut.print(s.pop() + " ");
        }
        StdOut.println(" (" + s.size() + " left on the stack)");
    }
    */
}

