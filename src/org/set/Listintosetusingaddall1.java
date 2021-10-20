package org.set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Listintosetusingaddall1 {
public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(105);
	li.add(205);
	li.add(305);
	li.add(405);
	li.add(505);
	li.add(605);
	li.add(705);
	li.add(805);
	li.add(505);
	li.add(605);
	System.out.println("List = "+li);
	Set<Integer>il=new LinkedHashSet<>();
	il.addAll(li);
	System.out.println("List to Set = "+il);
	
}

}
