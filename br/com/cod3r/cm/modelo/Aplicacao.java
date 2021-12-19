package br.com.cod3r.cm.modelo;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabulheiro tabulheiro =new Tabulheiro(6, 6, 6);
		
		tabulheiro.abrir(3, 3);
		tabulheiro.alterarMarcacao(4, 4);
		tabulheiro.alterarMarcacao(4, 5);
		
		System.out.println(tabulheiro);
	}

}
