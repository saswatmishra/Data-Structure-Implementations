package test;

public class StringReverse {

	public String reverseString(String args) {
		String temp = "";
		if (args.length() == 1)
			return args;
		else {
			String lastChar = args.substring(args.length() - 1, args.length());
			String remainingString = args.substring(0, args.length() - 1);
			temp = lastChar + reverseString(remainingString);// with recursion
			/*
			 * Without recursion, using StringBuffer reverse()
			 */

			StringBuffer sb = new StringBuffer(remainingString);
			temp = lastChar + sb.reverse();

			return temp;
		}

	}

	public static void main(String args[]) {
		StringReverse test = new StringReverse();
		System.out.println(test.reverseString("hello world!"));
	}

}
