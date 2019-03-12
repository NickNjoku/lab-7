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
		Collections.sort((List<PatientType>) patientQueue);
	}
	
	public PatientType nextPatient() 
	{
		
	}
	
	public PatientType treatNextPatient()
	{
		
	}
	
	public int numPatients()
	{
		
	}
	
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	public String allPatientInfo() 
	{
		
	}

}
