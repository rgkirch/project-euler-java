package p107;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	public FileReader(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName)).useDelimiter("-|[0-9]+");
		System.out.println("from filereader");
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
}
