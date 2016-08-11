package Euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Network
{
	int dimension;
	HashMap<Vertex, HashSet<Edge>> networkData;

	public Network(int dimension, ArrayList<Double> networkData)
	{
		this.dimension = dimension;
		this.networkData = new HashMap<Vertex, HashSet<Edge>>();
		// no duplicate edges
		// TODO - make the hashmap from the list of double
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
	
	public Double edgeWeight(Vertex x, Vertex y)
	{
		return this.getEdge(x, y).weight;
	}
	
	public Edge getEdge(Vertex x, Vertex y) {
		HashSet<Edge> edges = this.networkData.get(x);
		for(Edge edge : edges) {
			HashSet<Vertex> difference = (HashSet<Vertex>) edge.verticies.clone();
			difference.remove(x);
			if(difference.contains(y)) {
				return edge;
			}
		}
		// does not return edge if edge not found
	}
	
	public ArrayList<Vertex> connectedVerticies(Vertex vertex) {
		int start = vertex.getId() * this.dimension;
		int end = start + this.dimension;
		for(int i = start; i < end; i++) {
		}
		return new ArrayList<>();
	}
}
