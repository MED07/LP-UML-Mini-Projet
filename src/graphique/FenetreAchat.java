package graphique;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import application.ControleurAchatVente;

public class FenetreAchat extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 486686843874580464L;
	private JButton btAchat;
	private JTextField txtQuantite;
	private JComboBox<String> combo;

	public FenetreAchat(String[] strings) {

		setTitle("Achat");
		setBounds(500, 500, 200, 125);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		btAchat = new JButton("Achat");
		txtQuantite = new JTextField(5);
		txtQuantite.setText("0");
		
		combo = new JComboBox<String>();
		for (int i = 0; i < strings.length; i++) {
			combo.addItem(strings[i]);
			
		}
		
		combo.setPreferredSize(new Dimension(100, 20));
		contentPane.add(new JLabel("Produit"));
		contentPane.add(combo);
		contentPane.add(new JLabel("Quantité achetée"));
		contentPane.add(txtQuantite);
		contentPane.add(btAchat);

		btAchat.addActionListener(this);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAchat){
				ControleurAchatVente.achatProduit(this, (String)combo.getSelectedItem(), txtQuantite.getText());
			}
		}
	}