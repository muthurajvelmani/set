package org.set;
import java.util.LinkedHashSet;
import java.util.Set;
public class Removeall1 {
	public static void main(String[] args) {
		Set<Integer>ki=new LinkedHashSet<>();
		ki.add(10);	ki.add(20);	ki.add(30);	ki.add(90);	ki.add(10);	ki.add(10);	ki.add(40);	ki.add(50);
		System.out.println("set1 = "+ki);
	Set<Integer>ik=new LinkedHashSet<>();
	ik.add(10);
	ik.add(20);
	ik.add(60);
	ik.add(50);
	ik.add(40);
	ik.add(70);
	ik.add(80);
	ik.add(90);
	System.out.println("set2 = "+ik);
	ki.removeAll(ik);
	System.out.println("remove all common = "+ki);
	}
}
