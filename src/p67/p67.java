package p67;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;

import Euler.TreeNode;

public class p67
{
	public static void main(String[] args) {
		TreeNode treenode = null;
		try
		{
			treenode = TreeNode.makeTree(FileReader.readFile("p67_triangle.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("could not open file");
			System.exit(1);
			/*
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			System.exit(1);
			*/
		}
		System.out.println(treenode.maxPath());
	}
}
