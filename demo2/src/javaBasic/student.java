package javaBasic;



//����̽������this �ؼ���(1�����ñ��������2.���ù��췽��3. �������ö����ֵ
/*public class Student {
	 private String nam; //����һ����Ա����name

	 public void setName(String nam) {//��������������һ���β�name

	 this.nam=nam;} //���ֲ�������ֵ���ݸ���Ա���� ��nam=nam�õ����Ϊnull

	 public String getName() {
		 return nam;
	 }//������� return "������"+name; }}

	 public static void main(String args[]) 
	 { Student stu=new Student(); stu.setName("����");
	 
	 System.out.println(stu.getName()); }
}*/

//��ʽ�ĵ���super()�Ĺ��췽����
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
      this.show();//this����ָ�ĵ�ǰ�Ķ��󣬴��ڼ̳�ʱָ��������Ķ��󣬹ʵ��������show����
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
      System.out.println(this);//this�Ƕ���Ķ�hash���ֵ
      super.show();
  }
}
