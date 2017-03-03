package gui;

import calculate.Compute;

import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class panel_isPrime extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public panel_isPrime() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{111, 83, 0, 114, 0};
		gridBagLayout.rowHeights = new int[]{51, 22, 25, 0, 31, 16, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEnterNumber = new JLabel("Enter number:");
		GridBagConstraints gbc_lblEnterNumber = new GridBagConstraints();
		gbc_lblEnterNumber.anchor = GridBagConstraints.WEST;
		gbc_lblEnterNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterNumber.gridx = 1;
		gbc_lblEnterNumber.gridy = 1;
		add(lblEnterNumber, gbc_lblEnterNumber);
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		add(lblNewLabel, gbc_lblNewLabel);

		
		
		
		JButton btnEnter = new JButton("Go");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a;
				try{
					 a = Integer.parseInt(textField.getText());
					 	if(a == 0 || a == 1)
						{
							lblNewLabel.setText(textField.getText()+" is neither prime nor composite");
							lblNewLabel.setForeground(Color.ORANGE);
						}
						else
						{
							boolean result = Compute.isPrime(a);
							if(result) {
								lblNewLabel.setText(textField.getText()+" is PRIME");
								lblNewLabel.setForeground(Color.BLUE);
							}
							else {
								lblNewLabel.setText(textField.getText()+" is NOT PRIME");
								lblNewLabel.setForeground(Color.MAGENTA);
							}
						}
				} catch(Exception exc){
					lblNewLabel.setText("Please enter a valid number");
					lblNewLabel.setForeground(Color.RED);
				}
				
				
				
			}
		});
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEnter.doClick();
			}
		});
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 2;
		gbc_btnEnter.gridy = 3;
		add(btnEnter, gbc_btnEnter);
	}

}

