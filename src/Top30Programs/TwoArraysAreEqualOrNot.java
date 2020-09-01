package Top30Programs;

public class TwoArraysAreEqualOrNot {
	public static void main(String args[])
	{
		int[] a1 = {1,12,13,14,11,17};
		int[] a2 = {1,2,13,14,11,17};
		boolean flag = true;
		if(a1.length==a2.length)
		{
			for(int i = 0 ; i <a1.length; i++)
			{
				if(a1[i]!=a2[i])
				{
				    flag = false;
				    break;
				}
			}
			
		}
		else
		{
			flag= false;
		}
		if(flag==true)
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}
