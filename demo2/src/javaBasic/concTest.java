package javaBasic;



public class concTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   concTest as =new concTest();//����Ҫ��һ���ⲿ����ܵ��á��ھ�̬�ڲ���ʱ��һ��
       MyThread thread = as.new MyThread();
       thread.start();
       MyThread2 thread2 = new MyThread2();
       thread2.start();
       
       MyThread3 thread3 = new MyThread3();
       Thread t = new Thread(thread3);
        t.start();//����start������ʾ�߳��Ǿ�����״̬��֮�����run()�������ܹ����С���ֱ�ӵ���run()�����൱��ֱ�ӵ���һ����ͨ�ĺ������Ͳ����ڶ��̵߳��ȵ�
	}
	class MyThread extends Thread{
		public void run(){
			System.out.println("�̳���");
		}
	}//�������ڲ������ʽ,
}
//�̳�Thread�࣬Ȼ����дrun()�ӿ�
class MyThread2 extends Thread{
	public void run(){
		System.out.println("hh����");
	}
}//�������ڲ������ʽ,
//ʵ��runnable()�ӿڣ�ʵ��run()����������tread������ʵ��runnable�ӿڶ�����Ϊ����
class MyThread3 implements Runnable{
	public void run() {
		System.out.println("ʵ�ֽӿ�");
	}
}
//main������ʵҲ��һ���̡߳���java�����Ե��̶߳���ͬʱ�����ģ�����ʲôʱ���ĸ���ִ�У���ȫ��˭�ȵõ�CPU����Դ��
