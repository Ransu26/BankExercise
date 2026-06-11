package newdaypackage;
import java.util.Iterator;
import java.util.ArrayList;
public class IteratorLesson {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Lance");
		names.add("Carlos");
		names.add("Gorduiz");
		
		Iterator<String> it = names.iterator();
		System.out.println("\nBefore removing 'Carlos':" + names);
		System.out.println("List of names:");
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			
			if(name.equals("Carlos")) {
				it.remove();
			}
		}
		System.out.println("\nAfter removing 'Carlos':" + names);
	}

}
