package Top30Programs;

public class LeniearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {12,56,98,45,33,32,45,67};
		int length = a.length;
		int searchItem = 45;
		boolean flag =false;
		
		for(int i = 0 ; i<length; i++)
		{
			if(searchItem==a[i])
			{
				System.out.println("Item Found");
				flag=true;
				break;
			}
			
				
		}
		if(flag==false)
		{
		System.out.println("Item Not Found");	
		}
	}

}
