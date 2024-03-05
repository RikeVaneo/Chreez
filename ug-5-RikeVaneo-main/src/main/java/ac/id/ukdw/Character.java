package ac.id.ukdw;

public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;
    public Character(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isDie(){

//        isi kode anda disini
        if (this.health <= 0) return true;
        return false;
    }

    public void showCharacterInfo() {
//        isi kode anda disini
        System.out.println("Character: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage);
    }
    public void attacked(int damage) {
//        isi kode anda disini
        this.health -= damage;
    }
}
