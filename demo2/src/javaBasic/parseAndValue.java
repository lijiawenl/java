package javaBasic;

public class parseAndValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String s = "123";
       Integer mInteger =Integer.valueOf(s);
       int s1 = Integer.parseInt(s);//valueOf��parseXxx���Ǿ�̬�ķ�����ֱ���ö�Ӧ�Ķ�������ü��ɡ�
       int z = mInteger -10;
       System.out.println(s1);
	}

}
