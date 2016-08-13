package p107;

import java.io.FileNotFoundException;

import Euler.EdgeNotFound;
import Euler.Network;
import Euler.Vertex;

public class p107 {
	public static void main(String[] args) {
		Network network = null;
		try {
			network = new Network(40, FileReader.readFile("p107_network.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Could not open file.");
			System.err.println("Exiting.");
			System.exit(1);
		}
		if(network != null)
		{
			//System.out.println(network);
		}
		network.minimumSpanningTree();
	}
}
