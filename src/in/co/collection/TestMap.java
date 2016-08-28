package in.co.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		int size = map.size();// get size of map
		String val = (String) map.get("2");// get value
		map.remove("1");// remove by key
		boolean flag = map.containsKey("1");
		flag = map.containsKey("two");
		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(k);
		}
		Collection values = map.values();// get values
		Set keysValue = map.entrySet();// get k-v pair

	}
}
