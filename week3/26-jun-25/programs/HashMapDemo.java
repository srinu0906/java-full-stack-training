import java.util.HashMap;
public class HashMapDemo{
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Swarup");
		hm.put(2, "Rahul");
		hm.put(3, "Swarup");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get(2)); 
		hm.remove(2);
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
	}
}