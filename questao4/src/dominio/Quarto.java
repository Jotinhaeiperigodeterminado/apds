package dominio;

public class Quarto {

	private PortaQuarto porta;
	private boolean Banheiro;
	private float MetragemQuadrada;

	public PortaQuarto getPorta() {
		return porta;
	}

	public void setPorta(PortaQuarto porta) {
		this.porta = porta;
	}

	public boolean isBanheiro() {
		return Banheiro;
	}

	public void setBanheiro(boolean banheiro) {
		Banheiro = banheiro;
	}

	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}

	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}

}
