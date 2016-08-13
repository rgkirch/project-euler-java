package Euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Network
{
	int dimension;
	HashMap<Vertex, HashSet<Edge>> networkData;

	public Network(int dimension, ArrayList<Double> edgeWeights)
	{
		System.out.println("Network constructor.");
		this.dimension = dimension;
		this.networkData = new HashMap<Vertex, HashSet<Edge>>();
		for(int vertexIndex = 0; vertexIndex < dimension; ++vertexIndex)
		{
			Vertex vertexOne = new Vertex(vertexIndex);
			for(int i = 0; i < dimension; ++i)
			{
				Double weight = edgeWeights.get(vertexIndex * dimension + i);
				if(weight != Double.NaN)
				{
					Edge edge = new Edge(weight, vertexOne, new Vertex(i));
					if(this.networkData.get(vertexOne) == null)
					{
						this.networkData.put(vertexOne, new HashSet<Edge>());
					}
					HashSet<Edge> adjacentEdges = this.networkData.get(vertexOne);
					adjacentEdges.add(edge);
				}
			}
		}
	}

	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		for(Vertex vertex : this.networkData.keySet())
		{
			builder.append(networkData.get(vertex));
		}
		return builder.toString();
	}
	
	public Double edgeWeight(Vertex x, Vertex y) throws EdgeNotFound
	{
		return this.getEdge(x, y).weight;
	}
	
	public Edge getEdge(Vertex x, Vertex y) throws EdgeNotFound
	{
		HashMap<Vertex, HashSet<Edge>> networkData = this.networkData;
		HashSet<Edge> edges = networkData.get(x);
		if(edges == null)
		{
			throw new EdgeNotFound(x, y);
		}
		for(Edge edge : edges)
		{
			HashSet<Vertex> difference = new HashSet<Vertex>(edge.verticies);
			difference.remove(x);
			if(difference.contains(y))
			{
				return edge;
			}
		}
		throw new EdgeNotFound(x, y);
	}
	
	public ArrayList<Vertex> connectedVerticies(Vertex vertex)
	{
		int start = vertex.getId() * this.dimension;
		int end = start + this.dimension;
		for(int i = start; i < end; i++)
		{
		}
		return new ArrayList<>();
	}
}
