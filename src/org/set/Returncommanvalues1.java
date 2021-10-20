package org.set;
import java.util.LinkedHashSet;
import java.util.Set;


public class Returncommanvalues1 {
public static void main(String[] args) {
	Set<Integer>de=new LinkedHashSet<>();
	de.add(10);
	de.add(20);
	de.add(30);
	de.add(90);
	de.add(10);
	de.add(10);
	de.add(40);
	de.add(50);
	System.out.println("set1 ="+de);
	Set<Integer>ed=new LinkedHashSet<>();
	ed.add(10);
	ed.add(20);
	ed.add(30);
	ed.add(40);
	ed.add(50);
	ed.add(60);
	ed.add(70);
	ed.add(80);
	ed.add(90);
System.out.println("Set2 = "+ed);
	ed.retainAll(de);
	System.out.println("comman values = "+ed);
}
}
