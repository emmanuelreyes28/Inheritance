
public class InternationalStudent extends Student
{
	private double tuition;
	private String citizenship;
	
	public InternationalStudent(String name, int age, int id,
		double tuition, String citizenship){
		super(name,age,id); //Constructor chaining 
		this.tuition = tuition;
		this.citizenship = citizenship;
	}
	
	//Getters
	public double getTuition(){
		return tuition;
	}
	public String getCitizenship(){
		return citizenship;
	}
	
	//Setters
	public void setTuition(double tuition){
		this.tuition = tuition;
	}
	public void setCitizenship(String citizenship){
		this.citizenship = citizenship;
	}
	
	public double calculateQuarterlyFees(){
		return tuition / 3;
	}
	
	public int getUnitLimit(){
		return 18;
	}
}
