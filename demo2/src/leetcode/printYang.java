package leetcode;

import java.util.Scanner;

public class printYang {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				int m = scanner.nextInt();
		int[][] M =new int[m][m];
		for(int i = 0; i<=m-1;i++){
			M[i][0] = 1;
			M[i][i] = 1;
		}
		for (int i = 2; i <=m-1; i++) {
			for (int j = 1; j <i ; j++) {
				M[i][j]=M[i-1][j-1]+M[i-1][j];

			}
			
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j <= i; j++) {
				
				System.out.print(" "+ M[i][j]);
			}
			    System.out.println();//print 是不换行的，而println表示要换行。
		}
		

	}

}
