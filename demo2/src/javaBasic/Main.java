package JavaBase;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price= new int[n];
        for(int i = 0; i < n; i++){
            price[i]=sc.nextInt();
        }
        
        int pric = p(n,price);
        System.out.println(pric);
	}
    private static int p(int m,int[] p){
    	if(m==1||m==2){
    		return -1;
    	}
    	int su=0;
		sort(p);
		for(int j1=0;j1<m-1;j1++){
			
			if(su==3){
				return p[j1];
			}
			if(p[j1]!=p[j1+1]){
				su=su+1;
			}
			
		}
		return -1;
    }
    private static void sort(int[] a){
    	int n=a.length;
		for(int i=0;i<n;i++){
			int temp=a[i] ;
			int j =i;
			while(j>=1&&a[j-1]>temp){
				int k=a[j-1];
				a[j-1]=a[j];
				a[j]=k;
				j--;
			}
			
		}
    }
    
    
}
