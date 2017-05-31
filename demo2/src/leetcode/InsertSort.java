package leetcode;

public class InsertSort {

	public static void sort(int[] a){
	
		if(a!=null){
			for(int i=1;i<a.length;i++){
			int temp=a[i];
			int j=i;
			if(a[j-1]>temp){
				while(j>=1&&a[j-1]>temp){
					a[j]=a[j-1];
					j--;
				}
			}
			/*奇怪的bug,while(j>=1&&a[j-1]>temp)可以编译通过，但是while(a[j-1]>temp&&j>=1)编译通不过*/
			a[j]=temp;
		}
		}
	}
	public static void main(String args[]){
		int[] a ={8,3,4,1,7,5};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
	}

}
