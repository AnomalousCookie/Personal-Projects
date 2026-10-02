package guiProjects;
import java.util.Random;
import javax.swing.*;

public class RubikCubeAlgorithmRandomizerGUI { //This class is the better version of my old Rubik's cube randomizer
    //Variables
    private JPanel mainPanel;
    private JButton buttonOLL;
    private JLabel label1;
    private JButton buttonPLL;
    private JTextField textField1;
    //Rubik's Cube Algorithms
    String[] algPLL = {"F R U' R' U' R U R' F' R U R' U' R' F R F'", "R U R' U' R' F R2 U' R' U' R U R' F'", "M2 U M2 U2 M2 U M2", "R U' R U R U R U' R' U' R2", "R2 U R U R' U' R' U' R' U R'", "M' U M2 U M2 U M' U2 M2"};
    String[] algOLL = {"R U2 R' U' R U' R'", "R U R' U R U2 R'", "F R U R' U' F'", "f R U R' U' f'",  "F R' F' r U R U' r'", "r U R' U' r' F R F'", "R U2 R2 U' R2 U' R2 U2 R", "R2 D R' U2 R D' R' U2 R'", "R U R' U R U' R' U R U2 R'", "F R U R' U' F' f R U R' U' f'"};
    String[] algPLLNames = {"Diagonal", "Headlights", "PLL - H", "PLL - Ua", "PLL - Ub", "PLL - Z"};
    String[] algOLLNames = {"AntiSune", "Sune", "I Shape", "L Shape", "L", "T", "Pi", "U", "H", "Dot Shape"};
    int num;
    Random rand = new Random();

        public static void main() {
            JFrame frame = new JFrame("Application");

            // Pass the root panel bound from .form file
            frame.setContentPane(new RubikCubeAlgorithmRandomizerGUI().mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

    public RubikCubeAlgorithmRandomizerGUI() {
        //Button displaying OLL Algorithms
        buttonOLL.addActionListener(e -> {
            num = rand.nextInt(algOLL.length);
            textField1.setText(algOLLNames[num] + ": " + algOLL[num]);
        });

        //Button displaying PPL Algorithms
        buttonPLL.addActionListener(e -> {
            num = rand.nextInt(algPLL.length);
            textField1.setText(algPLLNames[num] + ": " + algPLL[num]);
        });
    }
}