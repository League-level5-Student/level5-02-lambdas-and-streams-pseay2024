package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener(e ->{
			int a = Integer.parseInt(JOptionPane.showInputDialog("give a number"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("give a number"));
			JOptionPane.showMessageDialog(null, a + " + " + b + " = " + (a + b));
		});
		
		randNumber.addActionListener(e ->{
			JOptionPane.showMessageDialog(null, "rand: " + new Random().nextInt(1000));
		});
		
		tellAJoke.addActionListener(e ->{
			JOptionPane.showMessageDialog(null, "knock, knock");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
