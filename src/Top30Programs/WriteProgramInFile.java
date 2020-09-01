package Top30Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteProgramInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\shami\\OneDrive\\Desktop\\WriteData.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello I am Working");
		bw.write("Hello I am Sleeping");
		System.out.println("Hey Done");
		bw.close();
		

	}

}
