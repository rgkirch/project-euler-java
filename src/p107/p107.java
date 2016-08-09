package p107;

import java.io.FileNotFoundException;

public class p107 {
	public static void main(String[] args) {
		System.out.println("begin");
		try {
			FileReader reader = new FileReader("p107_network.txt");
		} catch (FileNotFoundException e) {
			// code
		}
		System.out.println("end");
	}
}
