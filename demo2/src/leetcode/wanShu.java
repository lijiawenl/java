package leetcode;



public class wanShu {
//����һ����Χ�ڵ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        F(1000);
	}
	public static void F(int n){

		for(int i=2;i<=n;i++){
			int pa = 0;
			for(int j=1;j<i;j++){
				if(i%j == 0){
					pa = pa+j;
				}
			}
			if(pa == i){
				System.out.println(pa);
			}
		}
	}

}
