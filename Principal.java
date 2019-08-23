
public class Principal {
	
	//main ctrl+ space
	public static void main(String[] args) {//tem que ter o main pra rodar o programa
		
		//criei uma variavel conta1 com tipo contacorrentesimplificada, a variavel de referencia conta 1 ele vai ate a referencia pra ela nao se perder
		
		/*criei uma variavel conta1 com tipo contacorrentesimplificada, 
		 * a variavel de referencia conta 1 ele vai ate a
		 *  referencia pra ela nao se perder
		 */
		
		ContaCorrenteSimplificada conta1;
		//nem é um operador para criar/instanciar objetos
		//contacorrentesimplificada é um objeto conforme exemplo seria o formulario onde guarda todos os atributos dessa classe
		//conta1 é o formulario resumido, ou seja acessa o metodo por variavel de referencia
		conta1 = new ContaCorrenteSimplificada();
		
		//atribuindo valores nos atributos de conta1
		conta1.agencia = "123";
		conta1.nroConta = "789-2";
		conta1.nomeDoCorrentista = "Kamila";
		conta1.saldo = 100000.00;
		conta1.especial = true;
		
		//declarando variavel
		double saldoDaKamila;
		
		saldoDaKamila = conta1.sacar(1000.0);
		System.out.println("SALDO DA KAIMLA PELA VARIAVÉL: "+saldoDaKamila);
		
		
		//poderia ficar ContaCorrenteSimplificada conta2 = new ContaCorrenteSimplificada();
		ContaCorrenteSimplificada conta2;
		conta2 = new ContaCorrenteSimplificada();
		
		conta2.nomeDoCorrentista = "Victor";
		conta2.nroConta = "556-8";
		conta2.agencia ="123";
		conta2.saldo = 350000.00;
		conta2.especial = true;
		
		//declarando variavel
		double saldoDoVictor;
		
		saldoDoVictor = conta2.depositar(250);
		System.out.println("SALDO DO VICTOR PELA VARIAVEL: " + saldoDoVictor);		
		conta1.exibeSaldo();
		conta2.exibeSaldo();
		
		
		/*
		 * TESTANDO ALGUMAS COISAS
		 */
		ContaCorrenteSimplificada conta3 = new ContaCorrenteSimplificada();
		
		conta3.nomeDoCorrentista = "Samuel";
		conta3.nroConta = "891-0";
		conta3.agencia = "001";
		conta3.saldo = 1900000.00;
		conta3.especial = true;
		
		double saldoDoSamuel;
		
		conta3.sacar(1000);
		conta3.depositar(1005);
		conta3.exibeSaldo();
		
		ContaCorrenteSimplificada conta4 = new ContaCorrenteSimplificada();
		
		conta4.nomeDoCorrentista = "Marcos";
		conta4.nroConta = "987-3";
		conta4.agencia = "003";
		conta4.saldo = 24556.00;
		conta4.especial = true;
		
		conta4.sacar(200);
		conta4.depositar(21);
		conta4.exibeSaldo();
		
		ContaCorrenteSimplificada conta5 = new ContaCorrenteSimplificada();
		
		conta5.nomeDoCorrentista = "José";
		conta5.nroConta = "343-2";
		conta5.agencia ="233";
		conta5.saldo = 222455.00;
		conta5.especial = true;
		
		
		conta5.sacar(32);
		conta5.depositar(365);
		conta5.exibeSaldo();
		
		
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.nome = "João da Silva Sauro";
		pessoa.dataNascimento = "29/02/1996";
		pessoa.cpf = "123.321.741-38";
		pessoa.rg = "85732-22";
		pessoa.orgaoExpedidor = "SSP/GO";
		pessoa.profissao = "Desenvolvedor";
		
		
		ContaCorrenteSimplificada c3 = new ContaCorrenteSimplificada();
		c3.agencia = "456-1";
		c3.nroConta = "33725-2";
		c3.especial = false;
		c3.adicionarPessoa(pessoa);
		System.out.println(pessoa.nome);
		c3.imprimirDadosDoCorrentista();
		
	}
	
	
}
