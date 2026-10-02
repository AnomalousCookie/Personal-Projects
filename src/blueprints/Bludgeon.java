//Child class of Weapon
package blueprints;

public class Bludgeon extends Weapon{
    //Data Members
    private int fractureLevel;
    private String maceType;

    //Default Constructor
    public Bludgeon() {
        this(0, "", 0.0, 0, "");
    }

    //Parameterized Constructor
    public Bludgeon(int damage, String rarity, double attackSpeed, int fractureLevel, String maceType) {
        super(damage, rarity, attackSpeed);
        this.fractureLevel = fractureLevel;
        this.maceType = maceType;
    }

    //Get Methods
    public int getFractureLevel() {
        return this.fractureLevel;
    }

    public String getMaceType() {
        return this.maceType;
    }

    //Set Methods
    public void setFractureLevel(int fractureLevel) {
        this.fractureLevel = fractureLevel;
    }

    public void setMaceType(String maceType) {
        this.maceType = maceType;
    }

    @Override
    public String toString() {
        return String.format("Weapon -> Bludgeon: [%s, Fracture Level: %d, Mace Type: %s]", super.toString(), this.fractureLevel, this.maceType);
    }
}