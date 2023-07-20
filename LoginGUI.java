import javax.swing.*;
import java.awt.event.*;

public class LoginGUI implements ActionListener{

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public LoginGUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("Login");

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField();
        userText.setBounds(80, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(80, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(5, 80, 80, 25);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception{
        new LoginGUI();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String user = userText.getText();
        String password = passwordText.getText();
        if(user.equals("username") && password.equals("password"))
        {
            success.setText("Login Successful!");
        }
    }
}
