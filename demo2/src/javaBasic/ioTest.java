package javaBasic;


import java.util.Scanner;

public class ioTest {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
		ioTest mIoTest= new ioTest();
		mIoTest.pr();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		//String ab = s1.nextLine();
		//String z = s1.nextLine();
	   /* int[] b = new int[a];
	    for(int i=0; i< a; i++){
	    	b[i]=s.nextInt();
	    }*/
	    StringBuffer sm = new StringBuffer();
	  //while(true),会导致后面的代码无法运行，为什么呢？
	    while(s.hasNext()){
	    	//System.out.println(s.nextLine());
	    	sm.append(s.nextLine());
	    	
	    }
	    
		//System.out.println( a );
		//System.out.println( ab );
		String aSt =sm.toString();
		System.out.println( aSt );//println和print一样，输出字符串，但是print不会自动换行
		
	}
	//next,nextLine输入的是string，nextInt输入的是数字
    //ctrl+Z结束循环，linux中ctrl+D 结束循环
	//hasnextXXX代表是否含有下一行；
	
	public void pr(){
		double i =  0.3;
		//int j 
		System.out.printf("%9.4f",i);
	}
}

