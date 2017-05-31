package JavaBase;


import java.util.*;
import java.util.Map.Entry;

public class HashIter {
   public void iter1(){
	   /*注意引用传递和值传递*/
	   Map<String,String> map=new HashMap<String,String>();
	   Iterator iter=map.entrySet().iterator();
	   while(iter.hasNext()){
		   
		   Map.Entry<String,String> entry=(Map.Entry<String,String>)iter.next();
		   Object key = entry.getKey();
		   Object value =entry.getValue();
		   /*注意这里是Object对象*/
	   }
			   
	   
   }


	
}
