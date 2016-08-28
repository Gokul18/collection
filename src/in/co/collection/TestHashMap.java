package in.co.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("null", "zero");// null key
		map.put("0", "null");// null value
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		// get a value by key
		String val = (String) map.get("1");
		// remove an element by key
		map.remove("4");
		// get collection of keys and print
		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(k);
		}
		// get collection of value and print
		Collection vals = map.values();
		for (Object v : vals) {
			System.out.println(v);
		}
		// print all keys and value pairs
		Set keyValue = map.entrySet();
		for (Object ele : keyValue) {
			Map.Entry pair = (Map.Entry) ele;
			System.out.println(pair.getKey() + " - " + pair.getValue());

		}

	}
}
