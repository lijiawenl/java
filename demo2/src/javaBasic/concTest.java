package javaBasic;



public class concTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   concTest as =new concTest();//必须要有一个外部类才能调用。在静态内部类时不一样
       MyThread thread = as.new MyThread();
       thread.start();
       MyThread2 thread2 = new MyThread2();
       thread2.start();
       
       MyThread3 thread3 = new MyThread3();
       Thread t = new Thread(thread3);
        t.start();//调用start方法表示线程是就绪的状态，之后调用run()方法才能够运行。当直接调用run()方法相当于直接调用一个普通的函数，就不存在多线程调度等
	}
	class MyThread extends Thread{
		public void run(){
			System.out.println("继承类");
		}
	}//这样是内部类的形式,
}
//继承Thread类，然后重写run()接口
class MyThread2 extends Thread{
	public void run(){
		System.out.println("hh加油");
	}
}//这样是内部类的形式,
//实现runnable()接口，实现run()方法；创建tread对象，用实现runnable接口对象作为参数
class MyThread3 implements Runnable{
	public void run() {
		System.out.println("实现接口");
	}
}
//main方法其实也是一个线程。在java中所以的线程都是同时启动的，至于什么时候，哪个先执行，完全看谁先得到CPU的资源。
