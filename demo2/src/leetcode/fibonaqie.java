package leetcode;

public class fibonaqie {

	// �ݹ�汾
	public static int F(int n) {
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		
		return F(n-1)+F(n-2);
	}
	
	//�ǵݹ�汾

	
	public static int F1(int n) {
	    
		int[] m = new int[n];
		m[0]=1;
		m[1]=2;
		for(int i =2;i<n;i++){
		m[i] =m[i-1]+m[i-2];
	}
		return m[n-1];
	}
	//������Ŀ����1+2!+3!+...+20!�ĺ� 
	public static long F2(int n){
		long pac=1;
		long sum =0;
		for (int i = 1; i <= n; i++) {
			pac=pac*i;
			sum=sum+pac;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int m = F1(6);
      System.out.println(m);
      long m2 = F2(3);
      System.out.println(m2);
	}

}
