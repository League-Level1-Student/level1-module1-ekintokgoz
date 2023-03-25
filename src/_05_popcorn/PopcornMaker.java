package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what flavor popcorn?");
		String minute = JOptionPane.showInputDialog("how long should we cook it for?");
		int minutes = Integer.parseInt(minute);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		microwave.startMicrowave();
		
		
	}
}
