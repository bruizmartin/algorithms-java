package bruizmartin.utils.algorithms;


public class ShellSort implements SortAlgorithm {
	
	private static final String NAME = "Shell Sort";
	
	public <T extends Comparable<T>> void sort(T[] list) {
		
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(list[i-1]) < 0) {
				T t = list[i];
				int j = 0;
				for (j = i-1; j >= 0 && list[j].compareTo(t) > 0; j--) {
					list[j+1] = list[j];
				}
				list[j+1] = t; 
			}
		}
	}

	public String getName() {
		return NAME;
	}
	
}