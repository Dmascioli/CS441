package gui;

import javax.swing.*;

public class GUI {
	static JFrame main = new JFrame("CS441");
	static GUImenu mainMenu = new GUImenu();
	
	public GUI()
	{
		
		main.setJMenuBar(mainMenu.getMainMenu());
		
		//main.add(new panel_gcd());
		
		
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(500, 300);
		main.setLocationRelativeTo(null);
		main.setVisible(true);
		
		
	}
	
	public static void setPanel(String panelName) {
		if(panelName.equals("isPrime")) {
			main.getContentPane().removeAll();
			main.add(new panel_isPrime());
			main.revalidate();
			main.repaint();
			System.out.println("isPrime added");
		} else if(panelName.equals("GCD")) {
			main.getContentPane().removeAll();
			main.add(new panel_gcd());
			main.revalidate();
			main.repaint();
			System.out.println("GCD added");
		}
		
		
	}
	public static void clearFrame() {
		main.dispose();
		main.getContentPane().removeAll();
		new GUI();
		System.out.println("cleared");
		
	}
	
}

