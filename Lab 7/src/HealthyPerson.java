
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
		if(!(this.getClass().equals(p.getClass())))
		{
			return 0;
		}
		
		else if(this.getName().compareToIgnoreCase(p.getName()) < 0)
		{
			return -1;
		}
		else if(this.getName().compareToIgnoreCase(p.getName()) > 0)
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
		return String.format("%s In for %s", super.toString(),this.reason);
	}

}
