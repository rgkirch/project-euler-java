package Euler;

import java.util.Arrays;
import java.util.HashSet;

public class EdgeNotFound extends Exception
{
	HashSet<Vertex> verticies;
	public EdgeNotFound(Vertex x, Vertex y)
	{
		this.verticies = new HashSet<>();
		this.verticies.add(x);
		this.verticies.add(y);
	}
	public String toString()
	{
		Vertex[] verticies = this.verticies.toArray(new Vertex[this.verticies.size()]);
		Arrays.sort(verticies);
		//ArrayList<Vertex> verticies = Collections.sort(new ArrayList<Vertex>(this.verticies));
		return "Edge from " + verticies[0] + " to " + verticies[1] + " not found.";
	}
}
