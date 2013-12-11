package bruizmartin.utils.algorithms;

public class QuickSort implements SortAlgorithm {
	
	private static final String NAME = "Quick Sort";

	public  <T extends Comparable<T>> void sort(T[] list) {
		quickSort(list, 0, list.length-1);
	}
	
	private <T extends Comparable<T>> void quickSort(T[] list, int lb, int ub) {
		if (ub - lb <= 1) {
			return;
		}
		
		int index = partition(list, lb, ub);
		quickSort(list, lb, index - 1);
		quickSort(list, index , ub);
		
	}
	
	private <T extends Comparable<T>> int partition(T[] list, int lb, int ub) {
		int index = (lb + ub) / 2;
		T pivot = list[index];
		
		boolean finished = false;
		while (!finished) {
			while (list[lb].compareTo(list[index]) < 0) lb++;
			while (list[ub].compareTo(list[index]) > 0) ub--;
			
			if (lb == index) {
				if (ub == index) {
					finished = true;
				} else {
						list[index] = list[ub];
						list[ub] = pivot;
						index = ub;
						pivot = list[index];
				}
			} else if (ub == index) {
					list[index] = list[lb];
					list[lb] = pivot;
					index = lb;
					pivot = list[index];
			} else { 
				T ubTemp = list[ub];
				list[ub] = list[lb];
				list[lb] = ubTemp;
			}
		}
		
		return index;
	}

	public String getName() {
		return NAME;
	}
}
