package org.set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Listintosetusingaddall {
public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	System.out.println("List = "+li);
	Set<Integer>il=new LinkedHashSet<>();
	il.addAll(li);
	System.out.println("List to Set = "+il);
	
}
}
