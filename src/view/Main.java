package view;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.CassinoControllerThread;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField [] dados = new JTextField[20];
	private JTextField txtColocao;
	private JTextField txtLugar;
	private JTextField txtLugar_2;
	private JTextField txtLugar_1;
	private JTextField _1lugar;
	private JTextField _2lugar;
	private JTextField _3lugar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.BLACK);
		canvas_1.setBounds(188, 44, 48, 58);
		contentPane.add(canvas_1);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(Color.BLACK);
		canvas_1_1.setBounds(283, 44, 48, 58);
		contentPane.add(canvas_1_1);
		
		Canvas canvas_1_2 = new Canvas();
		canvas_1_2.setBackground(Color.BLACK);
		canvas_1_2.setBounds(382, 44, 48, 58);
		contentPane.add(canvas_1_2);
		
		Canvas canvas_1_3 = new Canvas();
		canvas_1_3.setBackground(Color.BLACK);
		canvas_1_3.setBounds(491, 44, 48, 58);
		contentPane.add(canvas_1_3);
		
		Canvas canvas_1_4 = new Canvas();
		canvas_1_4.setBackground(Color.BLACK);
		canvas_1_4.setBounds(590, 44, 48, 58);
		contentPane.add(canvas_1_4);
		
		Canvas canvas_1_5 = new Canvas();
		canvas_1_5.setBackground(Color.BLACK);
		canvas_1_5.setBounds(188, 338, 48, 58);
		contentPane.add(canvas_1_5);
		
		Canvas canvas_1_6 = new Canvas();
		canvas_1_6.setBackground(Color.BLACK);
		canvas_1_6.setBounds(283, 338, 48, 58);
		contentPane.add(canvas_1_6);
		
		Canvas canvas_1_7 = new Canvas();
		canvas_1_7.setBackground(Color.BLACK);
		canvas_1_7.setBounds(382, 338, 48, 58);
		contentPane.add(canvas_1_7);
		
		Canvas canvas_1_8 = new Canvas();
		canvas_1_8.setBackground(Color.BLACK);
		canvas_1_8.setBounds(491, 338, 48, 58);
		contentPane.add(canvas_1_8);
		
		Canvas canvas_1_9 = new Canvas();
		canvas_1_9.setBackground(Color.BLACK);
		canvas_1_9.setBounds(590, 338, 48, 58);
		contentPane.add(canvas_1_9);
		
		dados[0] = new JTextField();
		dados[0].setEditable(false);
		dados[0].setHorizontalAlignment(SwingConstants.CENTER);
		dados[0].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[0].setBackground(Color.LIGHT_GRAY);
		dados[0].setBounds(175, 11, 28, 30);
		contentPane.add(dados[0]);
		dados[0].setColumns(10);
		
		Panel panel = new Panel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(185, 108, 453, 218);
		contentPane.add(panel);
		
		dados[10] = new JTextField();
		dados[10].setEditable(false);
		dados[10].setHorizontalAlignment(SwingConstants.CENTER);
		dados[10].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[10].setColumns(10);
		dados[10].setBackground(Color.LIGHT_GRAY);
		dados[10].setBounds(221, 11, 28, 30);
		contentPane.add(dados[10]);
		
		
		
		dados[15] = new JTextField();
		dados[15].setEditable(false);
		dados[15].setHorizontalAlignment(SwingConstants.CENTER);
		dados[15].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[15].setColumns(10);
		dados[15].setBackground(Color.LIGHT_GRAY);
		dados[15].setBounds(221, 398, 28, 30);
		contentPane.add(dados[15]);
		
		dados[6] = new JTextField();
		dados[6].setEditable(false);
		dados[6].setHorizontalAlignment(SwingConstants.CENTER);
		dados[6].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[6].setColumns(10);
		dados[6].setBackground(Color.LIGHT_GRAY);
		dados[6].setBounds(272, 398, 28, 30);
		contentPane.add(dados[6]);
		
		dados[16] = new JTextField();
		dados[16].setEditable(false);
		dados[16].setHorizontalAlignment(SwingConstants.CENTER);
		dados[16].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[16].setColumns(10);
		dados[16].setBackground(Color.LIGHT_GRAY);
		dados[16].setBounds(310, 398, 28, 30);
		contentPane.add(dados[16]);
		
		dados[7] = new JTextField();
		dados[7].setEditable(false);
		dados[7].setHorizontalAlignment(SwingConstants.CENTER);
		dados[7].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[7].setColumns(10);
		dados[7].setBackground(Color.LIGHT_GRAY);
		dados[7].setBounds(369, 398, 28, 30);
		contentPane.add(dados[7]);
		
		dados[17] = new JTextField();
		dados[17].setEditable(false);
		dados[17].setHorizontalAlignment(SwingConstants.CENTER);
		dados[17].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[17].setColumns(10);
		dados[17].setBackground(Color.LIGHT_GRAY);
		dados[17].setBounds(407, 398, 28, 30);
		contentPane.add(dados[17]);
		
		dados[8] = new JTextField();
		dados[8].setEditable(false);
		dados[8].setHorizontalAlignment(SwingConstants.CENTER);
		dados[8].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[8].setColumns(10);
		dados[8].setBackground(Color.LIGHT_GRAY);
		dados[8].setBounds(484, 398, 28, 30);
		contentPane.add(dados[8]);
		
		dados[18] = new JTextField();
		dados[18].setEditable(false);
		dados[18].setHorizontalAlignment(SwingConstants.CENTER);
		dados[18].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[18].setColumns(10);
		dados[18].setBackground(Color.LIGHT_GRAY);
		dados[18].setBounds(522, 398, 28, 30);
		contentPane.add(dados[18]);
		
		dados[9] = new JTextField();
		dados[9].setEditable(false);
		dados[9].setHorizontalAlignment(SwingConstants.CENTER);
		dados[9].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[9].setColumns(10);
		dados[9].setBackground(Color.LIGHT_GRAY);
		dados[9].setBounds(580, 398, 28, 30);
		contentPane.add(dados[9]);
		
		dados[19] = new JTextField();
		dados[19].setEditable(false);
		dados[19].setHorizontalAlignment(SwingConstants.CENTER);
		dados[19].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[19].setColumns(10);
		dados[19].setBackground(Color.LIGHT_GRAY);
		dados[19].setBounds(623, 398, 28, 30);
		contentPane.add(dados[19]);
		
		txtColocao = new JTextField();
		txtColocao.setHorizontalAlignment(SwingConstants.CENTER);
		txtColocao.setText("Coloca\u00E7\u00E3o:");
		txtColocao.setEditable(false);
		txtColocao.setBounds(54, 127, 86, 20);
		contentPane.add(txtColocao);
		txtColocao.setColumns(10);
		
		txtLugar = new JTextField();
		txtLugar.setEditable(false);
		txtLugar.setText("1\u00BA Lugar");
		txtLugar.setToolTipText("");
		txtLugar.setBounds(10, 158, 48, 20);
		contentPane.add(txtLugar);
		txtLugar.setColumns(10);
		
		txtLugar_2 = new JTextField();
		txtLugar_2.setToolTipText("");
		txtLugar_2.setText("2\u00BA Lugar");
		txtLugar_2.setEditable(false);
		txtLugar_2.setColumns(10);
		txtLugar_2.setBounds(10, 202, 48, 20);
		contentPane.add(txtLugar_2);
		
		txtLugar_1 = new JTextField();
		txtLugar_1.setToolTipText("");
		txtLugar_1.setText("3\u00BA Lugar");
		txtLugar_1.setEditable(false);
		txtLugar_1.setColumns(10);
		txtLugar_1.setBounds(10, 246, 48, 20);
		contentPane.add(txtLugar_1);
		
		_1lugar = new JTextField();
		_1lugar.setHorizontalAlignment(SwingConstants.CENTER);
		_1lugar.setEditable(false);
		_1lugar.setBounds(64, 158, 86, 20);
		contentPane.add(_1lugar);
		_1lugar.setColumns(10);
		
		_2lugar = new JTextField();
		_2lugar.setHorizontalAlignment(SwingConstants.CENTER);
		_2lugar.setEditable(false);
		_2lugar.setColumns(10);
		_2lugar.setBounds(64, 202, 86, 20);
		contentPane.add(_2lugar);
		
		_3lugar = new JTextField();
		_3lugar.setHorizontalAlignment(SwingConstants.CENTER);
		_3lugar.setEditable(false);
		_3lugar.setColumns(10);
		_3lugar.setBounds(64, 246, 86, 20);
		contentPane.add(_3lugar);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(25, 42, 89, 23);
		contentPane.add(btnStart);
		
		dados[5] = new JTextField();
		dados[5].setHorizontalAlignment(SwingConstants.CENTER);
		dados[5].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[5].setEditable(false);
		dados[5].setColumns(10);
		dados[5].setBackground(Color.LIGHT_GRAY);
		dados[5].setBounds(175, 398, 28, 30);
		contentPane.add(dados[5]);
		
		dados[1] = new JTextField();
		dados[1].setHorizontalAlignment(SwingConstants.CENTER);
		dados[1].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[1].setEditable(false);
		dados[1].setColumns(10);
		dados[1].setBackground(Color.LIGHT_GRAY);
		dados[1].setBounds(272, 11, 28, 30);
		contentPane.add(dados[1]);
		
		dados[11] = new JTextField();
		dados[11].setHorizontalAlignment(SwingConstants.CENTER);
		dados[11].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[11].setEditable(false);
		dados[11].setColumns(10);
		dados[11].setBackground(Color.LIGHT_GRAY);
		dados[11].setBounds(310, 11, 28, 30);
		contentPane.add(dados[11]);
		
		dados[2] = new JTextField();
		dados[2].setHorizontalAlignment(SwingConstants.CENTER);
		dados[2].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[2].setEditable(false);
		dados[2].setColumns(10);
		dados[2].setBackground(Color.LIGHT_GRAY);
		dados[2].setBounds(369, 11, 28, 30);
		contentPane.add(dados[2]);
		
		dados[12] = new JTextField();
		dados[12].setHorizontalAlignment(SwingConstants.CENTER);
		dados[12].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[12].setEditable(false);
		dados[12].setColumns(10);
		dados[12].setBackground(Color.LIGHT_GRAY);
		dados[12].setBounds(407, 11, 28, 30);
		contentPane.add(dados[12]);
		
		dados[3] = new JTextField();
		dados[3].setHorizontalAlignment(SwingConstants.CENTER);
		dados[3].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[3].setEditable(false);
		dados[3].setColumns(10);
		dados[3].setBackground(Color.LIGHT_GRAY);
		dados[3].setBounds(484, 11, 28, 30);
		contentPane.add(dados[3]);
		
		dados[13] = new JTextField();
		dados[13].setHorizontalAlignment(SwingConstants.CENTER);
		dados[13].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[13].setEditable(false);
		dados[13].setColumns(10);
		dados[13].setBackground(Color.LIGHT_GRAY);
		dados[13].setBounds(522, 11, 28, 30);
		contentPane.add(dados[13]);
		
		dados[4] = new JTextField();
		dados[4].setHorizontalAlignment(SwingConstants.CENTER);
		dados[4].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[4].setEditable(false);
		dados[4].setColumns(10);
		dados[4].setBackground(Color.LIGHT_GRAY);
		dados[4].setBounds(580, 11, 28, 30);
		contentPane.add(dados[4]);
		
		dados[14] = new JTextField();
		dados[14].setHorizontalAlignment(SwingConstants.CENTER);
		dados[14].setFont(new Font("Tahoma", Font.PLAIN, 32));
		dados[14].setEditable(false);
		dados[14].setColumns(10);
		dados[14].setBackground(Color.LIGHT_GRAY);
		dados[14].setBounds(623, 11, 28, 30);
		contentPane.add(dados[14]);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane.setText(" 1");
		textPane.setBounds(150, 63, 32, 35);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText(" 2");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(245, 63, 32, 35);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText(" 3");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(344, 63, 32, 35);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText(" 4");
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_3.setBackground(Color.LIGHT_GRAY);
		textPane_3.setBounds(453, 63, 32, 35);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText(" 5");
		textPane_4.setForeground(Color.BLACK);
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_4.setBackground(Color.LIGHT_GRAY);
		textPane_4.setBounds(552, 63, 32, 35);
		contentPane.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText(" 6");
		textPane_5.setForeground(Color.BLACK);
		textPane_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_5.setBackground(Color.LIGHT_GRAY);
		textPane_5.setBounds(150, 346, 32, 35);
		contentPane.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText(" 7");
		textPane_6.setForeground(Color.BLACK);
		textPane_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_6.setBackground(Color.LIGHT_GRAY);
		textPane_6.setBounds(245, 346, 32, 35);
		contentPane.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText(" 8");
		textPane_7.setForeground(Color.BLACK);
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_7.setBackground(Color.LIGHT_GRAY);
		textPane_7.setBounds(344, 346, 32, 35);
		contentPane.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText(" 9");
		textPane_8.setForeground(Color.BLACK);
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_8.setBackground(Color.LIGHT_GRAY);
		textPane_8.setBounds(453, 346, 32, 35);
		contentPane.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("10");
		textPane_9.setForeground(Color.BLACK);
		textPane_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPane_9.setBackground(Color.LIGHT_GRAY);
		textPane_9.setBounds(552, 346, 32, 35);
		contentPane.add(textPane_9);
		
		JButton btnPremios = new JButton("Premios");
		btnPremios.setBounds(25, 332, 89, 23);
		contentPane.add(btnPremios);
		
		ActionListener premios = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Premios();
			}
		};
		
		ActionListener inicio = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Start();
			}
		};
		
		btnPremios.addActionListener(premios);
		btnStart.addActionListener(inicio);
	}
	
	public void Premios() {
		if(!this._1lugar.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"O " + this._1lugar.getText() +
					" ganhou R$5000,00\n O " + this._2lugar.getText() + 
					" ganhou R$4000,00\n O " + this._3lugar.getText() +
					" ganhou R$3000,00");
		}else {
			JOptionPane.showMessageDialog(null, "Jogue antes de ver os vencedores!",
					"ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void Start() {
		this._1lugar.setText("");
		this._2lugar.setText("");
		this._3lugar.setText("");
		for(int i=0; i<10; i++) {
			CassinoControllerThread game = new CassinoControllerThread(dados, i, _1lugar,
					_2lugar, _3lugar);
			game.start();
		}
	}
}
