package cinema;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		 String filme, nome;
		 
		 Cliente ls1[] = new Cliente[200];
		 Cliente ls2[] = new Cliente[200];
		 Cliente ls3[] = new Cliente[200];
		 Cliente ls4[] = new Cliente[200];
		 
 		 /* declarei novos clintes como sao 4 sessoes e cada
 		    sessao cabe 200 pessoas foram criados 4 vetores 
 		  */
		 
		 int S1contMeia = 0, S2contMeia = 0, S3contMeia = 0, S4contMeia = 0 ;
		 int S1contNormal = 0, S2contNormal = 0, S3contNormal = 0, S4contNormal = 0;
		 
		 
		 Scanner nc = new Scanner(System.in);
		 int escolha = 0, escolha1 = 0; 
		 int x = 0,y = 0,z =0 ,w = 0, f, p, es = 0;
		 String tipo [] = null;
		 Scanner nomeC = new Scanner(System.in);
		 Scanner tp = new Scanner(System.in);
		 Scanner e = new Scanner(System.in);
		 Sessao s1 = new Sessao("Star Wars", 0);
		 Sessao s2 = new Sessao("Guardiões da Galáxia", 1);
		 Sessao s3 = new Sessao("Back to the Future", 2);
		 Sessao s4 = new Sessao("Pulp Fiction", 3);
		 int valorS1 = 0;
		 int valorS2 = 0;
		 int valorS3 = 0;
		 int valorS4 = 0;
		 int valorTotal = 0;
		 mostraMenu();
		 escolha = e.nextInt();
		 do{
		 switch(escolha){
		 
		 case 1: // escolhe os filmes para as sessoes
			 System.out.println("Escolha filme para sessao das 14H");
			  filme = nc.next();
			  s1.setFilme(filme);
			  System.out.println("Escolha filme para sessao das 16H");
			  filme = nc.next();
			  s2.setFilme(filme);
			  System.out.println("Escolha filme para sessao das 18H");
			  filme = nc.next();
			  s3.setFilme(filme);
			  System.out.println("Escolha filme para sessao das 20H");
			  filme = nc.next();
			  s4.setFilme(filme);  
		 break;
		 
		 case 2: /* FALTA CADASTRAR CLINTE COM NOME E SEU TIPO É SO COLOCAR O CONSTRUTOR DE CLIENTE
		 ( na moral sinta-se a vontade pra excluir tudo isso pq nem EU to entendo oq ta acontecendo)*/
			 
			 String nomeCliente;
			 System.out.println("Insira seu nome: \n");  /*desta linha + as duas próximas, programa insere o nome do cliente e o tipo*/
			 nomeCliente = nomeC.next();
			 System.out.println("Você \n0 - Paga entrada inteira\n1 - É doador de sangue/nou 2 - É estudante\n");
			 es = tp.nextInt();
			 escolhaSessao();
			 escolha1 = nc.nextInt();
			 switch(escolha1){
			 case 1:
				 s1.mostraOcupado();
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s1.escolherLugar(ls1[x], f, p);
				 x++;
				 ls1[x].setNome(nomeCliente);
				 ls1[x].setVtipo(tipo);
				 if(isinteira(ls1[x]) == true){
					 S1contNormal++;
				 }else{
					 S1contMeia++;
				 }
			 break;
			 case 2:
				 s2.mostraOcupado();
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s2.escolherLugar(ls2[y], f, p);
				 y++;
				 ls2[y].setNome(nomeCliente);
				 ls2[y].setVtipo(tipo);
				 if(isinteira(ls2[y]) == true){
					 S2contNormal++;
				 }else{
					 S2contMeia++;
				 }
				 
				 break;
			 case 3:
				 s3.mostraOcupado();
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s3.escolherLugar(ls3[z], f, p);
				 z++;
				 ls3[z].setNome(nomeCliente);
				 ls3[z].setVtipo(tipo);
				 if(isinteira(ls3[z]) == true){
					 S3contNormal++;
				 }else{
					 S3contMeia++;
				 }
				 break;
			 case 4:
				 s4.mostraOcupado();
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s4.escolherLugar(ls4[w], f, p);
				 w++;
				 ls4[w].setNome(nomeCliente);
				 ls4[w].setVtipo(tipo);
				 if(isinteira(ls4[w]) == true){
					 S4contNormal++;
				 }else{
					 S4contMeia++;
				 }
				 break;
			 }
			 break;
		case 3: /* checa as pessoas sentadas em cada sessao pela 
		 poltrona e fileiras, as sessos sao escolhida  pelo switch e AH BLA BLA BLA BLA BLA EU ODEIO DOCUMENTAR CODIGO AHHHHHH, Giovanna
		 se endendeu essa parte!! */
			 
			 escolhaSessao();
			 escolha = nc.nextInt();
			 switch(escolha){
			 case 1:
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s1.checkAssento(f, p);
				 break;
			 case 2:
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s2.checkAssento(f, p);
				 break;
			 case 3:
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s3.checkAssento(f, p);
				 break;
			 case 4:
				 System.out.print("escolha fileira: ");
				 f = nc.nextInt();
				 System.out.print("\nescolha poltrona: ");
				 p = nc.nextInt();
				 s4.checkAssento(f, p);
				 break;
			 }
			 break;
		 case 4: // aqui é pra mostrar os resultados financeiro de cada sessao, por isso esses cases ae
			 System.out.println("Escolha a o horário da sessão que deseja ver o resultado financeiro:\n");
			 escolhaSessao();
			 escolha = nc.nextInt();
			 switch(escolha){
			 
			 case 1:
				 valorS1 = (S1contNormal * 22) + (S1contMeia * 11);
				 System.out.println("O resultado financeiro da sessão das 14:00 é R$" + valorS1);			 
				 break;
				 
			 case 2:
				 
				 valorS2 = (S2contNormal * 22) + (S2contMeia * 11);
				 System.out.println("O resultado financeiro da sessão das 16:00 é R$" + valorS2);			 
				 break;
			 case 3:
				 
				 valorS3 = (S3contNormal * 22) + (S3contMeia * 11);
				 System.out.println("O resultado financeiro da sessão das 18:00 é R$" + valorS3);		 
				 break;
			 case 4:
				 
				 valorS4 = (S4contNormal * 22) + (S4contMeia * 11);
				 System.out.println("O resultado financeiro da sessão das 20:00 é R$" + valorS4);			 
				 break;			 
			 }
			 break;
		 case 5: //resultado financeiro de todas as sessões
			 valorTotal = valorS1 + valorS2 + valorS3 + valorS4;
			 System.out.println("Oresultado financeiro total é R$" + valorTotal);
			 break;
		 default:
				System.out.print("Número Inválido\n");
				break;
		  }
		 
		 }while(escolha < 1 && escolha > 5);
	
	
	}
	
	
	public static void mostraMenu(){ // é so uma função pra menu
		System.out.print("-------------------------------------\n");
		System.out.println("1- Cadastrar nome do filme para cada sessao ");
		System.out.println("2- compre seu ingresso ");
		System.out.println("3- Ocupaçao de cada sessao e consuta de cada poltrona");
		System.out.println("4- mostrar lucro da bilheteria de determina sessão ");
		System.out.println("5- mostrar lucro da bilheteria geral ");
		System.out.print("--------------------------------------\n ");
	}
	
	public static void escolhaSessao(){ // é so uma função pra menu
		System.out.print("-------------------------------------\n");
		System.out.println("1- sessao das 14h ");
		System.out.println("2- sessao das 16h ");
		System.out.println("3- sessao das 18h");
		System.out.println("4- sessao das 20h ");
		System.out.print("--------------------------------------\n ");
	}
	
	public static boolean isinteira(Cliente c1){ /* quando invocada consome a stamina do seu oponente... malz nao é sykrim aki nao
		seriao agora, quando invocada pega um cliente e verifica se seu ingreso é meia ou inteira( se for inteira retorna TRUE se nao FLASE */ 
		if(c1.getTipo() == "inteira"){           
		return true;
		}else{
			return false;
		}
	}
	
	
		
		
	
	
}
