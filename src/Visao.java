import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private Painel objPainel = new Painel();
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// Método construtor da classe
	public Visao() {
		// Configuração da janela
		setTitle("Controle de Tráfego Aéreo");
		setSize(1040, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("aviao.png").getImage());
		
		// Configuração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// Configuração da Thread
		new Movimento(objPainel).start();
	}
}