//This is the parent class of Bludgeon, Gun and Sword
package blueprints;

abstract class Weapon {
    //Data Members
    protected int damage;
    protected String rarity;
    protected double attackSpeed;

    //Default Constructor
    public Weapon() {
        this(0, "", 0.0);
    }

    //Parameterized Constructor
    public Weapon(int damage, String rarity, double attackSpeed) {
        this.damage = damage;
        this.rarity = rarity;
        this.attackSpeed = attackSpeed;
    }

    //Set Methods
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    //Get Methods
    public int getDamage() {
        return this.damage;
    }

    public String getRarity() {
        return this.rarity;
    }

    public double getAttackSpeed() {
        return this.attackSpeed;
    }

    @Override
    public String toString() {
        return String.format("Damage: %d, Rarity: %s, Attack Speed: %.2f", this.damage, this.rarity, this.attackSpeed);
    }
}