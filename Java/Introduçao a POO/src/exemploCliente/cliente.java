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
			System.out.println("Primeiro fa�a seu cadastro!!");
	}
	
	public void status() {
		System.out.println("O nome do cliente �: "+this.nome);
		System.out.println("A idade do cliente �: "+this.idade);
		System.out.println("A altura do cliente �: "+this.altura);
		
	}
	
	
	
}