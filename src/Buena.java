import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import tools.ManFile;
import java.awt.Toolkit;


public class Buena extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buena frame = new Buena();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Buena() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\icono.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 236, 177);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbIntro = new JLabel("Introduce Path:");
		lbIntro.setBounds(10, 11, 127, 20);
		contentPane.add(lbIntro);
		
		tfNumero = new JTextField();
		tfNumero.setText("C:\\Users\\Carlos\\Documents\\Workspace\\AlgoC\\file.txt");
		tfNumero.setBounds(10, 55, 166, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<Integer> ls = new ArrayList<Integer>();
				ManFile mfile = new ManFile();
				GamePlay gPlay = new GamePlay();
				
				ls = mfile.LoadFile(tfNumero.getText(), true);
				gPlay.setVisible(true);
				Buena.this.dispose();
			}
		});
		btnEnviar.setBounds(121, 105, 89, 23);
		contentPane.add(btnEnviar);
	}
}
