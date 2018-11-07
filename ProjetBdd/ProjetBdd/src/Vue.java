import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class Vue extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton btnAfficher;
	
	
	public Vue() {
		this.setTitle("Etat");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setResizable(false);  
		//Contenu du panel
		panel = new JPanel();
		btnAfficher = new JButton("Afficher les Etats");
		panel.add(btnAfficher);
	  
		btnAfficher.addActionListener(this);
		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		//barre de menu
		JMenuBar menu = new JMenuBar();
		
		//création bouton du menu consulter ajouter quitter
		JMenu menuEtat = new JMenu("Menu Etat");
			
			JMenuItem consultEtat = new JMenuItem("Consulter Etat");
			menuEtat.add(consultEtat);
			consultEtat.addActionListener(new MenuActionConsulter());
			
			JMenuItem ajtEtat = new JMenuItem("Ajouter Etat");
			menuEtat.add(ajtEtat);
			ajtEtat.addActionListener(new MenuActionAjouter());
			
			JMenuItem quittEtat = new JMenuItem("Quitter Etat");
			menuEtat.add(quittEtat);
			quittEtat.addActionListener(new MenuActionQuitter());
			
		menu.add(menuEtat);
		
		// Permet de définir le menu utilisé dans la JFrame
		this.setJMenuBar(menu);
	 }
	
	
	public void actionPerformed ( ActionEvent evenement ) {
			
	}
		
	class MenuActionQuitter implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}	
	}	
	
	class MenuActionAjouter implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
	
	class MenuActionConsulter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		
		}	
	}
	
}
