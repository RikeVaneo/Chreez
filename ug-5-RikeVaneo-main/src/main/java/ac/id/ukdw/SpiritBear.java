package ac.id.ukdw;

public class SpiritBear extends SummonCharacter {

    public SpiritBear(LoneDruid a) {
        super("Spirit Bear", 1000, 130, a);
    }
    @Override
    public void attack(Creep enemy) {
        enemy.setHealth(enemy.getHealth() - this.damage);;
    }
}
