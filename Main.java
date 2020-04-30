
public class Main
{

	public static void main(String[] args)
	{
/*		Student s = new Student("Richert", 21, 58725927);
		System.out.println(s.getAge()); //21
		System.out.println(s.getName()); //Richert
		System.out.println(s.getStudentID()); //58725927
		
		Person p = new Person("Richert",10);
		System.out.println(p.toString());//Person@1db9742
		//Override the .toString() method in Person class
		
		Person[] personArray = new Person[3];
		personArray[0] = new Person("A", 10);
		personArray[1] = new Student("B", 1, 65);
		personArray[2] = new InternationalStudent("C", 2, 5, 7.1, "U.S.");
		
		for (int i = 0; i < 3; i++){
			//call .toString() for each type of object (polymorphism)
			System.out.println(personArray[i].toString());
		}*/
		
		Student[] array = new Student[2];
		array[0] = new InternationalStudent("Rich", 21, 58725927, 6000, "US");
		array[1] = new PartTimeStudent("A", 22, 55555555, 8);
		System.out.println(array[0].compareTo(array[1]));
	
/*		public static Student findMinStudent(){
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
		}*/
		
		
		for(int i = 0; i<2; i++){
			System.out.println(array[i].getName());
			System.out.println(array[i].calculateQuarterlyFees());
			System.out.println(array[i].getUnitLimit());
		}
		
		System.out.println(Student.findMinStudent());
		
	}


}
