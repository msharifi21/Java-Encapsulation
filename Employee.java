package J003_Encapsulation;
/* this is a very basic example of Encapsulation
 * Here we have a calss called employee which has name and ID number
 * What we do here is to make the name and ID private, and set up our setters and getters 
 */
public class Employee {
	// we set these private so the user don't have to deal with them. this is the real meaning of encapsulation. 
	private String name; 
	private int id; 
	
	// setter for name 
	public void setName (String name) {
		this.name = name; 
	}
	
	// getter for name 
	public String getName() {
		return name;	
	}
	
	
	//setter for id 
	public void setId (int id) {
		this.id = id; 
	}
	
	// getter for id
	public int getId() {
		return id; 
	}
}
