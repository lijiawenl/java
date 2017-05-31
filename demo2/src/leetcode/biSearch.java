package leetcode;
import java.util.Scanner;

public class biSearch {
		//二分查找
			//递归 的版本
			public static boolean F(int [] a, int b,int start,int last){
				if(start<=last){
					int len = (start+last)/2 ;
					if(b < a[len]){
						return F(a,b,start,len-1);
					}else if(b > a[len]){
						return F(a,b,len+1,last);
					}else if(b == a[len] ){
						return true;
					}
				}
		      return false;
			}
			
			//非递归的版本
			public static boolean CF(int [] a, int b,int start,int last){
				while(start<= last){
					int len = (start+last)/2 ;
					if(b < a[len]){
						last = len-1;
					}else if(b > a[len]){
					start = len+1;
					}else if(b == a[len] ){
						return true;
					}
				}
				return false;
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				int i = 0;
				int aa = s.nextInt();
				int[] a = new int[aa];
				while(s.hasNext()){	
					a[i++] = s.nextInt();
					//i++
				}
		        //int[] a = {1,3,4,5,9,29,46,56,78};
		        int z = a.length - 1;
		        boolean is = CF(a, 6, 0 ,z);
		        System.out.println(is);
			}

		}

