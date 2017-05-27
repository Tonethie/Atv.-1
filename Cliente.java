package cinema;

public class Cliente {

		private String nome;
		 private String vtipo[] = {"Inteira", "Doador de sangue", "Estudante"};
		 private String tipo;
		 
		public Cliente(String nome, int codeTipo){ // construtor da classe cliente
			super();
			this.nome = nome;     
			this.tipo = vtipo[codeTipo]; 
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String[] getVtipo() {
			return vtipo;
		}

		public void setVtipo(String[] vtipo) {
			this.vtipo = vtipo;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		

	
}
