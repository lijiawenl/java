package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class niuKe1 {
//牛牛想对一个数做若干次变换，直到这个数只剩下一位数字。
	//变换的规则是：将这个数变成 所有位数上的数字的乘积。比如285经过一次变换后转化成2*8*5=80.
		//	问题是，要做多少次变换，使得这个数变成个位数。
	//提交错误什么鬼
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	   int n =scanner.nextInt();
	  
	 
		while(n> 9){
			int tmp =1;
            for(;n>0;n=n/10){
				tmp =tmp * (n%10);
			   }
            n = tmp;
            System.out.println(n);
            timeAdvance=timeAdvance+1;
            
		}
       //fAdvance(n);
       System.out.println(timeAdvance);
     

	}
	static int timeAdvance =0;
	/*用String来判断位数和求位数
	int num = 2772;
    String str = String.valueOf(num);
    System.out.println(str.length());
    for(char c : str.toCharArray()){
        System.out.println(c);*/
	static int Number =1; 
	public static void F(int n) {
		if(n>2000000000){
			return ;
		}
		if(n <= 9){
			return ;
		}
		int temp = n;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
   		for(int i =10;i<=1000000000;i=i*10){
   			if(temp<=0){
   				break;
   			}else{
   			int val= temp/i;
   			//System.out.println(val);
   			
   			int k = temp-val*i;
   			int z = 10*k/i;
   			arrayList.add(z);
   			temp = temp-k;
   			}  			
   		}
   		int arlen = arrayList.size();
   		int  valminus = 1;
   		for(int i =0;i<arlen;i++){
   			
   			valminus =valminus*arrayList.get(i);
   		}
		if(valminus>9){
			Number =Number +1;
			 F(valminus);
		}
		
		}
	//进化版本
	//非递归版本
	//不要arraylist用于存储
	public static void fAdvance(int n){
		if(n>2000000000){
			return ;
		}
		if(n <= 9){
			return ;
		}
		int tmp =1;
		int add = n;
		while(add > 9){
			 
             for(;n>0;n=n/10){
				tmp =tmp * (n%10);
			   }
             add = tmp;
             Number=Number++;
		}
		
			
	
	}

}
