package BD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {

	
	public List<String[]> getAllDisciplinesForFile(){
		List<String[]> retorno = new ArrayList<String[]>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("files//disciplines.txt"));
			while(br.ready()){  
				   String linha = br.readLine();  
				   System.out.println(linha); 
				   retorno.add(linha.split(" - "));
				}  
			br.close(); 
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
		
		return retorno;
	}
	
	public List<String[]> read(String fileName){
		List<String[]> retorno = new ArrayList<String[]>();
		
		//primeiro periodo
		retorno.add(new String[]{"LPT","4"});
		retorno.add("Calculo 1 - 4 - ".split(" - "));
		retorno.add("Introducao a computacao - 4 - ".split(" - "));
		retorno.add("Laboratorio de programacao 1 - 4 - ".split(" - "));
		retorno.add("Programacao 1 - 4 - ".split(" - "));
		retorno.add("Algebra vetorial e geometria analitica - 4 - ".split(" - "));
		//segundo periodo
		retorno.add("Calculo 2 - 4 - Calculo 1".split(" - "));
		retorno.add("Matematica discreta - 4 - ".split(" - "));
		retorno.add("Metodologia cientifica - 4 - ".split(" - "));
		retorno.add("Programacao 2 - 4 - Programacao 1#Laboratorio de Programacao 1#Introducao a computacao".split(" - "));
		retorno.add("Teoria dos grafos - 2 - Programacao 1#Laboratorio de Programacao 1".split(" - "));
		retorno.add("Fisica classica - 4 - Calculo 1#algebra vetorial e geometria analitica".split(" - "));
		retorno.add("Laboratorio de Programacao 2 - 4 - Programacao 1#Laboratorio de Programacao 1#Introducao a computacao".split(" - "));
		//terceiro periodo
		retorno.add("Probabilidade - 4 - Calculo 2".split(" - "));
		retorno.add("Teoria da computacao - 4 - Introducao a computacao#Teoria dos grafos#Matematica discreta".split(" - "));
		retorno.add("algebra linear - 4 - algebra vetorial e geometria analitica".split(" - "));
		retorno.add("EDA - 4 - Teoria dos grafos#Programacao 2#Laboratorio de Programacao 2".split(" - "));
		retorno.add("Fisica moderna - 4 - Calculo 2#Fisica classica".split(" - "));
		retorno.add("Gerencia da informacao - 4 - ".split(" - "));
		retorno.add("LEDA - 4 - Teoria dos grafos#Programacao 2#Laboratorio de Programacao 2".split(" - "));
		//quarto periodo
		retorno.add("Métodos estatisticos - 4 - algebra linear#Probabilidade".split(" - "));
		retorno.add("OAC - 4 - EDA#LEDA#Fisica moderna".split(" - "));
		retorno.add("PLP - 2 - EDA#LEDA#Teoria da computacao".split(" - "));
		retorno.add("Logica matematica - 4 - Teoria da computacao".split(" - "));
		retorno.add("Engenharia de software 1 - 4 - Probabilidade#Programacao 2#Laboratorio de Programacao 2".split(" - "));
		retorno.add("Sistema de informacao 1 - 4 - Gerencia da informacao".split(" - "));
		retorno.add("LOAC - 4 - EDA#LEDA#Fisica moderna".split(" - "));
		//quinto periodo
		retorno.add("Infosoc - 2 - ".split(" - "));
		retorno.add("ATAL - 4 - EDA#LEDA#Calculo 2#Logica matematica".split(" - "));
		retorno.add("Compiladores - 4 - OAC#LOAC#PLP".split(" - "));
		retorno.add("Rede de computadores - 4 - OAC#LOAC".split(" - "));
		retorno.add("BD 1 - 4 - Sistema de informacao 1".split(" - "));
		retorno.add("SI 2 - 4 - Sistema de informacao 1".split(" - "));
		retorno.add("LES - 2 - Engenharia de software 1".split(" - "));
		//sexto periodo
		retorno.add("Direito e cidadania - 4 - ".split(" - "));
		retorno.add("SO - 4 - ".split(" - "));
		retorno.add("Interconecao de redes de computadores - 2 - ".split(" - "));
		retorno.add("Optativa 1 - 4 - ".split(" - "));
		retorno.add("Laboratorio de interconecao de redes de computadores - 2 - ".split(" - "));
		retorno.add("Optativa 2 - 4 - ".split(" - "));
		retorno.add("Metodos de software nemericos - 4 - ".split(" - "));
		retorno.add("Avaliacao de desempenho de de sistemas discretos - 4 - ".split(" - "));
		retorno.add("BD 2 - 4 - ".split(" - "));
		retorno.add("IA - 4 - ".split(" - "));
		retorno.add("Projeto em computacao 1 - 4 - ".split(" - "));
		retorno.add("Optativa 3 - 4 - ".split(" - "));
		retorno.add("Optativa 4 - 4 - ".split(" - "));
		retorno.add("Optativa 5 - 4 - ".split(" - "));
		retorno.add("Optativa 6 - 4 - ".split(" - "));
		retorno.add("Projeto em computacao 2 - 6 - ".split(" - "));
		retorno.add("Optativa 7 - 4 - ".split(" - "));
		retorno.add("Jogos Digitais - 4 - ".split(" - "));
		retorno.add("Didatica 1 - 2 - ".split(" - "));
		retorno.add("Didatica 2 - 2 - ".split(" - "));
		retorno.add("Sociologia industrial - 3 - ".split(" - "));
		
		return retorno;
	}
}
