package javaBasic;
import java.util.*;

public class queueAStack {
//this is a demo about queue and stack
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Deque<Integer> m = new LinkedList<Integer>();
      m.offer(2);
      m.offer(3);
      m.offer(4);
      m.offer(5);
      //m =5,4,3,2
      //poll,peek,offer;三种方法不会抛出异常
      //the original collection functions can return exceptions;so try catch;
	  //queue FIFO;
      int z =m.peekFirst();
      //stack FILO
      System.out.println(z);
      int s =m.peekLast();
      System.out.println(s);
	}

}
