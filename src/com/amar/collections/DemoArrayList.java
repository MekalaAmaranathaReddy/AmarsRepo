package com.amar.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Demo for ArrayList
		/*
		 * List<String> list = new ArrayList<>(); list.add("Amara");
		 * list.add("Natha"); list.add("Reddy"); list.add("Mekala");
		 * 
		 * ListIterator<String> listIterator = list.listIterator();
		 * while(listIterator.hasNext()) {
		 * System.out.println(listIterator.next()); }
		 * 
		 * while(listIterator.hasPrevious()) {
		 * System.out.println(listIterator.previous()); }
		 */

		// Demo for LinkedList
		System.out.println("LinkedList Demo");
		// List<String> linkedList1 = new LinkedList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Amara");
		linkedList.add("Natha");
		linkedList.add("Reddy");
		linkedList.add("Mekala");

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("About to remove the First and last element ");
		// linkedList.remove(0);
		linkedList.removeFirst();// this method is LinkedList specific , so we
									// can able to see this method only when we
									// crette the object as LinkedList ln = new
									// LinkedList() ,otherwise we cant access
									// the this method .reason :if creae the
									// objet as List<String> list = new
									// LinkedList<>() ,here we are storing the
									// object reference in List interface ,so we
									// will be able to access only List
									// interface methods.
		// linkedList.remove(linkedList.size()-1);
		linkedList.removeLast();

		for (String str : linkedList) {
			System.out.println(str);
		}

		// Adding the elements at first and last positions

		System.out.println("adding elements at first and last positions");

		// linkedList.add(0, "New Amara");
		linkedList.addFirst("New Amara");

		// linkedList.add(linkedList.size()+1,"New Mekala");
		// linkedList.add(linkedList.size(), "New Mekala");
		linkedList.addLast("New Mekala");

		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Working with Set interfaces
		System.out.println("Working with Set ,LinkedHashSet implementation");
		Set<Integer> numberSet = new LinkedHashSet<>();
		// Adding elements to the Set

		numberSet.add(12);
		numberSet.add(14);
		numberSet.add(12);// duplicates wont be allowed here in the Set and its
							// being removed .
		// out put [12,14]
		// In the LinkedHashSet implementation maintains the ordr of insertion.
		System.out.println(numberSet);

		// Set doesn't have any direct methods to access its elements . We can
		// use iterator or for-each loop to do this .
		Iterator<Integer> iteratorr = numberSet.iterator();
		while (iteratorr.hasNext()) {
			System.out.println(iteratorr.next());
		}

		System.out.println("Working with Set , HashSet implementation");
		Set<Integer> numberHashSet = new HashSet<>();

		numberHashSet.add(21);
		numberHashSet.add(32);
		numberHashSet.add(21);

		System.out.println(numberHashSet);
		for (Integer i : numberHashSet) {
			System.out.println(i); // [32, 21], it is proved that HashSet
									// implementation dont maintains the
									// insertion order and the duplicate value
									// got eliminated .
									// For Sets to detect duplicates among user
									// defined objects the equals() and
									// hashCode() methods must be overridden .

		}
		// ****Apart from preventing duplicates , if a Set is required to
		// have sorted elements , we can use a TreeSet implementation .

		Set<String> courseSet = new TreeSet<>();
		// Adding elements to the Set
		courseSet.add("Java");
		courseSet.add("Hibernate");
		courseSet.add("Angular JS");

		// iterating over the Set using enhanced for loop
		for (String s : courseSet) {
			System.out.println(s);
			// output
			// Angular JS
			// Hibernate
			// Java
		}
		// some methods exclusive to the TreeSet class
		// E first() ,from the Set it returns the first(lowest) element
		// E last() , from Set ,it returs the last (highest) element
		// E ceiling(E element) ,the least element either >= given element is
		// returned.Null is returned if empty .
		// E floor(E element) Greatest element either <= given element is
		// returned.Null is returned if empty .
	}

}
