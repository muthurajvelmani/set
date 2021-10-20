package org.set;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArraySet {
public static void main(String[]args) {
	Set<Integer> in=new LinkedHashSet<>();
	in.add(82);
	in.add(2);
	in.add(4);
	in.add(45);
	in.add(56);
	in.add(74);
	System.out.println(in);
//size
	int size = in.size();
	System.out.println("size is  "+size);
	//contains
	boolean ct =in.contains(82);
	System.out.println(ct);
//remove
	in.remove(2);
	System.out.println(in);
	//clear
//	in.clear();
	//System.out.println(in);
//get all values from set
	System.out.println("*****enhenced for loop*******");
	for(Integer x: in) {
		System.out.print(x);
	System.out.print("   ");
	}
	System.out.println();
//for each method
System.out.println("******foreach method**********");
in.forEach(System.out::println);
//list
ArrayList li=new ArrayList();
li.add(96);
li.add(63);
li.add(36);
li.add(32);
li.add(25);
li.add(58);
li.add(85);
li.add(52);
li.add(21);
li.add(14);
li.add(47);
li.add(74);
li.add(41);
System.out.println("******list**********");
System.out.println(li);
System.out.println(" size of list is   "+li.size());
//remove duplicate add list to set
Set<Integer> in1=new LinkedHashSet<>();
in1.addAll(li);
System.out.println(in1);
// duplicate count 
System.out.println(li.size()-in1.size());
//ascanding ordeer
//ascii
Set<Integer> in2=new TreeSet<>();
in2.add(98);
in2.add(87);
in2.add(74);
in.add(65);
System.out.println(in2);




















}
}
