import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>{
	
	private Queue<PatientType> patientQueue = new LinkedList<PatientType>();
	
	public QueueHospital()
	{
		this.patientQueue = patientQueue;  
	}
	
	
	public void addPatient(PatientType patient)
	{
		// adds to LinkedList
		patientQueue.add(patient);  
	}
	
	public PatientType nextPatient()
	{
		// finds patient at top of list but doesnt take out of list
		return patientQueue.element();
	}
	
	public PatientType treatNextPatient()
	{
		// finds patient at the top of list and takes out of list
		return patientQueue.remove();
	}
	
	public int numPatients()
	{
		// returns number of patients in list
		return patientQueue.size();
	}
	
	public String hospitalType()
	{
		// returns hospital type
		return "QueueHospital";
	}
	
	public String allPatientInfo()
	{
		// prints and returns every patients info using their own designated toStrings
		String info = "";
		for(PatientType p: patientQueue)
		{
			info += p.toString();
		}
		
		return info;
	}

}
