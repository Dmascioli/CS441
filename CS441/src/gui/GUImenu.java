package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUImenu {
	private JMenuBar mainMenu = new JMenuBar();
	
	//file menu
	private JMenu file = new JMenu("File");
	private JMenuItem menu_refreshPage = new JMenuItem("Restart Program");
	
	
	//compute menu
	private JMenu compute = new JMenu("Compute");
	private JMenuItem menu_isPrime = new JMenuItem("*Check Prime");
	private JMenuItem menu_gcd = new JMenuItem("*GCD");
	private JMenuItem menu_lcm = new JMenuItem("LCM");
	private JMenuItem menu_primeFact = new JMenuItem("Prime Factorization");
	private JMenuItem menu_baseConvert = new JMenuItem("Base Conversion");
	private JMenuItem menu_euclid = new JMenuItem("Euclid's Algorithm");
	private JMenuItem menu_congru = new JMenuItem("Solve Congruencies");
	
	public GUImenu()
	{
		//file
		menu_refreshPage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				GUI.clearFrame();
			}
		});
		file.add(menu_refreshPage);
		
		//compute
		menu_isPrime.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				GUI.setPanel("isPrime");
			}
		});
		menu_gcd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				GUI.setPanel("GCD");
			}
		});
		
		compute.add(menu_baseConvert);
		compute.add(menu_congru);
		compute.add(menu_euclid);
		compute.add(menu_isPrime);
		compute.add(menu_gcd);
		compute.add(menu_lcm);
		compute.add(menu_primeFact);
		
		//main
		mainMenu.add(file);
		mainMenu.add(compute);
	}
	
	public JMenuBar getMainMenu() {
		return mainMenu;
	}
	public void setMainMenu(JMenuBar mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	
}

