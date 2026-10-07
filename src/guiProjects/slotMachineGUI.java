package guiProjects;

import javax.swing.*;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class slotMachineGUI {
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JLabel label3;
    private JLabel label4;
    Random rand = new Random();
    int[] slotPossibilities = {0, 1, 2, 3, 4, 10};

    void main() {
        //Variables
        JFrame frame = new JFrame("Application");

        frame.setContentPane(new slotMachineGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //button functions
    public slotMachineGUI() {
        button1.addActionListener(e -> {
            spin(rand, slotPossibilities, label4, label3, label2, button1, 1000);
        });

    }

    //general methods
    public static void spin(Random localRand, int[] localSlotPossibilities, JLabel localLabel4, JLabel localLabel3, JLabel localLabel2, JButton localButton1, int localDelayMs) {
        localButton1.setText("spinning...");
        Timer timer = new Timer(localDelayMs, e -> {
            localButton1.setText("SPIN");
            localLabel4.setText("" + localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)]);
            localLabel3.setText("" + localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)]);
            localLabel2.setText("" + localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)]);
            //This creates new local variables just for better understanding
            int localLabel4Value = Integer.parseInt(localLabel4.getText().trim());
            int localLabel3Value = Integer.parseInt(localLabel3.getText().trim());
            int localLabel2Value = Integer.parseInt(localLabel2.getText().trim());
            //Now this checks if the user hit any matching numbers
            if(localLabel4Value == localLabel3Value || localLabel4Value == localLabel2Value || localLabel3Value == localLabel2Value) {
                int localMatch;
                if(localLabel4Value == localLabel3Value || localLabel4Value == localLabel2Value) {
                    localMatch = localLabel4Value;
                    JOptionPane.showMessageDialog(null, "Pair: " + localMatch);
                }
                else {
                    localMatch = localLabel2Value;
                    JOptionPane.showMessageDialog(null, "Pair: " + localMatch);
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}