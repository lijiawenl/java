package leetcode;

import java.util.Scanner;
public class countChar {

	public static void main(String[] args) {
		System.out.println("�������ַ�����");
		Scanner scan=new Scanner(System.in);
		  String str=scan.next();
		  String E1="[\u4e00-\u9fa5]";//���ַ�Χ
		  String E2="[a-zA-Z]";//��ĸ��Χ
		  System.out.println(E2);
		  int countH=0;
		  int countE=0;
		  char[] arrChar=str.toCharArray();
		  String[] arrStr=new String[arrChar.length];
		  for (int i=0;i<arrChar.length ;i++ ){
		         arrStr[i]=String.valueOf(arrChar[i]);//String,Integer .ValueOf()ת���ɶ�Ӧ�Ķ���
		  }
		  for (String i: arrStr ){
				   if (i.matches(E1))//matches ƥ��������ʽ
				   {
				    countH++;
				   }
				   if (i.matches(E2))
				   {
				    countE++;
				   }
		  }
		  System.out.println("���ֵĸ���"+countH);
		  System.out.println("��ĸ�ĸ���"+countE);

	}

}
