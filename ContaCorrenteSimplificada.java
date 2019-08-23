
public class ContaCorrenteSimplificada {

	String nomeDoCorrentista;
	String agencia;
	String nroConta;
	double saldo;
	boolean especial;
	PessoaFisica [] pessoas = new PessoaFisica[2];
	int qtdMax = 2;
	int qtdAtual = 0;
	
	//metodo de sacar dinheiro da conta
	double sacar(double valor) {
		//double limite = 5000;
		if(valor > this.saldo && this.especial == false) {
			System.out.println("Saldo insuficiente para o saque");
		}else{
			if(this.saldo - valor > -5000 ) {
				this.saldo = this.saldo -valor;
				
			}
			
				
		}
			
		
		
		return this.saldo;
	}
//  tipo do retorno do método ||- > parametro
	double depositar(double valor ) {
		this.saldo = this.saldo + valor;
		return this.saldo;
	}
	
	void exibeSaldo() {
		System.out.println("SALDO: " + this.saldo);
	}
	
	//metodo que adiciona e verifica se a posição 0 esta vazia 
	void adicionarPessoa(PessoaFisica p) {
		if(qtdAtual<qtdMax) {
			this.pessoas[qtdAtual] = p;
			qtdAtual++;
		}
	}
	//variavel de referencia guarda um endereço de memoria do objeto;
	
	void imprimirDadosDoCorrentista() {
		
		for (int i = 0; i < qtdMax; i++) {
			if(this.pessoas[i] != null) {
				System.out.println("=== CORRENTISTA"+(i+1)+ " ===");
				System.out.println("Nome: "+ this.pessoas[i].nome);
				System.out.println("CPF: "+ this.pessoas[i].cpf);
				System.out.println("RG: "+ this.pessoas[i].rg);
				System.out.println("ORGAO EXPEDIDOR: "+ this.pessoas[i].orgaoExpedidor);
				System.out.println("DATA NASCIMENTO: "+ this.pessoas[i].dataNascimento);
				System.out.println("PROFISSAO: "+ this.pessoas[i].profissao);
					
			}
		}
	
	}
	
}
