package Top30Programs;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,5,6};
		//Arry should not have duplicates
		//Number should be in range
		int sum=0;
		for(int i =0; i<a.length ; i++)
		{
			sum=sum+a[i]; 
		}
		System.out.println(sum);

	}

}
