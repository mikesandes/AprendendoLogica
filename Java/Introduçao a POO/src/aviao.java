
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
			System.out.println("Calma lá filhão, tá desligado.");
	}
	
	public void status() {
		System.out.println("O avião tem a cor "+this.cor);
		System.out.println("O tamanho do avião é "+this.tamanho);
		System.out.println("O tamanho do avião é "+this.empresa);
		
		
		
	}

}
