package test;

public class FizzBuzz {
	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100; i++)
		{
			String result="";
		    String outp = "";
		    if (i % 3 == 0) outp += "Fizz";
		    if (i % 5 == 0) outp += "Buzz";
		    if (outp == "") outp = Integer.toString(i);
		    result += outp + ", ";
		    System.out.println(result);
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("total time:> "  +  totalTime);
	}

}
