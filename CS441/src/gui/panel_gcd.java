package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import calculate.Compute;

import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class panel_gcd extends JPanel {
	private JTextField fieldA;
	private JTextField fieldB;

	/**
	 * Create the panel.
	 */
	public panel_gcd() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{39, 0, 100, 52, 100, 9, 0};
		gridBagLayout.rowHeights = new int[]{0, 50, 0, 43, 35, 30, 29, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel gcdOf = new JLabel("");
		GridBagConstraints gbc_gcdOf = new GridBagConstraints();
		gbc_gcdOf.gridwidth = 3;
		gbc_gcdOf.insets = new Insets(0, 0, 5, 5);
		gbc_gcdOf.gridx = 2;
		gbc_gcdOf.gridy = 6;
		add(gcdOf, gbc_gcdOf);
		
		JLabel lblFindGcdOf = new JLabel("Find gcd of:");
		GridBagConstraints gbc_lblFindGcdOf = new GridBagConstraints();
		gbc_lblFindGcdOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblFindGcdOf.anchor = GridBagConstraints.EAST;
		gbc_lblFindGcdOf.gridx = 1;
		gbc_lblFindGcdOf.gridy = 2;
		add(lblFindGcdOf, gbc_lblFindGcdOf);
		
		fieldA = new JTextField();
		GridBagConstraints gbc_fieldA = new GridBagConstraints();
		gbc_fieldA.insets = new Insets(0, 0, 5, 5);
		gbc_fieldA.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldA.gridx = 2;
		gbc_fieldA.gridy = 2;
		add(fieldA, gbc_fieldA);
		fieldA.setColumns(10);
		
		JLabel lblAnd = new JLabel("and");
		GridBagConstraints gbc_lblAnd = new GridBagConstraints();
		gbc_lblAnd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnd.gridx = 3;
		gbc_lblAnd.gridy = 2;
		add(lblAnd, gbc_lblAnd);
		
		fieldB = new JTextField();
		GridBagConstraints gbc_fieldB = new GridBagConstraints();
		gbc_fieldB.insets = new Insets(0, 0, 5, 5);
		gbc_fieldB.fill = GridBagConstraints.BOTH;
		gbc_fieldB.gridx = 4;
		gbc_fieldB.gridy = 2;
		add(fieldB, gbc_fieldB);
		fieldB.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(fieldA.getText());
				int b = Integer.parseInt(fieldB.getText());
				
				gcdOf.setText("GCD of "+a+" and "+b+" is "+Compute.gcd(a, b));
			}
		});
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 3;
		gbc_btnEnter.gridy = 4;
		add(btnEnter, gbc_btnEnter);
		
		
		
		
		
		
	}

}
