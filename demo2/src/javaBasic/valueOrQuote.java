package JavaBase;

public class valueOrQuote {
//该class探究的是java的按值传递和按引用传递
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 20;
 String mString = "original";
 
 System.out.println(mString);
 F1(mString);
 System.out.println("函数外的mString="+mString);
 StringBuilder builder = new StringBuilder("asd");
 System.out.println(builder);
 foo(builder);
 System.out.println("函数外的builder="+builder);
 foo1(builder);
 
	}
	
	public static void F(int a){
		a= 50;
		System.out.println("函数内的a"+a);
	}
	public static void F1(String mString){
		mString= "sad";
		System.out.println("函数内的mString="+mString);
	}
	public static void foo(StringBuilder builder) {
	    builder= new StringBuilder("ipad");//新分配了一个内存空间叫做builder
	    System.out.println("函数内的builder="+builder);
	    builder.append("a");
	    System.out.println("函数内的加上a的builder="+builder);
	}
	public static void foo1(StringBuilder builder) { 
	    builder.append("a");//按引用传递，传递的是引用
	    System.out.println("函数内的builder="+builder);
	}
//原先的值始终没有发生改变

}
