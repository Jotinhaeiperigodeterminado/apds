package dominio;

public class Cozinha {

	private PortaCozinha porta;
	private boolean americana;
	private float MetragemQuadrada;
	
	public PortaCozinha getPorta() {
		return porta;
	}

	public void setPorta(PortaCozinha porta) {
		this.porta = porta;
	}

	public boolean isAmericana() {
		return americana;
	}

	public void setAmericana(boolean americana) {
		this.americana = americana;
	}

	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}

	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}

}
