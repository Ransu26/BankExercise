package newdaypackage;

import java.util.HashMap;

public class HashMapLesson {

	public static void main(String[] args) {
		HashMap<String, Integer> obj = new HashMap<>();
		obj.put("Jubilee", 101);
		obj.put("Jubilee", 1);
		System.out.println(obj.get("Jubilee"));
	}

}
