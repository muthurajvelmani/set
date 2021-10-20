package org.set;
import java.util.HashSet;
import java.util.Set;
public class Returncommanvalues {
public static void main(String[] args) {
	Set<Integer>ji=new HashSet<>();
	ji.add(10);
	ji.add(20);
	ji.add(30);
	ji.add(90);
	ji.add(10);
	ji.add(10);
	ji.add(40);
	ji.add(50);
	System.out.println("set1 ="+ji);
	Set<Integer>ij=new HashSet<>();
	ij.add(30);
	ij.add(40);
	ij.add(50);
	ij.add(60);
	ij.add(80);
	System.out.println("set 2 = "+ij);
	ji.retainAll(ij);
	System.out.println("comman values = "+ji);
}
}
