package Euler;

public class Vertex implements Comparable
{
	private int id;

	public Vertex(int id)
	{
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Vertex other = (Vertex) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String toString() {
		return String.valueOf(id);
	}

	@Override
	public int compareTo(Object vertex) {
		return Integer.compare(this.id, ((Vertex)vertex).id);
	}
}
