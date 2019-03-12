
public class SickPerson extends Person {
	private String name;
	private int age;
	private int severity;
	
	
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.name = name;
		this.age = age;
		this.severity = severity;  
	}
	
	
	
	
	protected int compareToImpl(Person p)
	{
		int num=0;
		
		// p isn't a SickPerson object
		if(!(p instanceof SickPerson))
		{
			num = 0;
		}
		SickPerson otherSick = (SickPerson) p;
		
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
		return severity; 
	}
	
	
	

}
