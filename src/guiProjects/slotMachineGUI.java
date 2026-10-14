package guiProjects;
import javax.swing.*;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class slotMachineGUI {
    //Variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JLabel label3;
    private JLabel label4;
    private JLabel cashLabel;
    private JLabel label5;
    Random rand = new Random();
    int[] slotPossibilities = {0, 1, 2, 3, 4, 10};

    void main() {
        JFrame frame = new JFrame("Application");

        frame.setContentPane(new slotMachineGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //button function
    public slotMachineGUI() {
        button1.addActionListener(e -> {
            spin(rand, slotPossibilities, label4, label3, label2, button1, 1000);
        });

    }

    //general methods
    //spin: when called, the method will choose 3 random numbers then display it onto the users screen, it then checks for any matches and promptly tells the user
    //parameters: Random localRand, int[] localSlotPossibilities, JLabel localLabel4, JLabel localLabel3, JLabel localLabel2, JButton localButton1, int localDelayMs
    //returns: void
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
            //These if statements now check for any pairs or jackpots (3 of a kind)
            if(localLabel4Value == localLabel3Value && localLabel4Value == localLabel2Value) {
                int localMatch;
                localMatch = localLabel4Value;
                JOptionPane.showMessageDialog(null, "Jackpot");
            }
            else if(localLabel4Value == localLabel3Value || localLabel4Value == localLabel2Value || localLabel3Value == localLabel2Value) {
                int localMatch;
                if(localLabel4Value == localLabel3Value || localLabel4Value == localLabel2Value) {
                    localMatch = localLabel4Value;
                    JOptionPane.showMessageDialog(null, "Matching Pair");
                }
                else {
                    localMatch = localLabel2Value;
                    JOptionPane.showMessageDialog(null, "Matching Pair");
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}