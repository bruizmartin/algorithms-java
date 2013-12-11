package bruizmartin.utils.algorithms;

public interface SortAlgorithm {

	public <T extends Comparable<T>> void sort(T[] list);
	
	public String getName();
}
