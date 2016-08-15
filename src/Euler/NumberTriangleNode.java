package Euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// made for p67
public class NumberTriangleNode implements Comparable<NumberTriangleNode>
{
	private HashSet<NumberTriangleNode> parents = null;
	private HashSet<NumberTriangleNode> children = null;
	private Double pathCost = null;
	private Double nodeValue = null;
	
	public NumberTriangleNode(Double value) throws RuntimeException
	{
		if(value != null) {
			this.nodeValue = value;
		} else {
			throw new RuntimeException("can't create numbertrianglenode from null");
		}
	}
	public static ArrayList<NumberTriangleNode> makeNumberTriangle(ArrayList<Double> numbers)
	{
		ArrayList<NumberTriangleNode> nodes = new ArrayList<>();
		for(Double number : numbers)
		{
			nodes.add(new NumberTriangleNode(number));
		}
		return nodes;
	}
	@Override
	public int compareTo(NumberTriangleNode node)
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

/*
   3
  7 4
 2 4 6
8 5 9 3
*/