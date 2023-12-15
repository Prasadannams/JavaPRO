package InterviewFour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataIntoTextFile {

	public static void main(String[] args) throws IOException {

//		
//		FileReader fr= new FileReader("C:\\Users\\lap-47\\Downloads\\test123.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String read ="";
//		
//		while ((read = (br.readLine()))!=null) {
//			
//			System.out.println(read);
//		}
		
		
		
		File fr = new File("C:\\Users\\lap-47\\Downloads\\test123.txt");
		Scanner sc = new Scanner(fr);
		
		while( sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());

		}
		
	}

}
