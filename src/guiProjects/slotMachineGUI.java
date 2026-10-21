package guiProjects;
import javax.swing.*;
import java.util.Random;
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
    private JButton button2;
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
                cash = spin(rand, slotPossibilities, label4, label3, label2, cash, false);
                cashLabel.setText("$" + cash);
            }
        });

        button2.addActionListener(e -> {
                if(cash <= 0) {
                    JOptionPane.showMessageDialog(null,"You have no money to go all in with.");
                }
                else {
                    cash = spin(rand, slotPossibilities, label4, label3, label2, cash, true);
                    cashLabel.setText("$" + cash);
                }
        });
    }

    //general methods
    //spin: the method will choose 3 random numbers then display it onto the users screen, it then checks for any matches and promptly tells the user, then it will calculate the cash the user gets (if at all)
    // returns: int
    public static int spin(Random localRand, int[] localSlotPossibilities, JLabel localLabel4, JLabel localLabel3, JLabel localLabel2, int localCash, boolean localAllIn) {
        //Creates the 3 random values
        int localSlot1 = localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)];
        int localSlot2 = localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)];
        int localSlot3 = localSlotPossibilities[localRand.nextInt(localSlotPossibilities.length)];

        //Visually shows the user their results
        localLabel4.setText("" + localSlot1);
        localLabel3.setText("" + localSlot2);
        localLabel2.setText("" + localSlot3);

        //Checks for jackpots (3 of a kind)
        if(localSlot1 == localSlot2 && localSlot1 == localSlot3) {
            //check if the user is all in, if they are then times the total cash they have rather than just the normal 200
            if(localAllIn) {
                localCash = (localCash * (localSlot1 + 1)) + 1000;
                JOptionPane.showMessageDialog(null, "Jackpot: +$" + localCash);
            }
            //otherwise, proceed as normal
            else {
                localCash = (200 * (localSlot1 + 1)) + 1000;
                JOptionPane.showMessageDialog(null, "Jackpot: +$" + localCash);
            }
        }
        //Checks for regular pairs
        else if(localSlot1 == localSlot2 || localSlot1 == localSlot3 || localSlot2 == localSlot3) {
            //check if the user is all in, if they are then times the total cash they have rather than just the normal 200
            if(localAllIn) {
                if(localSlot1 == localSlot2 || localSlot1 == localSlot3) {
                    localCash = (localCash * localSlot1) + 200;
                    JOptionPane.showMessageDialog(null, "Matching Pair: +$" + localCash);
                }
                else {
                    localCash = (localCash * localSlot3) + 200;
                    JOptionPane.showMessageDialog(null, "Matching Pair: +$" + localCash);
                }
            }
            //otherwise, proceed as normal
            else {
                if(localSlot1 == localSlot2 || localSlot1 == localSlot3) {
                    localCash = (200 * localSlot1) + 200;
                    JOptionPane.showMessageDialog(null, "Matching Pair: +$" + localCash);
                }
                else {
                    localCash = (200 * localSlot3) + 200;
                    JOptionPane.showMessageDialog(null, "Matching Pair: +$" + localCash);
                }
            }
        }
        else if(localAllIn){
            JOptionPane.showMessageDialog(null, "Your all in was fruitless");
            localCash = 0;
        }

        return localCash;
    }
}