/**
 * CONTROLLER: Is the class responsible for control of system
 * 
 * @author FELIPE
 */

package sistema;

import java.util.List;

public class Sistema {

	Periodo periodo;
	
	/**
	 * Default constructor
	 */
	public Sistema() {
		periodo = new Periodo();
	}

	/**
	 * set period of the user
	 */
	public void setMyPeriod(int period) {
		periodo.setPeriod(period);
	}

	/**
	 * get total credits
	 * @return total credits for the current period
	 */
	public int getTotalCredits() {
		return periodo.getTotalCreditsOfPeriod();
	}

	/**
	 * get Allocated Disciplines
	 * @return List of allocated disciplines
	 */
	public List<String> getAllocatedDisciplines() {
		return periodo.getAllocatedDisciplines();
	}

	/**
	 * 
	 * @param string: ID of discipline
	 * @return Name of discipline
	 */
	public String getNameDiscipline(String id) {
		return periodo.getNameDiscipline(id);
	}

	/**
	 * 
	 * @param string: ID of discipline
	 * @return credits of discipline
	 */
	public int getCreditsDiscipline(String id) {
		return periodo.getCreditsDiscipline(id);
	}

}
