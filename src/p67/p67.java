package p67;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import Euler.NumberTriangleNode;

public class p67
{
	public static void main(String[] args) {
		ArrayList<NumberTriangleNode> nodes = null;
		try
		{
			nodes = NumberTriangleNode.makeNumberTriangle(FileReader.readFile("p67_triangle.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("could not open file");
			System.exit(1);
		} catch(RuntimeException e) {
			System.out.println("found nulls in file (probably)");
			System.exit(1);
		}
		System.out.println(Collections.max(nodes).getPathCost());
	}
}
