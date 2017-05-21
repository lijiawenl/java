package javaBasic;



//该类探究的是this 关键字(1：调用本类的属性2.调用构造方法3. 返回引用对象的值
/*public class Student {
	 private String nam; //定义一个成员变量name

	 public void setName(String nam) {//设置姓名，定义一个形参name

	 this.nam=nam;} //将局部变量的值传递给成员变量 ，nam=nam得到结果为null

	 public String getName() {
		 return nam;
	 }//获得姓名 return "姓名："+name; }}

	 public static void main(String args[]) 
	 { Student stu=new Student(); stu.setName("李明");
	 
	 System.out.println(stu.getName()); }
}*/

//隐式的调用super()的构造方法。
//
public class student {
  public static void main(String[] args) {
      Child child = new Child(1);
      child.show();
  }
}

class Parent {
  public String str;
  Parent(){ 	
  	 this(1);
  	 System.out.println('M');
     
  }
  Parent(int a) {
      this.str = "Parent";
      this.show();//this都是指的当前的对象，存在继承时指的是子类的对象，故调用子类的show方法
  }
  public void show() {
      System.out.println(this.str+'p');
  }
}

class Child extends Parent {
  public String str;
  Child() {
  }
  Child(int a) {
      str = "Child";
  }
  public void show() {
      System.out.println(this);//this是对象的额hash码的值
      super.show();
  }
}
