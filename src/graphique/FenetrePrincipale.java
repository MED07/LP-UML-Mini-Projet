package graphique;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import application.ControleurPrincipal;
import application.ControleurStock;

public class FenetrePrincipale extends JFrame implements ActionListener,
	WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1731314792688972956L;
	private JButton btAfficher;
	private JButton btNouveauProduit;
	private JButton btSupprimerProduit;
//	private JButton btNouvelleCategorie;
//	private JButton btSupprimerCategorie;
	private JButton btAchat;
	private JButton btVente;
	private JButton btQuitter;

	

	public FenetrePrincipale() {
		
		setTitle("exercice Produits");
		setBounds(500, 500, 320, 250);
		
		JPanel panAffichage = new JPanel();
		JPanel panNouveauSupprimerProduit = new JPanel();
//		JPanel panNouveauSupprimerCategorie = new JPanel();
		JPanel panAchatVente = new JPanel();
		JPanel panQuitter = new JPanel();
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		btAfficher = new JButton("Quantités en stock");
		btNouveauProduit = new JButton("Nouveau Produit");
		btSupprimerProduit = new JButton("Supprimer Produit");
//		btNouvelleCategorie = new JButton("Nouvelle Categorie");
//		btSupprimerCategorie = new JButton("Supprimer Categorie");
		btAchat = new JButton("Achat Produits");
		btVente = new JButton("Vente Produits");
		btQuitter = new JButton("Quitter");
		panAffichage.add(btAfficher);
		panNouveauSupprimerProduit.add(btNouveauProduit); 
		panNouveauSupprimerProduit.add(btSupprimerProduit);
//		panNouveauSupprimerCategorie.add(btNouvelleCategorie); 
//		panNouveauSupprimerCategorie.add(btSupprimerCategorie);
		panAchatVente.add(btAchat); 
		panAchatVente.add(btVente);  
		panQuitter.add(btQuitter);

		contentPane.add(panAffichage);
//		contentPane.add(panNouveauSupprimerCategorie);
		contentPane.add(panNouveauSupprimerProduit);
		contentPane.add(panAchatVente);
		contentPane.add(panQuitter);

		btAfficher.addActionListener(this);
		btNouveauProduit.addActionListener(this);
		btSupprimerProduit.addActionListener(this);
//		btNouvelleCategorie.addActionListener(this);
//		btSupprimerCategorie.addActionListener(this);
		btAchat.addActionListener(this);
		btVente.addActionListener(this);
		btQuitter.addActionListener(this);
		
		addWindowListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btAchat){
			new FenetreAchat(ControleurPrincipal.getNomsProduits());
		}
		if (e.getSource() == btVente)
			new FenetreVente(ControleurPrincipal.getNomsProduits());
		if (e.getSource() == btAfficher)
			new FenetreAffichage(ControleurStock.afficherStock());
		if (e.getSource() == btNouveauProduit)
//			new FenetreNouveauProduit(tabCategories);
			new FenetreNouveauProduit();
		if (e.getSource() == btSupprimerProduit)
			new FenetreSuppressionProduit(ControleurPrincipal.getNomsProduits());
//		if (e.getSource() == btNouvelleCategorie)
//			new FenetreNouvelleCategorie();
//		if (e.getSource() == btSupprimerCategorie)
//			new FenetreSuppressionCategorie(tabCategories);
		if (e.getSource() == btQuitter){
			new FenetreAccueil();
			this.dispose();
		}	
	}

	public void windowClosing(WindowEvent arg0) {
		new FenetreAccueil();
		this.dispose();
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

}
