package generics;

public class PrintArray 
{
	public static void main(String[] args)
	{
		float a = (float) 10.9, b = (float) 80.5, c= (float) 70.7;
		if ( a>b && a>c )
		System.out.println(a+ " is the largest number");
		else if ( b>a && b>c)
		System.out.println(b+  " is the largest number");
		else
		System.out.println(c+  " is the largest number");
	}

}
