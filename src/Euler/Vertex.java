package Euler;

public class Vertex {
	private int id;
	
	public Vertex(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int compareTo(Vertex v) {
		return Integer.compare(this.id, v.id);
	}

}
