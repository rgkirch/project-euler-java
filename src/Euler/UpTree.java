package Euler;

import java.util.Collection;
import java.util.HashMap;

public class UpTree<T> {
	UpTree<T> parent = null;
	T data;
	
	public static <T> HashMap<T, UpTree<T>> makeUpTree(Collection<T> collection)
	{
		HashMap<T, UpTree<T>> map = new HashMap<>();
		for(T t : collection)
		{
			map.put(t, new UpTree<>(t));
		}
		return map;
	}
	
	public T getData() {
		return data;
	}

	public UpTree(T data)
	{
		this.data = data;
	}
	
	public UpTree<T> find()
	{
		if(this.parent == null)
		{
			return this;
		} else {
			return this.parent.find();
		}
	}
	
	public static void union(UpTree leftNode, UpTree rightNode)
	{
		rightNode.find().parent = leftNode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
		UpTree other = (UpTree) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}
	
}
