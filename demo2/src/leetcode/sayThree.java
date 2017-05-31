package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class sayThree {
	
	public static int  F(int m ){
		
		if(m<=2){
			return -1;
		}
		int[] M =new int[m];
		Arrays.fill(M, 1);
		int noneZero = m;
		int index = 0;
		int i = 0;
		while(noneZero > 1){
			
				if( M[i] == 1){
					index= index + 1;
				}
				if(index == 3){
					index = 0;
					M[i] = 0;
					noneZero = noneZero -1;
				}
				i++;
				if(i == m){
					i=0;
				}	
		}
		for(int j=0;j <= m-1; j++){
			if(M[j]==1){
				return j;
			}
		}
	return -1;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int k = scanner.nextInt();
      sayThree sayThree = new sayThree();
      int z =sayThree.F(k);
      System.out.print(z);
      int[] m ={1,2,3,4,5};
      System.out.print(m);//返回是m数组的地址
	}

}
