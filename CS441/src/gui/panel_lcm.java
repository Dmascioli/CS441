package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import calculate.Compute;

import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class panel_lcm extends JPanel {
	private JTextField fieldB;
	private JTextField fieldA;

	/**
	 * Create the panel.
	 */
	public panel_lcm() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 74, 48, 81, 63, 98, 0};
		gridBagLayout.rowHeights = new int[]{1, 86, 22, 53, 25, 42, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lcmOf = new JLabel("");
		GridBagConstraints gbc_lcmOf = new GridBagConstraints();
		gbc_lcmOf.insets = new Insets(0, 0, 5, 5);
		gbc_lcmOf.gridx = 4;
		gbc_lcmOf.gridy = 5;
		add(lcmOf, gbc_lcmOf);
		
		JLabel lcmLabel = new JLabel("LCM of: ");
		GridBagConstraints gbc_lcmLabel = new GridBagConstraints();
		gbc_lcmLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lcmLabel.gridx = 2;
		gbc_lcmLabel.gridy = 2;
		add(lcmLabel, gbc_lcmLabel);
		
		fieldA = new JTextField();
		GridBagConstraints gbc_fieldA = new GridBagConstraints();
		gbc_fieldA.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldA.insets = new Insets(0, 0, 5, 5);
		gbc_fieldA.gridx = 3;
		gbc_fieldA.gridy = 2;
		add(fieldA, gbc_fieldA);
		fieldA.setColumns(10);
		
		JLabel andLbl = new JLabel("and");
		GridBagConstraints gbc_andLbl = new GridBagConstraints();
		gbc_andLbl.insets = new Insets(0, 0, 5, 5);
		gbc_andLbl.gridx = 4;
		gbc_andLbl.gridy = 2;
		add(andLbl, gbc_andLbl);
		
		fieldB = new JTextField();
		GridBagConstraints gbc_fieldB = new GridBagConstraints();
		gbc_fieldB.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldB.insets = new Insets(0, 0, 5, 0);
		gbc_fieldB.gridx = 5;
		gbc_fieldB.gridy = 2;
		add(fieldB, gbc_fieldB);
		fieldB.setColumns(10);
		
		JButton enterBtn = new JButton("Enter");
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("lcm clicked");
				int a = 0;
				int b = 0;
				try {
					a = Integer.parseInt(fieldA.getText());
					b = Integer.parseInt(fieldB.getText());
					
					lcmOf.setText("LCM of "+ a + " and "+ b+ " is "+Compute.lcm(a, b));
					lcmOf.setForeground(Color.BLUE);
					System.out.println("lcm computed");
					
				} catch (Exception exc) {
					lcmOf.setText("Please enter valid numbers");
					lcmOf.setForeground(Color.RED);
				}
			}
		});
		
		GridBagConstraints gbc_enterBtn = new GridBagConstraints();
		gbc_enterBtn.insets = new Insets(0, 0, 0, 5);
		gbc_enterBtn.gridx = 4;
		gbc_enterBtn.gridy = 4;
		add(enterBtn, gbc_enterBtn);

	}

}
