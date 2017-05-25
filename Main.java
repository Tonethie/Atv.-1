package cinema;
import java.util.Scanner;

import cinema.sessão.Sessao;

public class main {

	public static void main(String[] args) {
		
		 int escolhaFC = 0;
		 System.out.print("Você é /n1 - Cliente /n2 - Funcionário?/n");
		 Scanner fc = new Scanner(System.in);
		 escolhaFC = fc.nextInt();
		 
		 do{
			 switch(escolhaFC){
			 	case 1:
			 		escolhaFC = 1; 
			 		 System.out.print("--Cliente--/n");
			 		 
			 		 pessoa p1 = new pessoa("Mariano", 2);
			 		 sessão.Sessao("Star Wars", 2); //não funciona
			 		 break;
			 		 
			 	case 2:
			 		escolhaFC = 2;
			 		System.out.print("--Funcionário--");
			 		break;
			 	default:
			 		System.out.print("Número Inválido"); 
			 		break;
			 }
		 }while(escolhaFC != 0);
	}

}


