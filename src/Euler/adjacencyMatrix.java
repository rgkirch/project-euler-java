package Euler;

import java.io.File;
import java.util.Scanner;

public class adjacencyMatrix
{
	int dimension;
	Double[] data;

	public adjacencyMatrix(int dimension)
	{
		this.dimension = dimension;
		this.data = new Double[dimension];
	}

	public adjacencyMatrix(int dimension, Double[] data)
	{
		this.dimension = dimension;
		this.data = data;
	}

	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		for(Double x : this.data)
		{
			builder.append(x);
		}
		return builder.toString();
	}
	
	public Double edgeWeight(int x, int y)
	{
		return this.data[x * this.dimension + y];
	}
}
