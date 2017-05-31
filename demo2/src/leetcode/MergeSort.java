package leetcode;

public class MergeSort {
	
		public static void sort(int[] a){
		int n=a.length;
		int[] temp=new int[n];
		sort(a,0,n-1,temp);
		
		}
		public static void sort(int[] arr,int left,int right,int[]temp ){
		if(left<right){
			int mid=(left+right)/2;
			sort(arr,left,mid,temp);
			sort(arr,mid+1,right,temp);
			merge(arr,left,mid,right,temp);
		}
		}
		/*分到最后就是剩下一个的子列，然后进行merge，关键的是merge*/
		public static void merge(int[] arr,int left,int mid,int right,int[] temp){
			int i=left;
			int j=mid+1;
			int t=0;
			while(i<=mid&&j<=right){
				if(arr[i]<=arr[j]){
					temp[t++]=arr[i++];
				}else{
					temp[t++]=arr[j++];
				}
			}
			while(i<=mid){
				temp[t++]=arr[i++];
			}
			while(j<=right){
				temp[t++]=arr[j++];
			}
			t=0;
			while(left<=right){
				arr[left++] =temp[t++];
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
