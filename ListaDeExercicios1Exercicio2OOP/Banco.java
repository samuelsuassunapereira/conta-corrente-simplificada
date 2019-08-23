package ListaDeExercicios1Exercicio2OOP;

public class Banco {
	ContaCorrente conta[] = new ContaCorrente[50];
	int i = 0;
	
	void criarConta(String numConta, double saldo, boolean statusEspecial, double limite) {
		
		this.conta[i] = new ContaCorrente();
		this.conta[i].numConta = numConta;
		this.conta[i].saldo = saldo;
		this.conta[i].statusEspecial = statusEspecial;
		this.conta[i].limiteDisponivel = limite;
		this.conta[i].limiteAtual = limite;
		this.conta[i].conjMovimentacao[0].descricao = "Conta criada com sucesso";
				 this.conta[i].conjMovimentacao[0].valorMovimentacao = saldo;
				 this.conta[i].conjMovimentacao[0] = new Movimentacao();
				 this.conta[i].conjMovimentacao[0].infoMovCreDeb =	"Criação de conta";
				 i++;
				 System.out.println("Conta " + numConta + " criada com sucesso");
				 
				 
	}
	
	
	double sacar(String numConta, double valor) {
		
		int j = 0, l = 0;
		
		
	}
	
	
	
}
