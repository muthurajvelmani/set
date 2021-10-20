package org.set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Listintosetusingaddall2 {
	public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(100);
	li.add(200);
	li.add(300);
	li.add(400);
	li.add(500);
	li.add(600);
	li.add(700);
	li.add(100);
	li.add(300);
	li.add(500);
	System.out.println("List = "+li);
	Set<Integer>il=new LinkedHashSet<>();
	il.addAll(li);
	System.out.println("List to Set = "+il);
}

}
