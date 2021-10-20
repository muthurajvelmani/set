package org.set;
import java.util.HashSet;
import java.util.Set;
public class Getrachvalueofset {
	public static void main(String[] args) {
		Set<Integer>ih=new HashSet<>();
		ih.add(105);
		ih.add(205);
		ih.add(305);
		ih.add(405);
		ih.add(505);
		ih.add(605);
		ih.add(705);
		ih.add(805);
		System.out.println("***********enhanced for loop********* ");
	for(Integer c:ih) {
		System.out.println(c);
	}
	}

}
