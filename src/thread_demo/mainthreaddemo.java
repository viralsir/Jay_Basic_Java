package thread_demo;
/*


	Multithreading
	In java
	Thread : proccess 

	Main Thread (System Define ) to excute the code which written in main function 
	User Define Thread  task (statement code)   
		
	Thread :- 	code
	
	java.lang.Thread    
	System define thread 
	User Define thread 
	Thread main=new Thread();

Thread



    start()

    public void run(){



    }



*/
class mainthreaddemo
{
	public static void main(String ar[])throws Exception
	{	
		Thread t=Thread.currentThread();



		System.out.println("Thread :"+t);
		System.out.println("Name :"+t.getName());
		t.setName("First");
		System.out.println("Thread :"+t);
		System.out.println("Name :"+t.getName());
		System.out.println("priority :"+t.getPriority());

		System.out.println("Max priority :"+Thread.MAX_PRIORITY);
		System.out.println("Min priority :"+Thread.MIN_PRIORITY);
		System.out.println("Normal priority :"+Thread.NORM_PRIORITY);
		t.setPriority(7);
		System.out.println("Thread:"+t.getPriority());

		for(int i=0;i<=10;i++)
		{
			System.out.println("main :"+i);
			Thread.sleep(500);
		}


	}
}
















	