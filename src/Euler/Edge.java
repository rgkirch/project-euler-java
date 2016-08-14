package Euler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Edge implements Comparable {
	Double weight;
	HashSet<Vertex> verticies;
	
	public Edge(Double weight, Vertex one, Vertex two) {
		this.verticies = new HashSet<>();
		this.weight = weight;
		this.verticies.add(one);
		this.verticies.add(two);
	}
	
	public String toString() {
		ArrayList<Vertex> verticies = new ArrayList<>(this.verticies);
		Collections.sort(verticies);
		return "(" + weight + ", (" + verticies.get(0) + ", " + verticies.get(1) + "))";
	}
	
	public static Double sum(Collection<Edge> collection)
	{
		Double sum = new Double(0);
		for(Edge edge : collection)
		{
			sum += edge.weight;
		}
		return sum;
	}
	
	public static Edge min(Edge left, Edge right)
	{
		if(left.weight <= right.weight)
		{
			return left;
		} else return right;
	}

	public static Edge min(Collection<Edge> collection)
	{
		Edge min = null;
		for(Edge edge : collection)
		{
			if(edge == null)
			{
				min = edge;
			} else {
				if(min.weight < edge.weight) {
					min = edge;
				}
			}
		}
		return min;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((verticies == null) ? 0 : verticies.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (verticies == null) {
			if (other.verticies != null)
				return false;
		} else if (!verticies.equals(other.verticies))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		return Double.compare(this.weight, ((Edge)o).weight);
	}
	
}
