import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAjouter extends JPanel {

	private JPanel panelAjouter;
	private JLabel lblMessage1;
	private JLabel lblMessage2;
	private JTextField jtfid;
	private JTextField jtflibelle;
	private JButton btnValider;
	private JButton btnAnnuler;
	
	public PanelAjouter() {
	
	lblMessage1 = new JLabel("Entrez votre id : ");
	jtfid = new JTextField("Valeur par défaut");
	
	btnValider = new JButton("Valider");
	btnAnnuler = new JButton();
	btnAnnuler.setText("Annuler");
	
	lblMessage2 = new JLabel("Entrez votre libelle : ");
	jtflibelle = new JTextField("Valeur par défaut");
	
	btnValider = new JButton("Valider");
	btnAnnuler = new JButton();
	btnAnnuler.setText("Annuler");
	
	
	
	}
}	
