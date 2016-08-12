package Euler;

import java.util.HashSet;

public class EdgeNotFound extends RuntimeException {
	HashSet<Vertex> verticies;

	public EdgeNotFound(Vertex x, Vertex y) {
		this.verticies = new HashSet<>();
		this.verticies.add(x);
		this.verticies.add(y);
	}
	
}
