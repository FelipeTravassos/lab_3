/**
 * INFORMATION EXPERT: Is the class responsible for storing information such as the name of discipline and total credits
 * 
 * @author FELIPE
 */

package sistema;

public class Disciplina {

	String name;
	int credits;
	String ID;
	
	/**
	 * Default constructor 
	 */
	public Disciplina() {
	}
	
	/**
	 * Alternate constructor
	 * 
	 * @param name: name of discipline
	 * @param credits: credits of discipline
	 */
	public Disciplina(String name, int credits) {
		setName(name);
		setCredits(credits);
		this.ID = name;
	}
	
	/**
	 * get ID of discipline
	 * 
	 * @return
	 */
	public String getID(){
		return this.ID;
	}

	/**
	 * Modifies the name of discipline
	 * 
	 * @param name: New name of discipline
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Modifies the credits of discipline
	 * 
	 * @param credits: New value for credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * 
	 * @return: Name of discipline
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return: Credits of discipline
	 */
	public int getCredits() {
		return this.credits;
	}

}
