package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class niuKe1 {
//ţţ���һ���������ɴα任��ֱ�������ֻʣ��һλ���֡�
	//�任�Ĺ����ǣ����������� ����λ���ϵ����ֵĳ˻�������285����һ�α任��ת����2*8*5=80.
		//	�����ǣ�Ҫ�����ٴα任��ʹ���������ɸ�λ����
	//�ύ����ʲô��
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
	/*��String���ж�λ������λ��
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
	//�����汾
	//�ǵݹ�汾
	//��Ҫarraylist���ڴ洢
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
