import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Painel extends JPanel {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	private ArrayList<Rota> colecao = null;
	
	// Método set da classe
	public void setColecao(ArrayList<Rota> colecao) {
		this.colecao = colecao;
	}

	// Método sobrescrito da superclasse
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(new ImageIcon("mapa.jpg").getImage(), 0, 0, null);
		
		for (Rota objRota : colecao) {
			g.fillOval(objRota.getOrigem().getX(),
					   objRota.getOrigem().getY(), 7, 7);
			
			g.fillOval(objRota.getDestino().getX(),
					   objRota.getDestino().getY(), 7, 7);
			
			g.drawLine(objRota.getOrigem().getX() + 3,
					   objRota.getOrigem().getY() + 3,
					   objRota.getDestino().getX() + 3,
					   objRota.getDestino().getY() + 3);
			
			g.drawImage(new ImageIcon("aviao.png").getImage(),
						objRota.getObjAviao().getX() - 7,
						objRota.getObjAviao().getY() - 7,
						21, 21, null);
		}
	}
}