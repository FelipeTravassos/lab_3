/**
 * CONTROLLER: Is the class responsible for control of periods
 * 
 * @author FELIPE
 */
package sistema;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	
	List<Disciplina> disciplinasDoPeriodo;
	
	/**
	 * Default constructor
	 */
	public Periodo() {

	}

	/**
	 * Set the default period
	 * @param period: actual period, 1 <=> 8
	 */
	public void setPeriod(int period) {
		loadPeriod(period);
	}

	/**
	 * Get total credits of period
	 * @return int: The sum of the credits for the period
	 */
	public int getTotalCreditsOfPeriod() {
		int retorno = 0;
		for (Disciplina disciplina : disciplinasDoPeriodo) {
			retorno += disciplina.getCredits();
		}
		return retorno;
	}

	/**
	 * Get allocated disciplines of period
	 * @return List<String> with the ID the all disciplines allocated in actual period
	 */
	public List<String> getAllocatedDisciplines() {
		List<String> retorno = new ArrayList<String>();
		for (Disciplina disciplina : disciplinasDoPeriodo) {
			retorno.add(disciplina.getID());
		}
		return retorno;
	}

	/**
	 * Get name of discipline
	 * @param id: ID of discipline
	 * @return name of discipline
	 */
	public String getNameDiscipline(String id) {
		for (int i = 0; i < disciplinasDoPeriodo.size(); i++) {
			if(disciplinasDoPeriodo.get(i).getID().equals(id)){
				return disciplinasDoPeriodo.get(i).getName();
			}
		}
		return null;
	}

	/**
	 * Credits for one specific discipline
	 * @param id: Id for discipline
	 * @return 
	 */
	public int getCreditsDiscipline(String id) {
		for (int i = 0; i < disciplinasDoPeriodo.size(); i++) {
			if(disciplinasDoPeriodo.get(i).getID().equals(id)){
				return disciplinasDoPeriodo.get(i).getCredits();
			}
		}
		return 0;
	}
	
	/**
	 * Loading disciplines for the period of the User
	 * 
	 * @param period: Int with period of the user
	 */
	private void loadPeriod(int period){
		switch (period) {
		case 1:
			disciplinasDoPeriodo = firstPeriod();
			break;

		default:
			break;
		}
	}
	
	/**
	 * Private method to load the disciplines of the first period
	 * 
	 * @return List<Discipline> with disciplines for the first period
	 */
	private List<Disciplina> firstPeriod(){
		List<Disciplina> retorno = new ArrayList<Disciplina>();

		retorno.add(new Disciplina("Calculo 1", 4));
		retorno.add(new Disciplina("Introcução a computação", 4));
		retorno.add(new Disciplina("Laboratório de programação 1", 4));
		retorno.add(new Disciplina("Programação 1", 4));
		retorno.add(new Disciplina("Álgebra vetorial e geometria analítica", 4));

		return retorno;
	}
	
}
