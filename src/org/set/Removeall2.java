package org.set;
import java.util.Set;
import java.util.TreeSet;
public class Removeall2 {
	public static void main(String[] args) {
		Set<Integer>ki=new TreeSet<>();
		ki.add(10);	ki.add(20);	ki.add(30);	ki.add(40);	ki.add(50);	ki.add(60);	ki.add(70);	ki.add(80);
		System.out.println("set1 = "+ki);
	Set<Integer>ik=new TreeSet<>();
	ik.add(100);
	ik.add(200);
	ik.add(600);
	ik.add(500);
	ik.add(600);
	ik.add(700);
	ik.add(8000);
	System.out.println("set2 = "+ik);
	ki.removeAll(ik);
	System.out.println("remove all common = "+ki);
	}
}
