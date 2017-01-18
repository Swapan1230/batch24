package jrout.tutorial.corejava.collection.sort;

public class Pen implements Comparable<Pen> {
	private String name;
	private String brand;
	private String color;
	
	public Pen(String name, String brand,String color) {
		this.name = name; this.brand = brand; this.color =  color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return this.name +" " + this.brand +" " + this.color;
	}
	@Override
	public int compareTo(Pen o) {
//		return this.name.compareTo(((Pen)o).getName());
		return this.name.compareTo(o.getName());
	}
}
