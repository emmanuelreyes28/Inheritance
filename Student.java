
public abstract class Student extends Person implements Comparable //derived class(Subclass)
{
	private int studentID;

	public Student(String name, int age, int studentID)
	{
		//Need super() since we are extending from a Base Class
		//super implicitly gets called with Person default constr.
		super(name, age);
		this.studentID = studentID;
	}
	
	public static Student findMinStudent(){
		Comparable[] c = new Comparable[2];
		c[0] = new InternationalStudent("Richert",21,58725927,6000,"US");
		c[1] = new PartTimeStudent("A",22,55555555,8);
		Student minStudent = (Student) c[0];
		for(int i =1; i < c.length; i++){
			if(c[i].compareTo(minStudent) < 0){
				minStudent = (Student) c[i];
			}
		}
		return minStudent;
	}
	
	//Getter
	public int getStudentID(){
		return studentID;
	}
	
	//Setter 
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}
	
	//A method can be declared as "abstract" if there is no
	//sensible solution to provide an implementation in the base class
	
	public abstract double calculateQuarterlyFees();
	public abstract int getUnitLimit();
	
	/*
	 * -Subclasses that extend an abstract class have two choices:
	 * 	1. Fill in the "hole" by overriding and providing an implementation
	 * 		for the abstract methods in the base class.
	 * 	2. Declare itself as abstract and force subclasses to implement its 
	 * 		abstract methods.
	 * 			-It's not necessary to redefine the abstract method, but it's
	 * 			 good style so people who need to extend the abstract class won't 
	 * 			 "dig" through the hierarchy.
	 */
	
	//Implement the Interface's method in the Student class
	//We can compare students based in their StudentID
	//compares studentIDs
	
	public int compareTo(Object o){
		Student x = (Student) o;
		if (studentID < x.studentID){
			return -1;
		} else if (studentID > x.studentID){
			return 1;
		} else{
			return 0;
		}
	}
}
