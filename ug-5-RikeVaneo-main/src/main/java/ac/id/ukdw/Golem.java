package ac.id.ukdw;

public class Golem extends SummonCharacter implements Summoner {
    private int kill = 0;
    public Golem(Summoner e){
        super("Golem", 1000, 120, e);
    }
    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getKill() {
        return kill;
    }

    @Override
    public void attack(Creep enemy) {
//        isi kode anda disini
        enemy.setHealth(enemy.getHealth()-this.damage);
        if (enemy.isDie()){
            this.kill ++;
        }
    }

    @Override
    public Golem summon() {
//     isi kode anda disini
        if (kill >0){
            kill--;
            return new Golem(this);
        }
        return null;
    }
}
