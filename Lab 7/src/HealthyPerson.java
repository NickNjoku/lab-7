
public class HealthyPerson extends Person{
	
	private String name;
	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.name = name;
		this.reason = reason;
	}
	
	public int compareToImpl(Person p)
	{
		// checks if obj being compared isn't a HealthyPerson obj, returns 0 if its different 
		if(!(this.getClass().equals(p.getClass()))) 
		{
			return 0;
		}
		// sorts by alphabetical order descending
		if(this.getName().compareToIgnoreCase(p.getName()) < 0)
		{
			return -1;
		}
		if(this.getName().compareToIgnoreCase(p.getName()) > 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
			
				
	}
	
	public String toString()
	{
		// prints string
		return String.format("%s In for %s", super.toString(),this.reason);  
	}

}
