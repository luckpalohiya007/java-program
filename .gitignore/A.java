class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;//flow terminated at line no 6
		System.out.println("main end");
	}
}
/*
main begin
Arithmatic exception
*/