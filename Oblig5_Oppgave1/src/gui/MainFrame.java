package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	public MainFrame(String title) {
		super(title);
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton knapp = new JButton("Blue!");

		knapp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(container.getBackground().equals( Color.GREEN) ) {
					knapp.setText("Green!");
					container.setBackground(Color.BLUE);
				} else {
					knapp.setText("Blue!");
					container.setBackground(Color.GREEN);
				}
			}
		});
		panel.add(knapp, BorderLayout.NORTH);
		container.add(panel, BorderLayout.NORTH);
		container.setBackground(Color.GREEN);
	}
}
