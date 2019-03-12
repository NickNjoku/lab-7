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
		patientQueue.add(patient);
	}
	
	public PatientType nextPatient()
	{
		return patientQueue.element();
	}
	
	public PatientType treatNextPatient()
	{
		return patientQueue.remove();
	}
	
	public int numPatients()
	{
		return patientQueue.size();
	}
	
	public String hospitalType()
	{
		return "QueueHospital";
	}
	
	public String allPatientInfo()
	{
		return String.format("A %s-type hospital with %d patients.", this.hospitalType(), this.numPatients());
	}

}
