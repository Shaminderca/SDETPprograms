package Top30Programs;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20,30,45,60,65,70,80,90,100,110};
		boolean flag = false;
		int l = 0;
		int h = a.length-1;
		int key = 90;
		while(l<=h)
		{
			int m = (l+h)/2;
			if(a[m]==key)
			{
				System.out.println("Element Found");
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key)
			{ 
				h=m-1;
			}
		}
		
		
		

	}

}
