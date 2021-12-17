package PooExercicio;

public class Cachorro extends Animal {

	private String nome;
	private int idade;

	public Cachorro(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	void emitirSom() {
		System.out.println("Au au...");
	}

}
