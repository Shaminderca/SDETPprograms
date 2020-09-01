package Top30Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome To Canada";
		String[] str2 =str.split(" ");
		String reverseString = " ";
		for(String a : str2)
		{
			String reverseWord = " ";
			
			for(int i = a.length()-1;i>=0;i--)
			{
				reverseWord  = reverseWord + a.charAt(i);
			}
			reverseString=reverseString+reverseWord +" ";
		}
System.out.println(reverseString);
	}

	

}
