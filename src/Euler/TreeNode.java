package Euler;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeNode
{
	HashSet<TreeNode> children = null;
	double value;
	
	public static TreeNode makeTree(ArrayList<Double> input)
	{
		final int row = 1;
		final int index = 0;
		return new TreeNode(input, row, index);
	}

	public TreeNode(ArrayList<Double> input, int row, int index)
	{
		this.value = input.get(index);
		this.children = new HashSet<>();
		if(index == row * (row + 1) / 2 - 1)
		{
			try
			{
				this.children.add(new TreeNode(input, row + 1, index + row + 1));
			} catch (IndexOutOfBoundsException e) {
			}
		}
		try {
			this.children.add(new TreeNode(input, row + 1, index + row));
		} catch (IndexOutOfBoundsException e) {
		}
	}
}

/* n * (n + 1) / 2
 * (n + 1) * ((n + 1) + 1) / 2 - (n * (n + 1) / 2)
 * (n + 1) * ((n + 1) + 1) / 2 - (n * (n + 1) / 2)
 * 
 * */