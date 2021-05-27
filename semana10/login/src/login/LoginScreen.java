package login;

import javax.swing.JFrame;

public class LoginScreen {
	
	public static void main(String[] a) {
		Login frame = new Login();
		
		frame.setTitle("Tela Login");
		frame.setVisible(true);
		frame.setBounds(10, 10, 370, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}