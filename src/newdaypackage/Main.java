package newdaypackage;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hawk");
		list.add(0, Boolean.TRUE);
		System.out.println(list);
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		safer.add(1, "robin");
		System.out.println(safer);
		
	}

}
