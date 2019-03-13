import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PriorityQueueHospital <PatientType extends Comparable<PatientType>> extends Hospital<PatientType> {
	
	private Queue<PatientType> patientQueue = new LinkedList<PatientType>();
	
	public PriorityQueueHospital()
	{
		this.patientQueue = patientQueue; 
	}
	public void addPatient(PatientType patient)
	{ 
		patientQueue.add(patient);
	
	
	}
	
	public PatientType nextPatient() 
	{
		Collections.sort((List<PatientType>) patientQueue);
		return patientQueue.element();
	}
	
	public PatientType treatNextPatient()
	{
		Collections.sort((List<PatientType>) patientQueue);  
		return patientQueue.remove();
	}
	
	public int numPatients()
	{
		return patientQueue.size();
	}
	
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	public String allPatientInfo() 
	{
		String info = "";
		for(PatientType p: patientQueue)
		{
			info += p.toString();
		}
		
		return info;
	}

}
