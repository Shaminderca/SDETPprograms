package Top30Programs;

public class MaxANDMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {11,12,13,145,5,11,12,45,65,98};
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
		System.out.println("mimum value is "+ min);

	}

}
