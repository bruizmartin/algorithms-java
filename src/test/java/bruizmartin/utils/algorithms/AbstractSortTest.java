package bruizmartin.utils.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public abstract class AbstractSortTest {
	
	@Test
	public void testEmpty() {
		Integer[] list = new Integer[]{};
		Integer[] sortedList = new Integer[]{};
		testSort(list, sortedList);
	}
	
	@Test
	public void testOneElement() {
		Integer[] list = new Integer[]{4};
		Integer[] sortedList = new Integer[]{4};
		testSort(list, sortedList);
	}
	
	@Test
	public void testSorted() {
		Integer[] list = new Integer[]{1, 2, 3, 4};
		Integer[] sortedList = new Integer[]{1, 2, 3, 4};
		testSort(list, sortedList);
	}
	
	@Test
	public void testUnsorted1() {
		Integer[] list = new Integer[]{5, 3, 2, 1, 4};
		Integer[] sortedList = new Integer[]{1, 2, 3, 4, 5};
		testSort(list, sortedList);
	}
	
	@Test
	public void testUnsorted2() {
		Integer[] list = new Integer[]{3, 4, 2, 1, 5};
		Integer[] sortedList = new Integer[]{1, 2, 3, 4, 5};
		testSort(list, sortedList);
	}
	
	
	@Test
	public void testUnsorted3() {
		Integer[] list = new Integer[]{3, 4, 2, 1, 5, 6, 7, 8, 9};
		Integer[] sortedList = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		testSort(list, sortedList);
	}
	
	
	private <T extends Comparable<T>> void testSort(T[] list, T[] sortedList) {
		SortAlgorithm algorithm = getSortAlgorithm();
		System.out.println("Start " + algorithm.getName());
		print(list);
		algorithm.sort(list);
		print(list);
		System.out.println("End " + algorithm.getName());
		assertArrayEquals(sortedList, list);
	}
	
	private <T> void print(T[] t) {
		System.out.print("[");
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i]);
			if (i < t.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	protected abstract SortAlgorithm getSortAlgorithm();
	
}
