import java.util.ArrayList;

public class Movimento extends Thread {
	// Propriedades da classe
	private Painel objPainel = null;
	
	// Método construtor da classe
	public Movimento(Painel objPainel) {
		super();
		this.objPainel = objPainel;
	}

	// Método de execução paralela da classe
	public void run() {
		try {
			ArrayList<Rota> colecao = new Desenho().lerArquivo();
			while (true) {
				for (Rota objRota : colecao) {
					double x1 = objRota.getOrigem().getX();
					double y1 = objRota.getOrigem().getY();
					double x2 = objRota.getDestino().getX();
					double y2 = objRota.getDestino().getY();
					
					double incremento = ((y2 - y1) / (x2 - x1));
					
					boolean sinal = true;
					if (incremento < 0) {
						sinal = false;
					}
					
					Aviao objAviao = objRota.getObjAviao();
					
					int novoX = objAviao.getX() + (sinal ? -1 : 1);
					if ((! sinal) && (novoX > objRota.getDestino().getX())) {
						novoX = objRota.getDestino().getX();
					}
					if ((sinal) && (novoX < objRota.getDestino().getX())) {
						novoX = objRota.getDestino().getX();
					}
					objAviao.setX(novoX);
					objAviao.setY((int) (y1 + incremento * (objAviao.getX() - x1)));
				}
				
				objPainel.setColecao(colecao);
				objPainel.repaint();
				
				sleep(20);
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
	}
}