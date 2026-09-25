package projects;

import blueprints.Sword;
import blueprints.Gun;
import blueprints.Bludgeon;
import java.util.Scanner;

public class WeaponTestClass {

    void main() {
        //Variables
        Scanner sc = new Scanner(System.in);
        Sword newSword = new Sword();
        Gun newGun = new Gun();
        Bludgeon newBludgeon = new Bludgeon();
        String weaponChoice;
        boolean endLoop = false;

        //Process
        System.out.println("Welcome to Weapon Stat Creator");
        do {
            System.out.print("please enter the type weapon you wish to create: \n| Sword\n| Gun\n| Bludgeon\n| Exit (quits program)\nEnter Selection: ");
            weaponChoice = sc.nextLine();
            switch(weaponChoice) {
                case "Sword":
                    swordStats(newSword, sc);
                    System.out.println("Here are the stats of your sword: " + newSword);
                    break;
                case "Gun":
                    gunStats(newGun, sc);
                    System.out.println("Here are the stats of your gun: " + newGun);
                    break;
                case "Bludgeon":
                    bludgeonStats(newBludgeon, sc);
                    System.out.println("Here are the stats of your mace: " + newBludgeon);
                    break;
                case "Exit":
                    System.out.println("Thank you for using the Weapon Stat Creator");
                    endLoop = true;
                    break;
                default:
                    System.out.println("That is not one of the options.");
                    break;
            }
        } while (!endLoop);
    }//Methods Below

    //Gives the user the sword stat options
    public static void swordStats(Sword localNewSword, Scanner localSC) {
        System.out.print("You have chosen to create a sword, please enter the stats: \nS | Rarity: ");
        localNewSword.setRarity(localSC.nextLine());
        System.out.print("S | Material: ");
        localNewSword.setMaterial(localSC.nextLine());
        System.out.print("I | Damage: ");
        localNewSword.setDamage(Integer.parseInt(localSC.nextLine()));
        System.out.print("D | Attack Speed: ");
        localNewSword.setAttackSpeed(Double.parseDouble(localSC.nextLine()));
        System.out.print("I | Sword Length: ");
        localNewSword.setSwordLength(Integer.parseInt(localSC.nextLine()));
    }

    //Gives the user the gun stat options
    public static void gunStats(Gun localNewGun, Scanner localSC) {
        System.out.print("You have chosen to create a gun, please enter the stats: \nS | Rarity: ");
        localNewGun.setRarity(localSC.nextLine());
        System.out.print("S | Gun Type: ");
        localNewGun.setGunType(localSC.nextLine());
        System.out.print("I | Damage: ");
        localNewGun.setDamage(Integer.parseInt(localSC.nextLine()));
        System.out.print("I | Mag Size: ");
        localNewGun.setMagSize(Integer.parseInt(localSC.nextLine()));
        System.out.print("D | Attack Speed: ");
        localNewGun.setAttackSpeed(Double.parseDouble(localSC.nextLine()));
        System.out.print("D | Caliber: ");
        localNewGun.setCaliber(Integer.parseInt(localSC.nextLine()));
    }

    //Gives the user the bludgeon stat options
    public static void bludgeonStats(Bludgeon localNewBludgeon, Scanner localSC) {
        System.out.print("You have chosen to create a mace, please enter the stats: \nS | Rarity: ");
        localNewBludgeon.setRarity(localSC.nextLine());
        System.out.print("S | Mace Type: ");
        localNewBludgeon.setMaceType(localSC.nextLine());
        System.out.print("I | Damage: ");
        localNewBludgeon.setDamage(Integer.parseInt(localSC.nextLine()));
        System.out.print("I | Fracture Level: ");
        localNewBludgeon.setFractureLevel(Integer.parseInt(localSC.nextLine()));
        System.out.print("D | Attack Speed: ");
        localNewBludgeon.setAttackSpeed(Double.parseDouble(localSC.nextLine()));
    }
}