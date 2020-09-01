package Top30Programs;

import java.util.Arrays;

public class ArrayParallelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {30,49,65,2,5,90,43,1,2,};
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		int[] b = {30,49,65,2,5,90,43,1,2,};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));		

	}

}
