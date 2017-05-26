package cinema;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		 String nomeCliente;
		 int poltrona;
		 int fileira;
		 int ContSessao = 0;
		 int contMeia = 0;
		 int contNormal = 0;
		 Scanner nc = new Scanner(System.in);
		 int escolhaFC = 0;
		 System.out.print("Você é /n1 - Cliente /n2 - Funcionário?/n");
		 Scanner fc = new Scanner(System.in);
		 escolhaFC = fc.nextInt();
		 Sessao s1 = new Sessao("Star Wars", 0);
		 Sessao s2 = new Sessao("Guardiões da Galáxia", 1);
		 Sessao s3 = new Sessao("Back to the Future", 2);
		 Sessao s4 = new Sessao("Pulp Fiction", 3);
		 
		 do{
			 switch(escolhaFC){
			 	case 1:
			 		escolhaFC = 1; 
			 		 System.out.print("--Cliente--/n");
			 		 
			 		 //pessoa p1 = new pessoa("Mariano", 1); //pessoa criada com tipo pagante Inteira
			 		 //Sessao s1 = new Sessao("Star Wars", 0);
			 		 
			 		 int escolha2 = 0;
			 		 int escolha3 = 0;
			 		 System.out.print("Você é\n1 - Doador de sangue\n2 - Estudante\n3 - Normal\n");
			 		 Scanner e2 = new Scanner(System.in);
			 		 escolha2 = e2.nextInt();
			 		 do{
			 			 
			 			 switch(escolha2){
			 			 	case 1:
			 			 		escolha2 = 1;
			 			 		System.out.print("--Doador de sangue--\n");
			 			 		System.out.print("Insira seu nome: ");
			 			 		nomeCliente = nc.next();
			 			 		pessoa p1 = new pessoa(nomeCliente, 2);
			 			 		System.out.print("Escolha o horário da sua sessão:\n1 - 14:00\n2 - 16:00\n3 - 18:00\n4 - 20:00\n ");
			 			 		do{
			 			 			switch(escolha3){
			 			 				case 1:
			 			 					escolha3 = 1;
			 			 					System.out.print("14:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s1.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s1.lugares(fileira, poltrona);
			 			 					
			 			 					break;
			 			 				case 2:
			 			 					escolha3 = 2;
			 			 					System.out.print("16:00\n");System.out.print("escolha o lugar:\n");
			 			 					s2.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s2.lugares(fileira, poltrona);
			 			 					
			 			 					break;
			 			 				case 3:
			 			 					escolha3 = 3;
			 			 					System.out.print("16:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s3.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s3.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 4:
			 			 					escolha3 = 4;
			 			 					System.out.print("20:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s4.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s4.lugares(fileira, poltrona);
			 			 					break;
			 			 				default:
			 			 					System.out.print("Número Inválido\n");
			 			 					break;
			 			 			}
			 			 		}while(escolha3 != 0);
			 			 		break;
			 			 		
			 			 	case 2:
			 			 		escolha2 = 2;
			 			 		System.out.print("--Estudante--\n");
			 			 		System.out.print("Insira seu nome: ");
			 			 		nomeCliente = nc.next();
			 			 		pessoa p2 = new pessoa(nomeCliente, 3);
			 			 		System.out.print("Escolha o horário da sua sessão:\n1 - 14:00\n2 - 16:00\n3 - 18:00\n4 - 20:00\n ");
			 			 		do{
			 			 			switch(escolha3){
			 			 				case 1:
			 			 					escolha3 = 1;
			 			 					System.out.print("14:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s1.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s1.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 2:
			 			 					escolha3 = 2;
			 			 					System.out.print("16:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s2.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s2.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 3:
			 			 					escolha3 = 3;
			 			 					System.out.print("16:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s3.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s3.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 4:
			 			 					escolha3 = 4;
			 			 					System.out.print("20:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s4.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s4.lugares(fileira, poltrona);
			 			 					break;
			 			 				default:
			 			 					System.out.print("Número Inválido\n");
			 			 					break;
			 			 			}
			 			 		}while(escolha3 != 0);
			 			 		break;
			 			 		
			 			 	case 3:
			 			 		escolha2 = 3;
			 			 		System.out.print("--Normal--\n");
			 			 		System.out.print("Insira seu nome: ");
			 			 		nomeCliente = nc.next();
			 			 		pessoa p3 = new pessoa(nomeCliente, 1);
			 			 		System.out.print("Escolha o horário da sua sessão:\n1 - 14:00\n2 - 16:00\n3 - 18:00\n4 - 20:00\n ");
			 			 		do{
			 			 			switch(escolha3){
			 			 				case 1:
			 			 					escolha3 = 1;
			 			 					System.out.print("14:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s1.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s1.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 2:
			 			 					escolha3 = 2;
			 			 					System.out.print("16:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s2.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s2.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 3:
			 			 					escolha3 = 3;
			 			 					System.out.print("16:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s3.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s3.lugares(fileira, poltrona);
			 			 					break;
			 			 				case 4:
			 			 					escolha3 = 4;
			 			 					System.out.print("20:00\n");
			 			 					System.out.print("escolha o lugar:\n");
			 			 					s4.mostraOcupado();
			 			 					System.out.print("Digite fileira:");
			 			 					fileira = e2.nextInt();
			 			 					System.out.print("Digite poltrona:");
			 			 					poltrona = e2.nextInt();
			 			 					s4.lugares(fileira, poltrona);
			 			 					break;
			 			 				default:
			 			 					System.out.print("Número Inválido\n");
			 			 					break;
			 			 			}
			 			 		}while(escolha3 != 0);
			 			 		break;
			 			 		
			 			 	default:
			 			 		System.out.print("--Número inválido--\n");
			 			 		break;
			 			 }
			 			 
			 		 }while(escolha2 != 0);
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
