package sistema;

import java.util.List;

public class Sistema {

	Periodo periodoDefault;
	
	/**
	 * Default constructor
	 */
	public Sistema() {
		periodoDefault = new Periodo();
	}
	
	/**
	 * Upload all periods and their respective disciplines
	 */
	public void loadPeriods() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * set period of the user
	 */
	public void setMyPeriod(int period) {
		periodoDefault.set(period);
	}

	/**
	 * get total credits
	 * @return total credits for the current period
	 */
	public int getTotalCredits() {
		return periodoDefault.getTotalCreditsOfPeriod();
	}

	/**
	 * get Allocated Disciplines
	 * @return List of allocated disciplines
	 */
	public List<String> getAllocatedDisciplines() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param string: ID of discipline
	 * @return Name of discipline
	 */
	public String getNameDiscipline(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param string: ID of discipline
	 * @return credits of discipline
	 */
	public int getCreditsDiscipline(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
