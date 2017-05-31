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
	/*���ѵ���Ϊ���ѣ�Ȼ���ؽ������һ���ڵ�ͶѸ��ڵ㣬��ʵ�൱��ÿ�ν��Ѿ����ҵ���������С��ֵ*/
	/*λ����n�ڵ���ӽڵ�Ϊ2n,�ҽڵ�ʱ2n+1*/
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
		for(int i=(lastindex-1)/2;i>=0;i--){//�����һ���ڵ�ĸ��ڵ㿪ʼ
			int k=i;
			while(k*2+1<=lastindex){ //k�ڵ�����ӽڵ������, whileѭ����֤�����Ȼ��������ͬ������
				//����˼�������ߣ�Ȼ�����±�֤
				int biggerIndex=2*k+1;
				if(biggerIndex<lastindex){
					//k�ڵ�����ӽڵ������ С�����ģ���ô�����ҽڵ�
				 if(data[biggerIndex]<data[biggerIndex+1])
					biggerIndex++;
				}
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
					k=biggerIndex;//�Ӷ�ҲҪ��֤�Ƿ��϶ѵĶ���ģ��������������������Ȼ������
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
