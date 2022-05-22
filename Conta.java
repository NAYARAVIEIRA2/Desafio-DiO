
public abstract class Conta implements IConta {
	private static final int Agencia_Padrao = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = Agencia_Padrao;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	

        public int getAgencia() {
	        return agencia;
}
        public int getNumero() {
	    return numero;
}
    public double getSaldo() {
	  return saldo;
}



}
