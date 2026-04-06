package PRACTISE1;

import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		OurGenericList<Integer> list = new OurGenericList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println();
		Iterator<Integer> Iterator = list.iterator();
	for(int x : list)
		System.out.println(x);
	}
}