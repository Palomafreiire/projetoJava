package projetoEstacio;

import java.util.ArrayList;
import java.util.Scanner;


public class menuVestibular extends vestibular {
		
		@Override
		void menuVestibular() {
			int op;
			Scanner ler = new Scanner (System.in);
			ArrayList<String> lista = new ArrayList<>();{
			
			do {
				System.out.println("=======================ESCOLINHA DE MUSICA===================");
				System.out.println(" [1] Para se inscrever");
				System.out.println(" [2] Para concluir a inscrição");
				System.out.println(" [3] Para saber as opções de curso ");
				System.out.println(" [0] Digite ZERO para sair da inscrição!");
				System.out.println("==========================================================");
				op = ler.nextInt();
			switch (op) {
			case 1: 
				ler.nextLine();
				String inscricao = "inscrição";
				getFichaInscricao();
				lista.add(inscricao);
				break;
			case 2:
				ler.nextLine();
				String finalizarInscricao = "finalizar";
				this.setFichaInscricao(finalizarInscricao);
				break;
			case 3:
				ler.nextLine();
				String curso = "curso";
				this.setAreaCurso(curso);
				break;
			case 0:
				System.out.println("Saindo da inscrição.......");
				break;
				
			}
			}while (op!=0);
			
			}
			}
				
			
			

		@Override
		void areaCurso() {
			// TODO Auto-generated method stub
			
		}
	
}
