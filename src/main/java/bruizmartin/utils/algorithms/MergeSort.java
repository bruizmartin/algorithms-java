package bruizmartin.utils.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortAlgorithm {
	
	private static final String NAME = "Merge Sort";

	public <T extends Comparable<T>> void sort(T[] list) {
		mergeSort(list, 0, list.length -1);
	}
	
	private <T extends Comparable<T>> void mergeSort(T[] list, int lb, int ub) {
		if (lb - ub >= 0) {
			return;
		} else {
			int index = (lb + ub) / 2;
			mergeSort(list, lb, index);
			mergeSort(list, index + 1, ub);
			
			List<T> mergedList = new ArrayList<T>();
			
			int i = lb, j = index + 1;
			
			while (i < index + 1 && j < ub + 1) {
				if (list[i].compareTo(list[j]) < 0) {
					mergedList.add(list[i++]);
				} else {
					mergedList.add(list[j++]);
				}
			}
			
			while (i < index + 1) {
				mergedList.add(list[i++]);
			}
			
			while (j < ub + 1) {
				mergedList.add(list[j++]);
			}
			
			for (int k = 0; k < mergedList.size(); k++) {
				list[lb + k] = mergedList.get(k);
			}
		}
	}

	public String getName() {
		return NAME;
	}

}
