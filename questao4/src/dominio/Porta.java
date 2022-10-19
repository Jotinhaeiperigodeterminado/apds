package dominio;

public class Porta {

	private String Cor;
	private float largura;
	private float Altura;
	private double peso;
	
	
	public void abrir() {
		System.out.println("Abrindo porta");
	}
	
	public void fechar() {
		System.out.println("Fechando porta");
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return Altura;
	}

	public void setAltura(float altura) {
		Altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
}
