package exemploCliente;

public class cliente {
	
	String nome;
	int idade;
	boolean temCadastro;
	double altura;

	public void cadastro() {
		temCadastro=true;
	}
	
	public void semCadastro() {
		temCadastro=false;
	}
	
	public void sitcad() {
		if(temCadastro==true)
			System.out.println("Seja bem vindo ao site!!");
		else
			System.out.println("Primeiro faça seu cadastro!!");
	}
	
	public void status() {
		System.out.println("O nome do cliente é: "+this.nome);
		System.out.println("A idade do cliente é: "+this.idade);
		System.out.println("A altura do cliente é: "+this.altura);
		
	}
	
	
	
}