
public class aviao {
	
	String cor;
	String empresa;
	double tamanho;
	boolean ligado;
	
// Metodos
	
	public void ligar() {
		ligado=true;
	}
	
	public void desligar() {
		ligado=false;
	}
	
	public void voar() {
		if (ligado==true)
			System.out.println("Pode voar!");
		else 
			System.out.println("Calma l� filh�o, t� desligado.");
	}
	
	public void status() {
		System.out.println("O avi�o tem a cor "+this.cor);
		System.out.println("O tamanho do avi�o � "+this.tamanho);
		System.out.println("O tamanho do avi�o � "+this.empresa);
		
		
		
	}

}
