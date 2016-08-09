package p107;

import java.io.FileNotFoundException;

public class p107 {
	public static void main(String[] args) {
		try {
			FileReader.readFile("p107_network.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file.");
		}
	}
}
