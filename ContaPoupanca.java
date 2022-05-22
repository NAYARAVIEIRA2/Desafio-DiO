
public  class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("***Extrato Conta Poupanca***");
		System.out.println(String.format("Titular:%s" , super.cliente.getNome()));
		System.out.println(String.format("CPF : %s" , super.cliente.getCpf()));
		System.out.println(String.format("Agencia:%d" , super.agencia));
		System.out.println(String.format("Numero :%d" , super.numero));
		System.out.println(String.format("Saldo: %.2f" , super.saldo));
		

		}
		
	}
	
