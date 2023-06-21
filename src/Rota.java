public class Rota {
	// Propriedades da classe
	private Aeroporto origem = null;
	private Aeroporto destino = null;
	private Aviao objAviao = null;
	
	// Métodos construtores da classe
	public Rota() {
		super();
	}

	public Rota(Aeroporto origem, Aeroporto destino, Aviao objAviao) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.objAviao = objAviao;
	}

	// Métodos get/set da classe
	public Aeroporto getOrigem() {
		return origem;
	}

	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	public Aviao getObjAviao() {
		return objAviao;
	}

	public void setObjAviao(Aviao objAviao) {
		this.objAviao = objAviao;
	}
}