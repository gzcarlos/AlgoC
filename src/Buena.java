import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import tools.ManFile;


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
				ManFile mfile = new ManFile();
				
				Buena.this.dispose();
			}
		});
		btnEnviar.setBounds(121, 105, 89, 23);
		contentPane.add(btnEnviar);
	}
}
