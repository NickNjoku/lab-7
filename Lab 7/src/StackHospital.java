import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType> {

	private Stack<PatientType> stack = new Stack<PatientType>();
	
	public StackHospital()
	{
		
		
	}
	
	
	public void addPatient(PatientType patient)
	{
		// adds patient to stack
		stack.push(patient);   
	}
	
	public PatientType nextPatient()
	{
		// checks what patient is at top of stack but doesn't remove the patient from the string
		return stack.peek();   
	}
	
	public PatientType treatNextPatient()
	{
		// finds patient at top of stack and removes it from list
		return stack.pop();
	}
	
	public int numPatients()
	{
		// returns the number of patients in list 
		return stack.size();
	}
	
	public String hospitalType()
	{
		// returns hospital type 
		return "StackHospital";
	}
	
	public String allPatientInfo()
	{
		// goes through list and prints patient info using their own designated toString's
		String info = "";
		for(PatientType p: stack)
		{
			info = p.toString() + info;
		}
		
		return info;
	}
}
