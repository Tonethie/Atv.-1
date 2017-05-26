package cinema;

public class pessoa {

		 String nome;
		 private String vtipo[] = {"Inteira", "Doador de sangue", "Estudante"};
		 private String tipo;
		 int escolha4 = 0;
		 int codeTipo = 0;
		 int inteira = 22;
		 int meia = 11;
		 
		
		public pessoa(String nome, int codeTipo){
			super();
			this.nome = nome;     //variável global nome vira varável do parâmetro
			this.tipo = vtipo[codeTipo]; //variável global tipo vira variável vtipo[codetipo]
		}
		
		public int pagamento(int codeTipo){
			switch(codeTipo){
				case 1: 
					codeTipo = 1;
					return inteira;
			case 2:
					codeTipo = 2;
					return meia;
				case 3:
					codeTipo = 3;
					return meia;
				default:
					break;
		}
			//caso codeTipo[1]{
				//será pago o valor integral
				//retorna valor "22" (que será os 22 reais)
			//caso codeTipo[2]{
				//sera pago metade do valor
				//retorna "11" (que será 11 reais)
			//caso codeTipo[3]{
				//sera pago metade do valor
				//retorna "11" (que será 11 reais)
			return codeTipo;
		}


	
	
		public String getNome() { //retorna o nome do cliente
			return nome;
		}
	
	
		public void setNome(String nome) { //set a variável nome global para o parâmetro
			this.nome = nome;
		}
	
	
		public String getTipo() { //retorna para o usuário se o cliente paga Inteira ou se é Doador de sangue ou estudante
			return tipo;
		}

	
}
