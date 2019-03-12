
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
		
		if(!(this.getClass().equals(p.getClass())))
		{
			return 0;
		}
		
		if() 
		{
			
		}
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
