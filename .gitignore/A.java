class A
{
	public static void main(String[] args) 
	{
		int i = 0, j = 1;
		System.out.println("fib series:");
		System.out.print(i + ", " + j + ", ");
		int k = 0;
		while (k < 100)
		{
			k = i + j;
			System.out.print(k + ", ");
			i = j;
			j = k;
		}

	}
}
