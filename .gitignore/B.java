class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = null;
		int i = s1.length();//nullpointer exception and not getting main end
		System.out.println("main end");
	}
}
/*
main begin
Nullpointer exception
*/