package InterviewFour;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw= new FileWriter("C:\\Users\\lap-47\\Downloads\\test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("prasad annams");
		bw.write("durga prasad");
		bw.write("durga ");
		bw.write("prasad");
		bw.write("hitam prasad");
		bw.write("silpa prasad");

		System.out.println("finished");
		bw.close();
	}

}
