package Euler;

import java.util.HashSet;

public class Edge {
	Double weight;
	HashSet<Vertex> verticies;
	
	public Edge(Double weight, Vertex one, Vertex two) {
		this.weight = weight;
		this.verticies.add(one);
		this.verticies.add(two);
	}
	
}
