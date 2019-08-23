
public class Principal2 {
	
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
		conta1.saldo = 1000.00;
		conta1.especial = true;
		
		//declarando variavel
		double saldoDaKamila;
		
		saldoDaKamila = conta1.sacar(6001.00);
		//System.out.println("SALDO DA KAIMLA PELA VARIAVÉL: "+saldoDaKamila);
		
		
		//poderia ficar ContaCorrenteSimplificada conta2 = new ContaCorrenteSimplificada();
		ContaCorrenteSimplificada conta2 = new ContaCorrenteSimplificada();
		
		conta2.nomeDoCorrentista = "Victor";
		conta2.nroConta = "556-8";
		conta2.agencia ="123";
		conta2.saldo = 350000.00;
		conta2.especial = true;
		
		//declarando variavel
		double saldoDoVictor;
		
		//saldoDoVictor = conta2.depositar(450000.00);
		//System.out.println("SALDO DO VICTOR PELA VARIAVEL: " + saldoDoVictor);	
		
		conta1.exibeSaldo();
		//conta2.exibeSaldo();
		
		
	}
	
	
}
