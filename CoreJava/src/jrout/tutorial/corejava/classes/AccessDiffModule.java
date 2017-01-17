package jrout.tutorial.corejava.classes;

import jrout.tutorial.corejava.tax.TaxCalculator;

public class AccessDiffModule {

	public static void main(String[] args) {
		TaxCalculator tc = new TaxCalculator();
		System.out.println(tc.calcTax(4000));
		
	}

}
