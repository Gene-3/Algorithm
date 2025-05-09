package sort.javaapi.usertype.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("===== Sort Comparable Fruit Arrays ======");
		Fruit[] dataArr = {new Fruit("apple", 7000), new Fruit("tomato", 3000), new Fruit("banana", 4000)};
		System.out.println("원본 : " + Arrays.toString(dataArr));
		Arrays.sort(dataArr);
		System.out.println("오름차순 : " + Arrays.toString(dataArr));
		Arrays.sort(dataArr, Comparator.reverseOrder());
		System.out.println("내림차순 : " + Arrays.toString(dataArr));
	}
}
