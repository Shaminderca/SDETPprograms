package Top30Programs;

import java.util.HashSet;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Java","Mava","Lava","Java", "Mava","SSS"};
		boolean flag =false;
		
		HashSet<String> obj = new HashSet();
		for(String obj1 : arr)
		{
			if(obj.add(obj1)==false)
			{
				System.out.println("Find Duplicate Element " + obj1);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("No duplicate found");
		}

	}

}
