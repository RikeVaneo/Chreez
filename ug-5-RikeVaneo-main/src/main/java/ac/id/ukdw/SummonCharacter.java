package ac.id.ukdw;

public abstract class SummonCharacter extends Hero{
    protected Summoner owner;
    public SummonCharacter(String name, int health, int damage, Summoner a){
        super(name, health, damage);
        setOwner(a);
    }
    public void setOwner(Summoner owner) {
        this.owner = owner;
    }
    public Summoner getOwner() {
        return owner;
    }
}
