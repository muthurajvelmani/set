package org.set;
import java.util.HashSet;
import java.util.Set;
public class Removeall {
public static void main(String[] args) {
	Set<Integer>ki=new HashSet<>();
	ki.add(10);	ki.add(20);	ki.add(30);	ki.add(90);	ki.add(10);	ki.add(10);	ki.add(40);	ki.add(50);
	System.out.println("set1 = "+ki);
Set<Integer>ik=new HashSet<>();
ik.add(30);
ik.add(40);
ik.add(50);
ik.add(60);
ik.add(80);
System.out.println("set2 = "+ik);
ki.removeAll(ik);
System.out.println("remove all common = "+ki);
}
}

