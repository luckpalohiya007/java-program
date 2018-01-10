class A implements Runnable//runable is interface available in java.lang package
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
class M1  
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		for(int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}
/*
-in the runnable interface only one method that is run method.
-single method interface are also called as functional interfaces .
-while creatin a object to A is creating 
-create an object of thread a1 con under 
*/