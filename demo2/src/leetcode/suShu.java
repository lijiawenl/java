package leetcode;

public class suShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum ;
		int j ;
for (sum=2; sum <=100; sum++) {
	for (j = 2; j <= sum/2; j++) {
		if(sum%j == 0){
			break;
			}
		//�������������С������һ��
	}	
	if(j> sum/2){
	System.out.println(sum);
	}
	
}


	}

}
