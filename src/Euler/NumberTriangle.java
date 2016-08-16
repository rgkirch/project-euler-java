package Euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

/*
// made for p67
public class NumberTriangle
{
	ArrayList<ArrayList<Node>> data = null;

	public NumberTriangle(ArrayList<Double> numbers)
	{
		this.data = new ArrayList<>();
		int row = 0;
		Iterator<Double> numbersIterator = numbers.iterator();
		while(numbersIterator.hasNext())
		{
			this.data.add(new ArrayList<>());
			for(int col = 0; col <= row; ++col)
			{
				this.data.get(row).add(new Node(numbersIterator.next()));
			}
			row++;
		}
		// fill in the nodes parents and children
		for(ArrayList<Node> nodes : this.data)
		{
			for(Node node : nodes)
			{
				// left child is currentIndex + rowLength
				// right child is currentIndex + rowLength + 1
				// left parent is currentIndex - (rowLength - 1) - 2
				// right parent is currentIndex - (rowLength - 1) - 1
				if(node == nodes.get(0))
				{
				}
			}
		}
	}
}
private class Node implements Comparable<Node>, Iterable<Node>
{
	public HashSet<Node> children = null;
	public Double pathCost = null;
	public Double nodeValue = null;
	
	public Node(Double value) throws RuntimeException
	{
		if(value != null) {
			this.nodeValue = value;
		} else {
			throw new RuntimeException("can't create a node from null");
		}
	}
	@Override
	public int compareTo(Node node)
	{
		return Double.compare(this.getPathCost(), node.getPathCost());
	}
	public Double getPathCost()
	{
		if(this.pathCost == null)
		{
			if(this.parents != null && !this.parents.isEmpty())
			{
				this.pathCost = Collections.max(this.parents).pathCost + this.nodeValue;
			} else {
				this.pathCost = this.nodeValue;
			}
		}
		return this.pathCost;
	}
}
*/

/*
   3
  7 4
 2 4 6
8 5 9 3
*/