//Child class of Weapon
package blueprints;

public class Sword extends Weapon{
    //Data members
    private String material;
    private int swordLength;

    //Default Constructor
    public Sword() {
        this(0, "", 0.0, "", 0);
    }

    //Parameterized Constructor
    public Sword(int damage, String rarity, double attackSpeed, String material, int swordLength) {
        super(damage, rarity, attackSpeed);
        this.material = material;
        this.swordLength = swordLength;
    }

    //Get Methods
    public String getMaterial() {
        return this.material;
    }

    public int getSwordLength() {
        return this.swordLength;
    }

    //Set Methods
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSwordLength(int swordLength) {
        this.swordLength = swordLength;
    }

    @Override
    public String toString() {
        return String.format("Weapon -> Sword: [%s, Material: %s, Sword Length: %d]",
                super.toString(), this.material, this.swordLength);
    }
}