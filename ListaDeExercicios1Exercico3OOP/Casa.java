package ListaDeExercicios1Exercico3OOP;

public class Casa {

	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	
	void pinta(String s) {
		this.cor = s;
	}
	
	int totalDePortas() {
		return 3;
	}
	
	int quantasPortasEstaoAbertas() {
		int cont = 0;//iniciano o contador em zero
		
		if(porta1.estaAberta() == true) {
			cont++;
		}
		if (porta2.estaAberta() == true){
			cont++;			
		}
		if(porta3.estaAberta() == true) {
			cont++;
		}
	}
	
	
	
}
