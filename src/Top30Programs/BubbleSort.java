package Top30Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {50,60,2,3,1,9,19};
		int l = a.length;
		System.out.println("Before Sorting Array Is" + Arrays.toString(a));
		for(int i=0;i<l-1;i++)
		{
			for (int j=0 ; j<l-1;j++)
			{
			
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println("Array After Bubble Sort "+ (i+1)+" Phase " + Arrays.toString(a));
		}

	}

}
