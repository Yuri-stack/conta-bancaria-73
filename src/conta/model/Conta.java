package conta.model;

public class Conta {

	// Atributos / Caracteristicas
	
	// Encapsulamento: Encapsular/Proteger algo 
	// Private / Protected / Public / Friendly
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Método Construtor => que auxilia na criação/instanciação de um Objeto da Classe
	public Conta(int numeroConta, int agencia, int tipo, String titular, float saldo) {
		
		// this(Esta): representa o nome da própria Classe (Conta)
		
		numero = numeroConta;	
		this.agencia = agencia;	// Conta.agencia recebe o valor do arg. agencia
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Métodos de Acesso (Método Get/Getter - Método Set/Setter)
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numeroConta) {
		this.numero = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
		
	// Métodos / Ações
	
	// Método Visualizar
	
}
