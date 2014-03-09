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
		retorno.add("Cálculo 1 - 4 - ".split(" - "));
		retorno.add("Introdução a computação - 4 - ".split(" - "));
		retorno.add("Laboratório de programação 1 - 4 - ".split(" - "));
		retorno.add("Programação 1 - 4 - ".split(" - "));
		retorno.add("Álgebra vetorial e geometria analítica - 4 - ".split(" - "));
		//segundo periodo
		retorno.add("Cálculo 2 - 4 - Cálculo 1".split(" - "));
		retorno.add("Matemática discreta - 4 - ".split(" - "));
		retorno.add("Metodologia científica - 4 - ".split(" - "));
		retorno.add("Programação 2 - 4 - Programação 1#Laboratório de programação 1#Introdução a computação".split(" - "));
		retorno.add("Teoria dos grafos - 2 - Programação 1#Laboratório de programação 1".split(" - "));
		retorno.add("Fisica clássica - 4 - Cálculo 1#Álgebra vetorial e geometria analítica".split(" - "));
		retorno.add("Laboratório de Programação 2 - 4 - Programação 1#Laboratório de programação 1#Introdução a computação".split(" - "));
		//terceiro periodo
		retorno.add("Probabilidade - 4 - Cálculo 2".split(" - "));
		retorno.add("Teoria da computação - 4 - Introdução a computação#Teoria dos grafos#Matemática discreta".split(" - "));
		retorno.add("Álgebra linear - 4 - Álgebra vetorial e geometria analítica".split(" - "));
		retorno.add("EDA - 4 - Teoria dos grafos#Programação 2#Laboratório de Programação 2".split(" - "));
		retorno.add("Fisica moderna - 4 - Cálculo 2#Fisica clássica".split(" - "));
		retorno.add("Gerência da informação - 4 - ".split(" - "));
		retorno.add("LEDA - 4 - Teoria dos grafos#Programação 2#Laboratório de Programação 2".split(" - "));
		//quarto periodo
		retorno.add("Métodos estatisticos - 4 - Álgebra linear#Probabilidade".split(" - "));
		retorno.add("OAC - 4 - EDA#LEDA#Fisica moderna".split(" - "));
		retorno.add("PLP - 2 - EDA#LEDA#Teoria da computação".split(" - "));
		retorno.add("Lógica matemática - 4 - Teoria da computação".split(" - "));
		retorno.add("Engenharia de software 1 - 4 - Probabilidade#Programação 2#Laboratório de Programação 2".split(" - "));
		retorno.add("Sistema de informação 1 - 4 - Gerência da informação".split(" - "));
		retorno.add("LOAC - 4 - EDA#LEDA#Fisica moderna".split(" - "));
		//quinto periodo
		retorno.add("Infosoc - 2 - ".split(" - "));
		retorno.add("ATAL - 4 - EDA#LEDA#Cálculo 2#Lógica matemática".split(" - "));
		retorno.add("Compiladores - 4 - OAC#LOAC#PLP".split(" - "));
		retorno.add("Rede de computadores - 4 - OAC#LOAC".split(" - "));
		retorno.add("BD 1 - 4 - Sistema de informação 1".split(" - "));
		retorno.add("SI 2 - 4 - Sistema de informação 1".split(" - "));
		retorno.add("LES - 2 - Engenharia de software 1".split(" - "));
		//sexto periodo
		retorno.add("Direito e cidadania - 4 - ".split(" - "));
		retorno.add("SO - 4 - ".split(" - "));
		retorno.add("InterconexÃ£o de redes de computadores - 2 - ".split(" - "));
		retorno.add("Optativa 1 - 4 - ".split(" - "));
		retorno.add("Laboratório de interconexÃ£o de redes de computadores - 2 - ".split(" - "));
		retorno.add("Optativa 2 - 4 - ".split(" - "));
		retorno.add("Métodos de software neméricos - 4 - ".split(" - "));
		retorno.add("Avaliação de desempenho de de sistemas discretos - 4 - ".split(" - "));
		retorno.add("BD 2 - 4 - ".split(" - "));
		retorno.add("IA - 4 - ".split(" - "));
		retorno.add("Projeto em computação 1 - 4 - ".split(" - "));
		retorno.add("Optativa 3 - 4 - ".split(" - "));
		retorno.add("Optativa 4 - 4 - ".split(" - "));
		retorno.add("Optativa 5 - 4 - ".split(" - "));
		retorno.add("Optativa 6 - 4 - ".split(" - "));
		retorno.add("Projeto em computação 2 - 6 - ".split(" - "));
		retorno.add("Optativa 7 - 4 - ".split(" - "));
		retorno.add("Jogos Digitais - 4 - ".split(" - "));
		retorno.add("Didatica 1 - 2 - ".split(" - "));
		retorno.add("Didatica 2 - 2 - ".split(" - "));
		retorno.add("Sociologia industrial - 3 - ".split(" - "));
		
		return retorno;
	}
}
