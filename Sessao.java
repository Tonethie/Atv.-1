package cinema;


public class  Sessao {
    private int codeSessao;
    private boolean [][]lugar = new boolean[10][20];
    private String [][]dataLugar = new String[10][20];
	private String HSessao[] = {"14h", "16h", "18h", "20h"};
    private String filme;


 public Sessao(String filme, int codeSessao){
	 super();
	 this.filme = filme;
	 this.codeSessao = codeSessao;  
	 
 }
 
 public void lugares(int f, int p){	
	 this.lugar[f][p] = true;
	 
	 //this.dataLugar[f][p] = getNome() + " " + getTipo(); // nao sei como importar o nome e o tipo pra cá
	} 

 public void mostraOcupado(){ // imprime os lugares que estao livre e ocupados em uma matriz
	 for (int i = 0; i < 10; i++) {
		 System.out.print("\n");
		 System.out.print(i + "  ");
		 
		 for (int j = 0; j < 20; j++) {
			 if(lugar[i][j] == true){
			 System.out.print("O  ");
			 }else{
				 System.out.print("L  ");
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

 
 
public String getHSessao() {
	return HSessao[codeSessao];
}


public String getFilme() {
	return filme;
}


public void setFilme(String filme) {
	this.filme = filme;
}


public void setHSessao(int codeSessao) {
	HSessao[codeSessao] = HSessao[codeSessao];
}
 
 
	
	
	

}
