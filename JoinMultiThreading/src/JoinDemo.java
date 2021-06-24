
class MyThread extends Thread{
	
	static Thread mt;
public	void run() {
		
	try {
		mt.join();// child thread called join method on main thread object
		//which will on waiting untill main thread end
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=1;i<=10;i++) {
		
		System.out.println("child thread");
	}
	}
}
public class JoinDemo  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread.mt=Thread.currentThread();
		
		MyThread t=new MyThread();
		t.start();//child thread 
		//t.join();// main thread waiting for child thread so program will go in deadlock situation
		for(int i=1;i<=10;i++) {
			
			System.out.println("main thread");
			Thread.sleep(3000);
		}
	}

}
