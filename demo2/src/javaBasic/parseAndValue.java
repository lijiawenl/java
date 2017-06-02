package javaBasic;

public class parseAndValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String s = "123";
       Integer mInteger =Integer.valueOf(s);
       int s1 = Integer.parseInt(s);//valueOf和parseXxx都是静态的方法。直接用对应的对象类调用即可。
       int z = mInteger -10;
       System.out.println(s1);
	}

}
