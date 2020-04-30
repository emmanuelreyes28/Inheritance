
public class Person //Parent Class (Base Class)
{
	//Inheritance is a way of extending functionality and properties
	//of an existing class and allows you to add new features and 
	//overwrite existing ones.

	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Getters
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	//Setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	//Override .toString()
	public String toString(){
		System.out.println("In Person.toString()");
		return "Name: " + name + ", " + "Age: " + age;
	}
		
}
