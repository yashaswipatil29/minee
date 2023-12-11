package day3;

public class Player {
   private String name;
   private int age;
   
public Player() {
	System.out.println("In player constructor()");
}
public Player(String name, int age) {
	System.out.println("In player Constructor(name ,int)");
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
