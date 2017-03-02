package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import gui.MainFrame;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame frame = new MainFrame("Fargeforandring.");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(400, 400);
				frame.setResizable(false);
				frame.setVisible(true);
			}
		});
	}
}
