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
	  //while(true),�ᵼ�º���Ĵ����޷����У�Ϊʲô�أ�
	    while(s.hasNext()){
	    	//System.out.println(s.nextLine());
	    	sm.append(s.nextLine());
	    	
	    }
	    
		//System.out.println( a );
		//System.out.println( ab );
		String aSt =sm.toString();
		System.out.println( aSt );//println��printһ��������ַ���������print�����Զ�����
		
	}
	//next,nextLine�������string��nextInt�����������
    //ctrl+Z����ѭ����linux��ctrl+D ����ѭ��
	//hasnextXXX�����Ƿ�����һ�У�
	
	public void pr(){
		double i =  0.3;
		//int j 
		System.out.printf("%9.4f",i);
	}
}

