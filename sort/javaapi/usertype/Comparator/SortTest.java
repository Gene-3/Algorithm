package sort.javaapi.usertype.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
	
	public static void main(String[] args) {
		System.out.println("===== Sort Fruit (Collections) ======");
		List<Fruit> dataList = new ArrayList<>(Arrays.asList(new Fruit("apple", 7000), new Fruit("tomato", 3000), new Fruit("banana", 4000)));
		
		Collections.sort(dataList, new FruitPriceComparator());
		System.out.println(dataList);
		
		Collections.sort(dataList, new FruitNameComparator());
		System.out.println(dataList);
	}
}
