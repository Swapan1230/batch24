package jrout.tutorial.corejava.collection.sort;

import java.util.Comparator;

public class BrandSorter implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
