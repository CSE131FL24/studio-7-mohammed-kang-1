package studio7;
import java.util.Scanner;

public class House {
	private String name;
	private int age = 0;
	
	public House(String name, int age) {
	this.name = name;
	this.age = age; 
	}
	
	public void PersonName() {
		System.out.println(this.name + " is " + this.age + " years old");
	}

	public void setName (String N) {
		Scanner in = new Scanner(System.in);
		String name = in.toString();
		System.out.println("N");

	} 
	
	public static void main(String[] args) {
		House Joe = new House("Joe", 70);
		House Zoe = new House("Zoe", 80);
		
		Joe.PersonName();
		Zoe.PersonName();
		//we're done!
	}
}



