
public class Teste {

	public static void main(String[] args) {
		Cliente Nayara = new Cliente ();
		Nayara.setNome("Nayara");
		Nayara.setCpf("356.698.469-03");
		Conta cc = new ContaCorrente(Nayara);
		 cc.depositar(1000);
		 cc.sacar(20);
		 
		 
		 Conta poupanca = new ContaPoupanca(Nayara);
		 cc.transferir(500, poupanca);
		 poupanca.depositar(50);
		  cc.imprimirExtrato();
		 poupanca.imprimirExtrato();
	}

}
