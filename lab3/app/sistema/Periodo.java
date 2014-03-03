package sistema;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	
	List<Disciplina> disciplinasDoPeriodo;
	
	
	public Periodo() {

	}

	
	public void setPeriod(int period) {
		loadPeriod(period);
	}

	public int getTotalCreditsOfPeriod() {
		int retorno = 0;
		for (Disciplina disciplina : disciplinasDoPeriodo) {
			retorno += disciplina.getCredits();
		}
		return retorno;
	}

	public List<String> getAllocatedDisciplines() {
		List<String> retorno = new ArrayList<String>();
		for (Disciplina disciplina : disciplinasDoPeriodo) {
			retorno.add(disciplina.getID());
		}
		return retorno;
	}

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
