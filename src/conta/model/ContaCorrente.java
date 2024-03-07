package conta.model;

// ContaCorrente herda de Conta
public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numeroConta, int agencia, int tipo, String titular, float saldo, float limite) {

		// super() == Método Const. da Super Classe | Ex.: Conta(numeroConta, agencia, tipo, titular, saldo)
		super(numeroConta, agencia, tipo, titular, saldo);

		// Atributo da Classe ContaCorrente
		this.limite = limite;
	}

	// Métodos de Acesso da Classe ContaCorrente
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// Métodos Especificos da Classe ContaCorrente
	
	@Override // Override = Sobrescrever
	public void visualizar() {
		// palavra super. == chamada da Cuperclasse | Ex.: Conta.visualizar();
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
