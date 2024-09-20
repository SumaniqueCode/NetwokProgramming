package np;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldUI extends JFrame implements ActionListener {
	private JPasswordField passwordField;
	private JButton loginButton;
	
	public JPasswordFieldUI() {
		setTitle("JPasswordField Example");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Panel to hold Component
		JPanel panel = new JPanel(new GridLayout(2,1));
		
		//Password Field
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setPreferredSize(new Dimension(200, 30));
		passwordField.addActionListener(this);
		
		//Login Button
		loginButton = new JButton("Login");
		loginButton.addActionListener(this);
		
		//Add components to panel
		panel.add(new JLabel("Enter Password: "));
		panel.add(passwordField);
		panel.add(loginButton);
		
		add(panel);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginButton || e.getSource() == passwordField) {
			//Retrieve password form JPasswordField
			char[] passwordChars = passwordField.getPassword();
			String password = new String(passwordChars);
			
			//Example Authentication Logic
			if(password.equals("hello")) {
				JOptionPane.showMessageDialog(this, "Login Successful");
			}else {
				JOptionPane.showMessageDialog(this, "Login failed try again");
			}
			passwordField.setText("");
		}
	}
	
	public static void main(String[] args) {
		//GUI
		SwingUtilities.invokeLater(()->new JPasswordFieldUI());
//		JPasswordFieldUI J  = new JPasswordFieldUI();
	}
}
