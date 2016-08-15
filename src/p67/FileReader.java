package p67;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader
{
	private FileReader() {};
	
	public static ArrayList<Double> readFile(String fileName) throws FileNotFoundException
	{
		ArrayList<Double> data = new ArrayList<>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName));
			while(scanner.hasNext()) {
				data.add(scanner.nextDouble());
			}
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		return data;
	}
}
