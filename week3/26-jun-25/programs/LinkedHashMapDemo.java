import java.util.LinkedHashMap;
 
public class LinkedHashMapDemo{
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> tm = new LinkedHashMap<Integer,String>();
		// tm.put(null, "Swarup");
		// tm.put(3,"Rahul");
		// tm.put(5, "Nirmal");
		// tm.put(2, "Swarup");
		// tm.put(null, "Salmaan");
		// System.out.println(tm); // not sorted as per the key
		//                         // insertion order is maintain
        tm.put(null, "Swarup");
		tm.put(3,"Rahul");
		tm.put(5, "Nirmal");
		tm.put(2, "Swarup");
		tm.put(null, "Salmaan");
		System.out.println(tm.size());// 4
		System.out.println(tm);
		                         // not sorted as per the key
		                        // insertion order is maintain
	}
}