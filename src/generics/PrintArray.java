package generics;

public class PrintArray 
{
	public static void main(String[] args)
	{
		int a = 60, b= 36, c= 28;
		if ( a>b && a>c )
		System.out.println(a+ " is the largest number");
		else if ( b>a && b>c)
		System.out.println(b+  " is the largest number");
		else
		System.out.println(c+  " is the largest number");
	}

}
