package projetoEstacio;

import java.util.ArrayList;
import java.util.Scanner;

public class aluno extends vestibular {

	@Override
	void menuVestibular() { 
		int op;
		Scanner ler = new Scanner (System.in);
		ArrayList<String> lista = new ArrayList<>();{
		
		do {
			System.out.println("\n=======================ESCOLINHA DE MÚSICA===================");
			System.out.println(" [1] Para se inscrever");
			System.out.println(" [2] Para concluir a inscrição");
			System.out.println(" [3] Para saber as opções de curso ");
			System.out.println(" [0] Digite ZERO para sair da inscrição!");
			System.out.println("==========================================================");
			op = ler.nextInt();
		switch (op) {
		case 1: 
			String inscricao = "inscrição";
			this.areaCurso();
			this.fichaInscricao();
			this.concluida(true);
			lista.add(inscricao);	
			break;
		case 2:
			
			String finalizarInscricao = "finalizar";
			this.areaCurso();
			this.fichaInscricao();
			this.concluida(true);
			lista.add(finalizarInscricao);
			break;
		case 3:
			String curso = "curso";
			System.out.println("Cursos disponiveis no momento: ");
			System.out.println("Instrumental: [1] Pandeiro [2] Violão [3] Teclado [4] Bateria");
			System.out.println("Canto: [1] Coral [2] Popular [3] Erudito");
			System.out.println("Teoria musical: [1] Canto [2] Violão Classico [3] Flauta Doce");
			break;
		case 0:
			this.concluida(false);
			System.out.println("Saindo da inscrição.......");
			break;
		default:
			System.out.println("ATENÇÃO!!!!!!!");
			System.out.println("Número errado, digite outro número....");								
		}
			
		} while (op!=0);
				
		}
	}	
	@Override
	void areaCurso() {
		System.out.println("Escolha a area do seu curso: ");
		System.out.println("[1] INSTRUMENTAL");
		System.out.println("[2] CANTO");
		System.out.println("[3] TEORIA MUSICAL");
		int op = ler.nextInt();
		switch (op) {
		case 1: 
			String area1 = "INSTRUMENTAL";
			this.setAreaCurso(area1);
			
			System.out.println("\nEscolha seu curso: ");
			System.out.println("[1] Pandeiro "+ "\t"+ "[2] Violão"+ "\n[3] Teclado"+ "\t"+ "[4] Bateria");
			int op1 = ler.nextInt();
			switch (op1) {
			case 1:
				String curso1 = "Pandeiro";
				this.setCurso(curso1);
				break;
			case 2:
				String curso2 = "Violão";
				this.setCurso(curso2);
				break;
			case 3:
				String curso3 = "Teclado";
				this.setCurso(curso3);
				break;
			case 4: 
				String curso4 = "Bateria";
				this.setCurso(curso4);
				break;
			default:
				System.out.println("Opção incorreta!!");	
			}
			break;
			
		case 2:
			String area2 = "CANTO";
			this.setAreaCurso(area2);
			System.out.println("\nEscolha seu curso: ");
			System.out.println("[1] Coral"+ "\t"+ "[2] Popular "+ "\n[3] Erudito"+ "\t"+ "[4] Classico");
			int op3 = ler.nextInt();
			switch (op3) {
			case 1:
				String curso1 = "Coral";
				this.setCurso(curso1);
				break;
			case 2:
				String curso2 = "Popular";
				this.setCurso(curso2);
				break;
			case 3:
				String curso3 = "Erudito";
				this.setCurso(curso3);
				break;
			case 4: 
				String curso4 = "Classico";
				this.setCurso(curso4);
				break;
			default:
				System.out.println("Opção incorreta!!");
			}
			break;
		case 3:
			String area3 = "TEORIA MUSICAL";
			this.setAreaCurso(area3);
			System.out.println("\nEscolha seu curso: ");
			System.out.println("[1] Canto "+ "\t"+ "[2] Violão Classico"+ "\n[3] Flauta Doce"+ "\t"+ "[4] Piano");
			int op4 = ler.nextInt();
			switch (op4) {
			case 1:
				String curso1 = "Canto";
				this.setCurso(curso1);
				break;
			case 2:
				String curso2 = "Violão Classico";
				this.setCurso(curso2);
				break;
			case 3:
				String curso3 = "Flauta Doce";
				this.setCurso(curso3);
				break;
			case 4: 
				String curso4 = "Piano";
				this.setCurso(curso4);
				break;
			default:
				System.out.println("Opção incorreta!!");
				
			}
			break;
		default:
			System.out.println("Opção incorreta!!!");
		
			
		}
	}	
}