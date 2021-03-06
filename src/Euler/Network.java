package Euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

// made for problem 107
public class Network
{
	int dimension;
	HashMap<Vertex, HashSet<Edge>> networkData;
	
	public Double totalEdgeWeight()
	{
		return Edge.sum(this.edges());
	}

	public Network(int dimension, ArrayList<Double> edgeWeights)
	{
		this.dimension = dimension;
		this.networkData = new HashMap<Vertex, HashSet<Edge>>();
		for(int vertexIndex = 0; vertexIndex < dimension; ++vertexIndex)
		{
			Vertex vertexOne = new Vertex(vertexIndex);
			for(int i = 0; i < dimension; ++i)
			{
				Double weight = edgeWeights.get(vertexIndex * dimension + i);
				if(!weight.equals(Double.NaN))
				{
					Edge edge = new Edge(weight, vertexOne, new Vertex(i));
					if(!this.networkData.containsKey(vertexOne))
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
			builder.append("vertex ");
			builder.append(vertex);
			builder.append(" = ");
			builder.append(networkData.get(vertex));
		}
		builder.append(" ");
		return builder.toString();
	}
	
	public Double edgeWeight(Vertex x, Vertex y) throws EdgeNotFound
	{
		return this.getEdge(x, y).weight;
	}
	
	public Edge getEdge(Vertex x, Vertex y) throws EdgeNotFound
	{
		HashMap<Vertex, HashSet<Edge>> networkData = this.networkData;
		if(!networkData.containsKey(x))
		{
			throw new EdgeNotFound(x, y);
		} else {
			HashSet<Edge> edges = networkData.get(x);
			for(Edge edge : edges)
			{
				HashSet<Vertex> difference = new HashSet<Vertex>(edge.verticies);
				difference.remove(x);
				if(difference.contains(y))
				{
					return edge;
				}
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
	
	public HashSet<Vertex> verticies()
	{
		return new HashSet<>(this.networkData.keySet());
	}
	
	public HashSet<Edge> edges()
	{
		HashSet<Edge> allEdges = new HashSet<>();
		for(HashSet<Edge> someEdges : networkData.values())
		{
			for(Edge edge : someEdges)
			{
				allEdges.add(edge);
			}
		}
		return allEdges;
	}
	
	public HashSet<Edge> kruskalsMinimumSpanningTree()
	{
		HashSet<Edge> answer = new HashSet<>();
		HashMap<Vertex, UpTree<Vertex>> structure = UpTree.makeUpTree(this.verticies());
		ArrayList<Edge> listOfAllEdges = new ArrayList<>(this.edges());
		Collections.sort(listOfAllEdges);
		for(Edge edge : listOfAllEdges)
		{
			ArrayList<Vertex> verticies = new ArrayList<>(edge.verticies);
			Vertex one = verticies.get(0);
			Vertex two = verticies.get(1);
			if(!structure.get(one).find().equals(structure.get(two).find()))
			{
				UpTree.union(structure.get(one), structure.get(two));
				answer.add(edge);
			}
		}
		return answer;
	}
}
