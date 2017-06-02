package cinema;


public class  Sessao {

    private Cliente [][]dataLugar = new Cliente[10][20];
	private String HSessao[] = {"14h", "16h", "18h", "20h"};
	private String sessao;
    private String filme;


 public Sessao(String filme, int codeSessao){ // construtor da classe
	 super();
	 this.filme = filme;
	 this.sessao = HSessao[codeSessao];
	 
 }
 
 public void escolherLugar(Cliente c , int f, int p){ // atribui uma clinte para uma posiçao na matriz
	 
	 this.dataLugar[f][p] = c;
	 
 }

 public void mostraOcupado(){ // imprime os lugares que estao livre e ocupados em uma matriz
	 for (int i = 0; i < 10; i++) {
		 System.out.print("\n");
		 System.out.print(i + "  ");
		 
		 for (int j = 0; j < 20; j++) {
			 if(dataLugar[i][j] == null){
			 System.out.print("L  ");
			 }else{
				 System.out.print("O  ");
			 }
		}
	}
	 System.out.print("\n\n"); 
	 System.out.print("   ");
	 for (int j = 0; j < 10; j++){ // imprime o numero guia para o numro de poltonas
		 System.out.print(j + "  "); 
	 }
	 for (int j = 10; j < 20; j++){  // depois do 10 os espaços estre os numro começao a ficar maiore
		 System.out.print(j + " ");  // pois tive q fazer 2 for com espaços diferentes dpois do 10
	 }
 }
 
 public void checkAssento(int f1, int p1){ // chega se os assentos mostrando a matriz  
	 mostraOcupado();
	 if(dataLugar[f1][p1] != null){
		 System.out.println("\nesse assento esta sendo ocupado por: " + dataLugar[f1][p1].getNome() + // informa o nome do clinte e tipo de pagante q ele é
			            "\nque é pagante: " + dataLugar[f1][p1].getTipo());
	 }else{
		 System.out.println("\nesse lugar nao esta sendo ocupado por ninguem!! ");
	 }
 }

public Cliente[][] getDataLugar() {
	return dataLugar;
}

public void setDataLugar(Cliente[][] dataLugar) {
	this.dataLugar = dataLugar;
}

public String[] getHSessao() {
	return HSessao;
}

public void setHSessao(String[] hSessao) {
	HSessao = hSessao;
}

public String getSessao() {
	return sessao;
}

public void setSessao(String sessao) {
	this.sessao = sessao;
}

public String getFilme() {
	return filme;
}

public void setFilme(String filme) {
	this.filme = filme;
}

 
}
 
