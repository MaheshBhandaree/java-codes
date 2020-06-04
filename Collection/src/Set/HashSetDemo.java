package Set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add("B");
	h.add("C");
	h.add("d");
	h.add("z");
	System.out.println(h);
	h.add(null);
	h.add(10);
	System.out.println(h.add("z"));
System.out.println(h);
}
	

}
