package guiProjects;

import javax.swing.*;

public class SlotMachineGUI {
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Application");

        frame.setContentPane(new SlotMachineGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
