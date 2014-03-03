package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import sistema.Disciplina;
import sistema.Sistema;

public class UsabilityTesting {

	Sistema sistema;
	
	@Before
	public void setUp(){
		sistema = new Sistema();		
	}
	
	@Test
	public void testUS1() {
		sistema.setMyPeriod(1);

		Assert.assertEquals(sistema.getTotalCredits(), 0);
		
		List<String> disciplinas = sistema.getAllocatedDisciplines();
		List<Disciplina> oraculo = getDisciplinesOfFirstPeriodo();
		
		Assert.assertEquals(disciplinas.size(), oraculo.size());
		for (int i = 0; i < oraculo.size(); i++) {
			assertEquals(oraculo.get(i).getName(), sistema.getNameDiscipline(disciplinas.get(i)));
			assertEquals(oraculo.get(i).getCredits(), sistema.getCreditsDiscipline(disciplinas.get(i)));
		}
		
	}
	
	private List<Disciplina> getDisciplinesOfFirstPeriodo(){
		List<Disciplina> retorno = new ArrayList<Disciplina>();
		
		retorno.add(new Disciplina("Calculo 1", 4));
		retorno.add(new Disciplina("Introcução a computação", 4));
		retorno.add(new Disciplina("Laboratório de programação 1", 4));
		retorno.add(new Disciplina("Programação 1", 4));
		retorno.add(new Disciplina("Álgebra vetorial e geometria analítica", 4));

		return retorno;
	}

}
