package leetcode;

public class BubbleInsert {
	public static void sort(int[] a){
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
	public static void main(String args[]){
		int[] a ={8,3,4,1,7,7,5};
		
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
}
}
