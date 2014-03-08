/**
 * 
 * @author FELIPE
 */

package myTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import sistema.Disciplina;
import sistema.Plano;

public class UsabilityTesting {

	Plano sistema;		
	
	@Before
	public void setUp(){
		try {
			sistema = new Plano();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/*
	 * TEST METHODS
	 */
	
	@Test
	public void testUS1() {
		Assert.assertEquals(20, sistema.getTotalCredits(1));
		
		List<String> disciplinas = sistema.getAllocatedDisciplines(1);
		List<Disciplina> oraculo = getDisciplinesOfFirstPeriodo();
		Assert.assertEquals(oraculo.size(), disciplinas.size());
		for (int i = 0; i < oraculo.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), oraculo.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), oraculo.get(i).getCredits());
		}
	}
	
	@Test
	public void testUS2(){
		Assert.assertEquals(0, sistema.getTotalCredits(2));
		
		List<Disciplina> oraculo = new ArrayList<Disciplina>();
		
		try {
			sistema.addDisciplineInPeriod("Cálculo 2", 2);
			oraculo.add(new Disciplina("Cálculo 2", 4, new String[]{"Cálculo 1"}));
			sistema.addDisciplineInPeriod("Matemática discreta", 2);
			oraculo.add(new Disciplina("Matemática discreta", 4));
			sistema.addDisciplineInPeriod("Metodologia científica", 2);
			oraculo.add(new Disciplina("Metodologia científica", 4));
			sistema.addDisciplineInPeriod("Programação 2", 2);
			oraculo.add(new Disciplina("Programação 2", 4, new String[]{"Programação 1", "Laboratório de programação 1", "Introdução a computação"}));
			sistema.addDisciplineInPeriod("Laboratório de Programação 2", 2);
			oraculo.add(new Disciplina("Laboratório de Programação 2", 4, new String[]{"Programação 1", "Laboratório de programação 1", "Introdução a computação"}));
			sistema.addDisciplineInPeriod("Teoria dos grafos", 2);
			oraculo.add(new Disciplina("Teoria dos grafos", 2, new String[]{"Programação 1", "Laboratório de programação 1"}));
			sistema.addDisciplineInPeriod("Fisica clássica", 2);
			oraculo.add(new Disciplina("Fisica clássica", 4, new String[]{"Cálculo 1", "Álgebra vetorial e geometria analítica"}));
			//Disciplina abaixo não sera adicionada por falta de cumprimento dos seus prerequisitos 
			sistema.addDisciplineInPeriod("LEDA", 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
		Assert.assertEquals(26, sistema.getTotalCredits(2));
		
		List<String> disciplinas = sistema.getAllocatedDisciplines(2);
		
		Assert.assertEquals(oraculo.size(), disciplinas.size());
		for (int i = 0; i < oraculo.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), oraculo.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), oraculo.get(i).getCredits());
		}
	}
	
	@Test
	public void testUS3(){
		Assert.assertEquals(0, sistema.getTotalCredits(2));
		Assert.assertEquals(0, sistema.getTotalCredits(3));
		Assert.assertEquals(0, sistema.getTotalCredits(4));
		Assert.assertEquals(0, sistema.getTotalCredits(5));
		Assert.assertEquals(0, sistema.getTotalCredits(6));
		Assert.assertEquals(0, sistema.getTotalCredits(7));
		Assert.assertEquals(0, sistema.getTotalCredits(8));
		Assert.assertEquals(0, sistema.getTotalCredits(9));
		Assert.assertEquals(0, sistema.getTotalCredits(10));
		Assert.assertEquals(0, sistema.getTotalCredits(10000));
				
		List<Disciplina> segundo = new ArrayList<Disciplina>();
		List<Disciplina> terceiro = new ArrayList<Disciplina>();
		List<Disciplina> quarto = new ArrayList<Disciplina>();
		List<Disciplina> quinto = new ArrayList<Disciplina>();
		List<Disciplina> sexto = new ArrayList<Disciplina>();
		List<Disciplina> setimo = new ArrayList<Disciplina>();
		List<Disciplina> oitavo = new ArrayList<Disciplina>();
		List<Disciplina> nono = new ArrayList<Disciplina>();
		List<Disciplina> decimo = new ArrayList<Disciplina>();
		
		try {
			sistema.addDisciplineInPeriod("Cálculo 2", 2);
			segundo.add(new Disciplina("Cálculo 2", 4, new String[]{"Cálculo 1"}));
			sistema.addDisciplineInPeriod("Matemática discreta", 3);
			terceiro.add(new Disciplina("Matemática discreta", 4));
			sistema.addDisciplineInPeriod("Metodologia científica", 4);
			quarto.add(new Disciplina("Metodologia científica", 4));
			sistema.addDisciplineInPeriod("Programação 2", 5);
			quinto.add(new Disciplina("Programação 2", 4, new String[]{"Programação 1", "Laboratório de programação 1", "Introdução a computação"}));
			sistema.addDisciplineInPeriod("Laboratório de Programação 2", 6);
			sexto.add(new Disciplina("Laboratório de Programação 2", 4, new String[]{"Programação 1", "Laboratório de programação 1", "Introdução a computação"}));
			sistema.addDisciplineInPeriod("Teoria dos grafos", 7);
			setimo.add(new Disciplina("Teoria dos grafos", 2, new String[]{"Programação 1", "Laboratório de programação 1"}));
			sistema.addDisciplineInPeriod("Fisica clássica", 8);
			oitavo.add(new Disciplina("Fisica clássica", 4, new String[]{"Cálculo 1", "Álgebra vetorial e geometria analítica"}));
			sistema.addDisciplineInPeriod("LEDA", 9);
			nono.add(new Disciplina("LEDA", 4, new String[]{"Teoria dos grafos", "Programação 2", "Laboratório de Programação 2"}));
			sistema.addDisciplineInPeriod("EDA", 10);
			decimo.add(new Disciplina("EDA", 4, new String[]{"Teoria dos grafos", "Programação 2", "Laboratório de Programação 2"}));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(4, sistema.getTotalCredits(2));
		Assert.assertEquals(4, sistema.getTotalCredits(3));
		Assert.assertEquals(4, sistema.getTotalCredits(4));
		Assert.assertEquals(4, sistema.getTotalCredits(5));
		Assert.assertEquals(4, sistema.getTotalCredits(6));
		Assert.assertEquals(2, sistema.getTotalCredits(7));
		Assert.assertEquals(4, sistema.getTotalCredits(8));
		Assert.assertEquals(4, sistema.getTotalCredits(9));
		Assert.assertEquals(4, sistema.getTotalCredits(10));
		Assert.assertEquals(0, sistema.getTotalCredits(10000));
		
		List<String> disciplinas = sistema.getAllocatedDisciplines(2);
		Assert.assertEquals(segundo.size(), disciplinas.size());
		for (int i = 0; i < segundo.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), segundo.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), segundo.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(3);
		Assert.assertEquals(terceiro.size(), disciplinas.size());
		for (int i = 0; i < terceiro.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), terceiro.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), terceiro.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(4);
		Assert.assertEquals(quarto.size(), disciplinas.size());
		for (int i = 0; i < quarto.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), quarto.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), quarto.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(5);
		Assert.assertEquals(quinto.size(), disciplinas.size());
		for (int i = 0; i < quinto.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), quinto.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), quinto.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(6);
		Assert.assertEquals(sexto.size(), disciplinas.size());
		for (int i = 0; i < sexto.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), sexto.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), sexto.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(7);
		Assert.assertEquals(setimo.size(), disciplinas.size());
		for (int i = 0; i < setimo.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), setimo.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), setimo.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(8);
		Assert.assertEquals(oitavo.size(), disciplinas.size());
		for (int i = 0; i < oitavo.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), oitavo.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), oitavo.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(9);
		Assert.assertEquals(nono.size(), disciplinas.size());
		for (int i = 0; i < nono.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), nono.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), nono.get(i).getCredits());
		}
		
		disciplinas = sistema.getAllocatedDisciplines(10);
		Assert.assertEquals(decimo.size(), disciplinas.size());
		for (int i = 0; i < decimo.size(); i++) {
			Assert.assertEquals(sistema.getNameDiscipline(disciplinas.get(i)), decimo.get(i).getName());
			Assert.assertEquals(sistema.getCreditsDiscipline(disciplinas.get(i)), decimo.get(i).getCredits());
		}
		
	}
	
	@Test
	public void testUS4(){
		
	}
	
	private List<Disciplina> getDisciplinesOfFirstPeriodo(){
		List<Disciplina> retorno = new ArrayList<Disciplina>();
		
		retorno.add(new Disciplina("Cálculo 1", 4, new String[]{}));
		retorno.add(new Disciplina("Introdução a computação", 4, new String[]{}));
		retorno.add(new Disciplina("Laboratório de programação 1", 4, new String[]{}));
		retorno.add(new Disciplina("Programação 1", 4, new String[]{}));
		retorno.add(new Disciplina("Álgebra vetorial e geometria analítica", 4, new String[]{}));

		return retorno;
	}

}
