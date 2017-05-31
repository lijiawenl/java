package leetcode;

import java.util.Scanner;
public class countChar {

	public static void main(String[] args) {
		System.out.println("请输入字符串：");
		Scanner scan=new Scanner(System.in);
		  String str=scan.next();
		  String E1="[\u4e00-\u9fa5]";//汉字范围
		  String E2="[a-zA-Z]";//字母范围
		  System.out.println(E2);
		  int countH=0;
		  int countE=0;
		  char[] arrChar=str.toCharArray();
		  String[] arrStr=new String[arrChar.length];
		  for (int i=0;i<arrChar.length ;i++ ){
		         arrStr[i]=String.valueOf(arrChar[i]);//String,Integer .ValueOf()转换成对应的对象
		  }
		  for (String i: arrStr ){
				   if (i.matches(E1))//matches 匹配正则表达式
				   {
				    countH++;
				   }
				   if (i.matches(E2))
				   {
				    countE++;
				   }
		  }
		  System.out.println("汉字的个数"+countH);
		  System.out.println("字母的个数"+countE);

	}

}
