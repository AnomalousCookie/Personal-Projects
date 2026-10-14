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
    int[] slotPossibilities = {1, 1, 1, 2, 2, 3, 4, 5, 10};
    int cash = 1000;

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
            if(cash <= 0) {
                JOptionPane.showMessageDialog(null, "You do not have the available cash to spin");
            }
            else if (cash >= 200) {
                cash -= 200;
                cash = spin(rand, slotPossibilities, label4, label3, label2, button1, 1000, cash);
                cashLabel.setText("$" + cash);
            }
        });
    }

    //general methods
    //spin: the method will choose 3 random numbers then display it onto the users screen, it then checks for any matches and promptly tells the user, then it will calculate the cash the user gets (if at all)
    //parameters: Random localRand, int[] localSlotPossibilities, JLabel localLabel4, JLabel localLabel3, JLabel localLabel2, JButton localButton1, int localDelayMs, int localCash
    //returns: int
    public static int spin(Random localRand, int[] localSlotPossibilities, JLabel localLabel4, JLabel localLabel3, JLabel localLabel2, JButton localButton1, int localDelayMs, int localCash) {
        //Creates the 3 random values
        int localSlot1 = localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)];
        int localSlot2 = localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)];
        int localSlot3 = localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)];

        //Visually shows the user their results
        localLabel4.setText("" + localSlot1);
        localLabel3.setText("" + localSlot2);
        localLabel2.setText("" + localSlot3);

        //This now checks if the user hit any matches and calculates the cash if they did
        //These if statements now check for any pairs or jackpots (3 of a kind)
        if(localSlot1 == localSlot2 && localSlot1 == localSlot3) {
            int localMatch;
            localMatch = localSlot1;
            localCash = (localCash * (localMatch + 1)) + 1000;
            JOptionPane.showMessageDialog(null, "Jackpot: +$" + localCash);
        }
        else if(localSlot1 == localSlot2 || localSlot1 == localSlot3 || localSlot2 == localSlot3) {
            int localMatch;
            if(localSlot1 == localSlot2 || localSlot1 == localSlot3) {
                localMatch = localSlot1;
                localCash = (localCash * localMatch) + 200;
                JOptionPane.showMessageDialog(null, "Matching Pair: +$" + localCash);
            }
            else {
                localMatch = localSlot3;
                localCash = (localCash * localMatch) + 200;
                JOptionPane.showMessageDialog(null, "Matching Pair: +$" + localCash);
            }
        }

        return localCash;
    }
}