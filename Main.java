package J003_Encapsulation;
/*
 * This is our main method where we create the object for Employee John and his ID. 
 */
public class Main {

	public static void main(String[] args) {
		// Creating the object John 
		
		Employee John = new Employee(); 
		John.setName("John");
		John.setId(123);
		
		System.out.println("The employee is "+John.getName() + " and "+John.getName()+"'s ID is " + John.getId());

	}

}
