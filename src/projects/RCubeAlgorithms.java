package projects;
import java.util.Scanner;
import java.util.Random;

class RCubeAlgorithms {

    void main() {
        //Variables
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int num;
        int userSelection;
        String[] algPLL = {"F R U' R' U' R U R' F' R U R' U' R' F R F'", "R U R' U' R' F R2 U' R' U' R U R' F'", "M2 U M2 U2 M2 U M2", "R U' R U R U R U' R' U' R2", "R2 U R U R' U' R' U' R' U R'", "M' U M2 U M2 U M' U2 M2"};
        String[] algOLL = {"R U2 R' U' R U' R'", "R U R' U R U2 R'", "F R U R' U' F'", "f R U R' U' f'",  "F R' F' r U R U' r'", "r U R' U' r' F R F'", "R U2 R2 U' R2 U' R2 U2 R", "R2 D R' U2 R D' R' U2 R'", "R U R' U R U' R' U R U2 R'", "F R U R' U' F' f R U R' U' f'"};
        String[] algPLLNames = {"Diagonal", "Headlights", "PLL - H", "PLL - Ua", "PLL - Ub", "PLL - Z"};
        String[] algOLLNames = {"AntiSune", "Sune", "I Shape", "L Shape", "L", "T", "Pi", "U", "H", "Dot Shape"};
        double timeInSeconds;
        long startTime;
        long endTime;
        //Process
        do {
            //Prompt
            System.out.println("Welcome to the random algorithm generator\n1) Generate a OLL\n2) Generate a PLL\n3) Exit");
            userSelection = Integer.parseInt(sc.nextLine());

            //Check
            if(userSelection == 1) {
                num = random.nextInt(algOLL.length);
                System.out.println(algOLLNames[num] + ": " + algOLL[num]);
                System.out.println("Press enter to begin");
                sc.nextLine();
                System.out.println("Timer Start, press enter when finished");
                startTime = System.currentTimeMillis();
                sc.nextLine();
                endTime = System.currentTimeMillis();
                timeInSeconds = (endTime - startTime) / 1000.0;
                System.out.println("Finished " + algOLLNames[num] + " in " + timeInSeconds + " Seconds");
            }
            else if(userSelection == 2) {
                num = random.nextInt(algPLL.length);
                System.out.println(algPLLNames[num] + ": " + algPLL[num]);
                System.out.println("Press enter to begin");
                sc.nextLine();
                System.out.println("Timer Start, press enter when finished");
                startTime = System.currentTimeMillis();
                sc.nextLine();
                endTime = System.currentTimeMillis();
                timeInSeconds = (endTime - startTime) / 1000.0;
                System.out.println("Finished " + algPLLNames[num] + " in " + timeInSeconds + " Seconds");
            }
            else
                exit = true;
        } while(!exit);
        //Exit prompt
        System.out.println("Thank you for using the algorithm generator");
    }
}