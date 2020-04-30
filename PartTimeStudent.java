
public class PartTimeStudent extends Student
{
	private int enrolledUnits;
	
	public PartTimeStudent(String name, int age, int studentID,
		int units){
		super(name,age,studentID);
		enrolledUnits = units;
	}
	
	public double calculateQuarterlyFees(){
		return 400 * enrolledUnits;
	}
	
	public int getUnitLimit(){
		return 11;
	}

}
