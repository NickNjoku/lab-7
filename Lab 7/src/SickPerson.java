
public class SickPerson extends Person {
	//private String name;
	//private int age;
	private int severity;
	
	
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		//this.name = name;
		//this.age = age;
		this.severity = severity;    
	}
	
	
	
	
	protected int compareToImpl(Person p)
	{
		int num=0;
		
		// if obj p isn't a SickPerson obj
		if(!(p instanceof SickPerson)) 
		{
			num = 0;
		}
		
		if(p instanceof HealthyPerson)
		{
			return 0;
		}
		SickPerson otherSick = (SickPerson) p;
		
		// sorts by severity with highest severity being in the  front
		if(this.getSeverity() > otherSick.getSeverity()) 
		{
			num = -1;
		}
		if(this.getSeverity() < otherSick.getSeverity())
		{
			num = 1;
		}
		
		if(this.getSeverity() == otherSick.getSeverity())
		{
			num = 0; 
		}
		return num;
		
		
		
	}
	
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), this.severity); 
	}
	
	private int getSeverity()
	{
		// returns severity of patient 
		return severity; 
	}
	
	
	

}
