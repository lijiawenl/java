package JavaBase;

public class valueOrQuote {
//��class̽������java�İ�ֵ���ݺͰ����ô���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 20;
 String mString = "original";
 
 System.out.println(mString);
 F1(mString);
 System.out.println("�������mString="+mString);
 StringBuilder builder = new StringBuilder("asd");
 System.out.println(builder);
 foo(builder);
 System.out.println("�������builder="+builder);
 foo1(builder);
 
	}
	
	public static void F(int a){
		a= 50;
		System.out.println("�����ڵ�a"+a);
	}
	public static void F1(String mString){
		mString= "sad";
		System.out.println("�����ڵ�mString="+mString);
	}
	public static void foo(StringBuilder builder) {
	    builder= new StringBuilder("ipad");//�·�����һ���ڴ�ռ����builder
	    System.out.println("�����ڵ�builder="+builder);
	    builder.append("a");
	    System.out.println("�����ڵļ���a��builder="+builder);
	}
	public static void foo1(StringBuilder builder) { 
	    builder.append("a");//�����ô��ݣ����ݵ�������
	    System.out.println("�����ڵ�builder="+builder);
	}
//ԭ�ȵ�ֵʼ��û�з����ı�

}
