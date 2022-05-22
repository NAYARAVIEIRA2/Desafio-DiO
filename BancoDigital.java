import java.util.List;

public class BancoDigital {
	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

	
	
	public String getNome() {
		return nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	} 

}
