package leetcode;

import java.util.Scanner;

public class huiWen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i ;
        Integer m = scanner.nextInt();//�����᷽��ܶ�
        char[]  M = m.toString().toCharArray();
        int len = M.length;
       for (i = 0; i <= (len-1)/2; i++) {
		if(M[i]!=M[len-1-i]){
			break;
		}
		
	}
       if(i >(len-1)/2){
    	   System.out.println("�ǻ�����");
       }else{
       System.out.println("���ǻ�����");
       }
	}

}
