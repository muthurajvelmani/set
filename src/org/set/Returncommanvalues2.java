package org.set;
import java.util.Set;
import java.util.TreeSet;
public class Returncommanvalues2 {
public static void main(String[] args) {
	Set<Integer>de=new TreeSet<>();
	de.add(10);de.add(20);	de.add(30);de.add(40);de.add(50);de.add(60);de.add(70);de.add(80);
	System.out.println("set1 ="+de);
	Set<Integer>ed=new TreeSet<>();
	ed.add(100);ed.add(200);	ed.add(300);	ed.add(400);	ed.add(500);	ed.add(600);	ed.add(700); ed.add(800);
System.out.println("Set2 = "+ed);
	ed.retainAll(de);
	System.out.println("comman values = "+ed);
}
}


