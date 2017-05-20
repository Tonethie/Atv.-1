package cinema;

public class Cliente {
	
	 String nome;
	 private String vtipo[] = {"Inteira", "Doaador de sangue", "Estudante"};
	 private String tipo;
	
	
	public Cliente(String nome, int codeTipo){
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


	public String getTipo() {
		return tipo;
	}

	

}
