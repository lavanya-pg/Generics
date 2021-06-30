package generics;

public class PrintArray 
{
	public static void main(String[] args)
	{
		String s1 = "person";
		String s2 = "dog";
		String s3 = "bird";
		if ( s1.length()>s2.length() && s1.length()>s3.length() )
		System.out.println("largest String is" +s1);
		else if ( s2.length()>s1.length() && s2.length()>s3.length())
		System.out.println("largest String is" +s2);
		else
		System.out.println("largest String is:" +s3);
	}

}
