package leetcode;

public class oddEven {
    
	public  float F(int n){
		//错误检查
		float sum = 0;
		int i = 2;
		int j = 1;
		if(n % 2 == 0){
			while(i <= n){
				sum=sum+(float)1/(i);
				i=i+2;
			}
			//知识点：java两个整数相除会导致结果仍为整数，需要设置类型转换。或者改成两个float相除
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
		float sum =0;//float sum =0.0 不行。只能 double sum = 0.0
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
