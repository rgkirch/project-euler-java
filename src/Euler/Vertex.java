package Euler;

public class Vertex implements Comparable
{
	private int id;
	
	public Vertex(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}
	
	public int compare(Vertex one, Vertex two)
	{
		return one.compareTo(two);
	}

	public String toString() {
		return String.valueOf(id);
	}

	@Override
	public int compareTo(Object vertex) {
		return Integer.compare(this.id, ((Vertex)vertex).id);
	}
}
