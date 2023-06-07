/*
	User Define Thread 

	1) Inheritance    Thread 

	2) Interface    Runnable 

		create object 

		start()
		
		public void run()
		{
			statement ; 
		}

*/



class Childthread1   implements Runnable
{
	String msg;
	int i,sum;
	Thread t;
	Childthread1(String msg,int i)
	{	// create the object of the thread	
		t=new Thread(this,msg);
		this.msg=msg;
		this.i=i;
		t.start();
	}
	public void run()
	{
		try
		{
			System.out.println(msg+" is started");
			for(int j=i;j<=10;j+=2)
			{
				System.out.println(msg+":"+j);
				sum=sum+j;
				Thread.sleep(500);
			}
			System.out.println("Sum of "+msg+":"+sum);
			System.out.println(msg+" is finished");
		}
		catch(Exception e)
		{
			System.out.println("exception in run :"+e);
		}
	}
}
class udfthread_2
{
	public static void main(String ar[])throws Exception
	{
		int sum=0;
		System.out.println("main thread is started");
		Childthread1 e=new Childthread1("Even",0);
		Childthread1 o=new Childthread1("Odd",1);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main:"+i);
			sum=sum+i;
		}
		// wait()   and notify()
		//e.join();
		//o.join();
		//System.out.println("sum of even :"+e.sum);
		//System.out.println("Sum of odd:"+o.sum);
		System.out.println("Sum of Total No:"+sum);
		System.out.println("main is finished");
	}
}
			





		

















