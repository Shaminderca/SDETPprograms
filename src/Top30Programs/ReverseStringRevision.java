package Top30Programs;

import java.util.Scanner;

public class ReverseStringRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String[] strNew = str.split(" ");
		String strReverse=" ";
		String strWord=" ";
        for(String a: strNew)
        {
        	
           for(int i=a.length()-1 ; i>=0 ; i--)	
           {
        	   strWord = strWord+ a.charAt(i);
           }
           strReverse =   strReverse+ strWord +" ";
        }
System.out.println(strReverse);
	}

}
