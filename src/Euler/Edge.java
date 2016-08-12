package Euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Edge {
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
		return "(" + weight + ", (" + verticies.get(0) + ", " + verticies.get(1) + "))";
	}
}
