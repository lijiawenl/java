package leetcode;

public class oddEven {
    
	public  float F(int n){
		//������
		float sum = 0;
		int i = 2;
		int j = 1;
		if(n % 2 == 0){
			while(i <= n){
				sum=sum+(float)1/(i);
				i=i+2;
			}
			//֪ʶ�㣺java������������ᵼ�½����Ϊ��������Ҫ��������ת�������߸ĳ�����float���
			return sum;
		}else {
			while(j <= n){
				sum+=1.f/(j);
			     j=+2;
			}
			
			return sum;
			
		}
	}
	public float F1(int n ){
	    int i = n;
		float sum =0;//float sum =0.0 ���С�ֻ�� double sum = 0.0
		while(i > 0){
			sum+=(float)1/(i);
			 i = i - 2;
			 System.out.print(i); 
		}
		return sum;
	}
	public static void main(String[] args) {
		
       oddEven mEven = new oddEven();
       float s = mEven.F1(7);
       System.out.print(s);
       //float zt = 0;
       //zt = zt + 1.f/2;
       //System.out.print(zt);
	}

}
