package leetcode;

public class HeapSort {
	/*public static void adjustMinHeap(int[] a,int pos,int len){
		int temp;
		int child;
		for(temp=a[pos];2*pos+1<=len;pos=child){
			child=2*pos+1;
			if(child<len&&a[child]>a[child+1])
				child++;
			if(a[child]<temp)
				a[pos]=a[child];
			else 
				break;
		}
		a[pos]=temp;
	}
	/*将堆调整为最大堆，然后呢交换最后一个节点和堆根节点，其实相当于每次建堆就是找到最大或者最小的值*/
	/*位置是n节点的子节点为2n,右节点时2n+1*/
	/*public static void sort(int[] array){
		int i;
		int len=array.length;
		for(i=len/2-1;i>=0;i--)
			adjustMinHeap(array,i,len-1);
		for(i=len-1;i>=0;i--){
			int temp = array[0];
		    array[0]=array[i];
		    array[i]=temp;
		    adjustMinHeap(array,0,i-1);
		}
		
	}*/
	public static void sort(int[] a){
		int len=a.length;
		for(int i=0;i<len-1;i++){
			buildMaxHeap(a,len-1-i);
			swap(a,0,len-1-i);
		}
	} 
	public static void buildMaxHeap(int[] data,int lastindex){
		for(int i=(lastindex-1)/2;i>=0;i--){//从最后一个节点的父节点开始
			int k=i;
			while(k*2+1<=lastindex){ //k节点的左子节点的索引, while循环保证根最大，然后往下走同样满足
				//，意思是先上走，然后向下保证
				int biggerIndex=2*k+1;
				if(biggerIndex<lastindex){
					//k节点的左子节点的索引 小于最后的，那么存在右节点
				 if(data[biggerIndex]<data[biggerIndex+1])
					biggerIndex++;
				}
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
					k=biggerIndex;//子堆也要保证是符合堆的定义的，当交换后，最大的在最后，自然是升序
				}else{
					break;
				}
			}
		}
	}
	public static void swap(int[] data,int i ,int j){
		int tmp=data[i];
		data[i]=data[j];
		data[j]=tmp;
		
	}
	
	public static void main(String args[]){
		int[] a ={1,9,2,6,5,4,7,3};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
	}

}
