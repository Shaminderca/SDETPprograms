package Top30Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\shami\\OneDrive\\Desktop\\WriteData.txt");
		BufferedReader br = new BufferedReader(fr);
		String st;
		while((st = br.readLine()) != null)
		{
			System.out.println(st);
		}
		System.out.println("Done");

	}

}
