package ac.id.ukdw;

public class Creep extends Character implements AttackingHero {
    public Creep(String name, int health, int damage) {
        super(name, health, damage);
    }
    @Override
    public void attack(Hero enemy) {
//        isi kode anda disini
        enemy.setHealth(enemy.getHealth()-this.damage);
    }
}
