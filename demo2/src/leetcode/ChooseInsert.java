package leetcode;

public class ChooseInsert {
	public static void sort(int[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			int temp = a[i];
			int flag = i;
			for(int j=i+1;j<n;j++){
				if(a[j]<temp){
					temp=a[j];
					flag =j;
				}
				}
			if(flag!=i){
				a[flag]=a[i];
				a[i]=temp;
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
