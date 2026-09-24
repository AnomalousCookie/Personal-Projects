package blueprints;

public class Gun extends Weapon {
    //Data members
    private int caliber;
    private int magSize;
    private String gunType;

    //Default Constructor
    public Gun() {
        this(0, "", 0.0, 0, 0, "");
    }

    //Parameterized Constructor
    public Gun(int damage, String rarity, double attackSpeed, int caliber, int magSize, String gunType) {
        super(damage, rarity, attackSpeed);
        this.caliber = caliber;
        this.magSize = magSize;
        this.gunType = gunType;
    }

    //Get Methods
    public double getCaliber() {
        return this.caliber;
    }

    public int getMagSize() {
        return this.magSize;
    }

    public String getGunType() {
        return this.gunType;
    }

    //Set Methods
    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public void setMagSize(int magSize) {
        this.magSize = magSize;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    @Override
    public String toString() {
        return String.format("Weapon -> Gun: [%s, Caliber: %d, Mag Size: %d, Gun Type: %s]",
                super.toString(), this.caliber, this.magSize, this.gunType);
    }
}