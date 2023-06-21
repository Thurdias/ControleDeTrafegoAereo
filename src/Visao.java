import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private Painel objPainel = new Painel();
	
	// M�todo principal de execu��o da classe
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// M�todo construtor da classe
	public Visao() {
		// Configura��o da janela
		setTitle("Controle de Tr�fego A�reo");
		setSize(1040, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("aviao.png").getImage());
		
		// Configura��o do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// Configura��o da Thread
		new Movimento(objPainel).start();
	}
}