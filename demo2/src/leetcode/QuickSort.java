package leetcode;

public class QuickSort {
	public static void sort(int[] a){
		sort(a,0,a.length-1);
	}
	private static void sort(int[] arr,int low,int high){
		int i;
		int j;
		int index;
		if(low>=high){
			return ;
		}
		i=low;
		j=high;
		index=arr[i];
		while(i<j){
			while(i<j&&arr[j]>=index)
				j--;
			if(i<j)
				arr[i++]=arr[j];
			while(i<j&&arr[j]<index)
				i++;
			if(i<j)
				arr[j--]=arr[i];
		}
		arr[i]=index;
		sort(arr,low,i-1);
		sort(arr,i+1,high);
	}
		
	
	public static void main(String args[]){
		int[] a ={8,3,4,1,7,5};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}

}
}
