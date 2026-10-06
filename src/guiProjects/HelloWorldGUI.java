package guiProjects;
import javax.swing.*;
import java.awt.*;

public class HelloWorldGUI { //First testing of GUI within IntelliJ, supposedly 'BorderLayout' is standard within the industry
    private JPanel panel1;
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JTextField textField1;

    void main() {
        JFrame frame = new JFrame("Application");

        // Pass the root panel bound from .form file
        frame.setContentPane(new HelloWorldGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HelloWorldGUI() {
        clickMeButton.addActionListener(e -> {
            textField1.setText("Hello World");
        });
    }

    private void createUIComponents() {
    }

}