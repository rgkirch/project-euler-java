package p107;

import java.io.FileNotFoundException;

import Euler.Network;

public class p107 {
	public static void main(String[] args) {
		Network adjMat = null;
		try {
			adjMat = new Network(40, FileReader.readFile("p107_network.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Could not open file.");
			System.err.println("Exiting.");
			System.exit(1);
		}
		if(adjMat != null)
		{
			
		}
	}
}
