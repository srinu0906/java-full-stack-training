import java.util.TreeMap;
 
public class TreeMapDemo{
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		// tm.put(1, "Swarup");
		// tm.put(3,"Rahul");
		// tm.put(2, "Swarup");
		// System.out.println(tm);// TreeMap stores key-value pairs in sorted
		//                        // order of "key"

        //                        tm.put(1, "Swarup");
		tm.put(3,"Rahul");
		tm.put(5, "Nirmal");
		tm.put(2, "Swarup");
		System.out.println(tm);
		// HashMap, TreeMap stores key-value pairs in sorted                       // order of "key"
	}
}