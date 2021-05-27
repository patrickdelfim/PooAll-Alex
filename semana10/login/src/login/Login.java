package login;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class Login extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel headerLabel = new JLabel("Entre com suas seu login e senha");
	JLabel userLabel = new JLabel("Username");
	JLabel passwordLabel = new JLabel("Password");
	JLabel ErrorLabel = new JLabel("Login ou senha invalidos!!");
	JTextField usernameField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton reset = new JButton("Reset");
	JButton login = new JButton("login");
	JCheckBox showPassword = new JCheckBox("show password");
	
	
	public Login() {
		
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
		
		
	}
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		  headerLabel.setBounds(70,10,500,30);
		  userLabel.setBounds(50,80,100,30);
	      passwordLabel.setBounds(50,120,100,30);
	      usernameField.setBounds(150,80,150,30);
	      passwordField.setBounds(150,120,150,30);
	      showPassword.setBounds(150,150,150,30);
	      login.setBounds(50,200,100,30);
	      reset.setBounds(200,200,100,30);
	      ErrorLabel.setBounds(50,250,500,30);
	}
	
	public void addComponentsToContainer() {
		container.add(headerLabel);
		  container.add(userLabel);
	       container.add(passwordLabel);
	       container.add(usernameField);
	       container.add(passwordField);
	       container.add(showPassword);
	       container.add(login);
	       container.add(reset);
	       
	       }
	
	public void addActionEvent() {
		login.addActionListener(this);
		reset.addActionListener(this);
		showPassword.addActionListener(this);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			String userText = usernameField.getText();
			String passwordText = new String(passwordField.getPassword());
			
			if(userText.equalsIgnoreCase("patrick") && passwordText.equalsIgnoreCase("12345")) {
				
				Welcome successLogin = new Welcome();
				
				this.setContentPane(successLogin);
				this.revalidate();
				
			
			} else {
				ErrorLabel.setForeground(Color.red);
				container.add(ErrorLabel);
				container.repaint();
				System.out.println("senha errada");
				
			}
		}
			 if (e.getSource() == reset) {
				 	usernameField.setText("");
		            passwordField.setText("");
		        }
			
			 if (e.getSource() == showPassword) {
		            if (showPassword.isSelected()) {
		                passwordField.setEchoChar((char) 0);
		            } else {
		                passwordField.setEchoChar('*');
		            } 
		         }
			
		
    }
}

