package leetcode;
 import java.util.*;
 
public class deleteDuplecate {
	class LinkedList{
		LinkedList next;
		int data;
	}
	
	 Void dele(LinkedList head){
		HashMap p  =new HashMap();
		LinkedList previous = null;
		while(head !=null){
			if(p.containsKey(head.data)){
				previous.next=head.next;
			}else{
					p.put(head.data,true);
					previous=head;
				}
			}
			LinkedList n= null;
			n= n.next;
			return null;
		
		}
	}


