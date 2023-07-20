import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickerGUI implements ActionListener {

    private static int clicks = 0;
    private static JLabel label = new JLabel("    Number of clicks:  0   ");
    private static JFrame frame = new JFrame();

    public ClickerGUI() {

        //button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        //panel with button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        //set up frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicker GUI");
        frame.pack();
        panel.setBackground(Color.black);
        label.setForeground(Color.white);
        button.setBorderPainted(false);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        frame.setVisible(true);
    }

    //process button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }

    //create Frame
    public static void main(String[] args) {
        new ClickerGUI();
    }
}
