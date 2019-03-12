import org.junit.Assert;
import org.junit.Test;

public class TestMethods {
		
		@Test
		public void QueueHospitalTest()
		{
			
			QueueHospital queue = new QueueHospital();
			Person Nick = new SickPerson("Nick", 19, 25);
			Person Bob = new SickPerson("Bob", 25, 12);
			Person Ali = new SickPerson("Ali", 20, 2);
			
			queue.addPatient(Nick);
			queue.addPatient(Bob);
			queue.addPatient(Ali); 
			
			Assert.assertEquals(3,queue.numPatients());
			Assert.assertEquals("QueueHospital", queue.hospitalType());
			Assert.assertEquals("Nick, a 19-year old. Severity level 25Bob, a 25-year old. Severity level 12Ali, a 20-year old. Severity level 2", queue.allPatientInfo());
			Assert.assertEquals(Nick, queue.nextPatient());
			Assert.assertEquals(Nick, queue.treatNextPatient()); 
				
		}
		
		@Test
		public void StackHospitalTest()
		{
			StackHospital<Person> stack = new StackHospital();
			Person Nick = new SickPerson("Nick", 19, 25);
			Person Bob = new SickPerson("Bob", 25, 12);
			Person Ali = new SickPerson("Ali", 20, 2);
			
			stack.addPatient(Nick);
			stack.addPatient(Bob);
			stack.addPatient(Ali);
			
			Assert.assertEquals(3,stack.numPatients()); 
			Assert.assertEquals("StackHospital", stack.hospitalType());
			Assert.assertEquals("Ali, a 20-year old. Severity level 2Bob, a 25-year old. Severity level 12Nick, a 19-year old. Severity level 25", stack.allPatientInfo());
			Assert.assertEquals(Ali, stack.nextPatient());
			Assert.assertEquals(Ali, stack.treatNextPatient());  
			
			
		}
		
		@Test
		public void PriorityQueueHospital()
		{
			PriorityQueueHospital<Person> queue = new PriorityQueueHospital();
			Person Nick = new SickPerson("Nick", 19, 25);
			Person Bob = new SickPerson("Bob", 25, 12);
			Person Ali = new SickPerson("Ali", 20, 2);
			
			queue.addPatient(Nick);
			queue.addPatient(Bob);
			queue.addPatient(Ali);
			
			Assert.assertEquals(3,queue.numPatients()); 
			Assert.assertEquals("PriorityQueueHospital", queue.hospitalType());
			Assert.assertEquals("Ali, a 20-year old. Severity level 2Bob, a 25-year old. Severity level 12Nick, a 19-year old. Severity level 25", queue.allPatientInfo());
			Assert.assertEquals(Ali, queue.nextPatient());
			Assert.assertEquals(Ali, queue.treatNextPatient());  
		}
		
		@Test
		public void sickPersonTest()
		{
			SickPerson Nick = new SickPerson("Nick", 19, 25);
			SickPerson Bob = new SickPerson("Bob", 25, 12);
			SickPerson Ali = new SickPerson("Ali", 20, 2);
			SickPerson Tom = new SickPerson("Tom", 22, 2);
			
			Person Cody = new HealthyPerson("Cody", 21, "Checkup");
			
			Assert.assertEquals(-1, Nick.compareToImpl(Bob));
			Assert.assertEquals(1, Bob.compareToImpl(Nick));
			Assert.assertEquals(0, Ali.compareToImpl(Tom));
			Assert.assertEquals("Nick, a 19-year old. Severity level 25", Nick.toString());
		}
		
		@Test

	}
