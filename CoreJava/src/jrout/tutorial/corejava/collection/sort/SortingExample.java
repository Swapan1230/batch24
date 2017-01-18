package jrout.tutorial.corejava.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<Pen> pens = new ArrayList<Pen>();
		pens.add(new Pen("B","Rotomac","Black"));
		pens.add(new Pen("C","Reynolds","Pink"));
		pens.add(new Pen("A","HolidayInn","Blue"));
		
		System.out.println("Without Sorting");
		System.out.println(pens);
		
		Collections.sort(pens);
		System.out.println("Sort Using Name ");
		System.out.println(pens);
		
		System.out.println("Sort Using Brand ");
		Collections.sort(pens, new BrandSorter());
		System.out.println(pens);
		
		System.out.println("Sort Using Color ");
		// Anonimous Inner Class
		Collections.sort(pens, new Comparator<Pen>() {
			@Override
			public int compare(Pen o1, Pen o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		});
		System.out.println(pens);
		
	}

}
