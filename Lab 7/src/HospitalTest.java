import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {
		
		@Test
		public void HospitalClassTest()
		{
			Hospital<Person> H = new QueueHospital<Person>();
			Person Nick = new SickPerson("Nick", 19, 25);
			H.addPatient(Nick);
			Assert.assertEquals("A QueueHospital-type hospital with 1 patients.", H.toString());
		}
	
	
		@Test
		public void QueueHospitalTest()
		{
			
			QueueHospital<Person> queue = new QueueHospital<Person>(); 
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
			StackHospital<Person> stack = new StackHospital<Person>();
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
			PriorityQueueHospital<Person> queue = new PriorityQueueHospital<Person>();
			Person Nick = new SickPerson("Nick", 19, 25);
			Person Bob = new SickPerson("Bob", 25, 12);
			Person Ali = new SickPerson("Ali", 20, 2);
			
			queue.addPatient(Nick);
			queue.addPatient(Bob);
			queue.addPatient(Ali);
			
			Assert.assertEquals(3,queue.numPatients()); 
			Assert.assertEquals("PriorityQueueHospital", queue.hospitalType());
			Assert.assertEquals("Nick, a 19-year old. Severity level 25Bob, a 25-year old. Severity level 12Ali, a 20-year old. Severity level 2", queue.allPatientInfo());
			Assert.assertEquals(Nick, queue.nextPatient());
			Assert.assertEquals(Nick, queue.treatNextPatient());  
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
		public void HealthyPersonTest()
		{
			Person Cody = new HealthyPerson("Cody", 21, "Checkup");
			Person Nick = new HealthyPerson("Nick", 21, "Weight");
			Person Ali = new HealthyPerson("Ali", 21, "Height");
			Person Tom = new HealthyPerson("Tom", 21, "Vaccine");
			Person Nick2 = new HealthyPerson("Nick", 21, "Vaccine");
			
			Assert.assertEquals(1, Nick.compareToImpl(Cody));
			Assert.assertEquals(-1, Cody.compareToImpl(Nick));
			Assert.assertEquals(0, Nick2.compareToImpl(Nick));
			Assert.assertEquals("Nick, a 21-year old. In for Weight", Nick.toString());
			
		}
		
		@Test
		public void Animal()
		{
			Animal Dog = new Animal("Pug", 20);
			Animal Dog2 = new Animal("Bulldog", 25);
			
			Assert.assertEquals(20, Dog.getAge());
			Assert.assertEquals("Pug", Dog.getBreed());
			Assert.assertEquals("A 20-year old Pug.", Dog.toString());
			Assert.assertEquals(5,Dog.compareTo(Dog2));
		}
		
		

	}
