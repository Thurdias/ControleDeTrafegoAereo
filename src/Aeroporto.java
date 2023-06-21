public class Aeroporto {
	// Propriedades da classe
	private String sigla = "";
	private int x = 0;
	private int y = 0;
	
	// Métodos construtores da classe
	public Aeroporto() {
		super();
	}

	public Aeroporto(String sigla, int x, int y) {
		super();
		this.sigla = sigla;
		this.x = x;
		this.y = y;
	}

	// Métodos get/set da classe
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}