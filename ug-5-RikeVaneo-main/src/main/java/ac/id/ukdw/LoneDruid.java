package ac.id.ukdw;

public class LoneDruid extends Hero implements Upgradeable, Summoner {
    private int killCreep = 0;
    private int level = 0;
    public LoneDruid() {
        super("Lone Druid", 1800, 140);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setKillCreep(int killCreep) {
        this.killCreep = killCreep;
    }

    public int getKillCreep() {
        return killCreep;
    }
    @Override
    public void attack(Creep enemy) {
//        isi kode anda disini
        enemy.setHealth(enemy.getHealth()-this.damage);
        if (enemy.isDie()){
            this.killCreep ++;
        }
    }
    @Override
    public SpiritBear summon() {
//        isi kode anda disini
        SpiritBear summon = new SpiritBear(this);
        return summon;
    }



    @Override
    public void upgrade() {
//        isi kode anda disini
        while (killCreep >= 3){
            this.level ++;
            killCreep -=3;
            this.name = "Lone Druid" + " +" + Integer.toString(this.level);
            this.damage += 20;

        }
    }

    @Override
    public void showCharacterInfo() {
        //        isi kode anda disini
        super.showCharacterInfo();
        System.out.println("Kill Creep: "+ this.killCreep);
    }
}
