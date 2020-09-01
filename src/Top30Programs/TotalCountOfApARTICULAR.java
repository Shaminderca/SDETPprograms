package Top30Programs;

public class TotalCountOfApARTICULAR {
	public static void main(String args[])
	{
		String  str = " Hey I am Working On a project";
		int strOne = str.length();
		String newStr = str.replace("a", "");
		int newlength = newStr.length();
		int Accurance = strOne-newlength;
		System.out.println(strOne);
		System.out.println(newlength);
		
		System.out.println(Accurance);
				
	}

}
