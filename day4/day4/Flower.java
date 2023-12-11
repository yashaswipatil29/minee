package day4;

import java.util.Objects;

public class Flower {

	private String name;
	private String color;
	public Flower()
	{
		name="Lotus";
		color="red";
	}
	public Flower(String name, String color) {
		
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Flower [name=" + name + ", color=" + color + "]";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Inside Finalize()");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}
	
}
