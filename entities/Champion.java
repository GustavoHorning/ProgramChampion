package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armour;


    public Champion(String name, int life, int attack, int armour) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getArmour() {
        return armour;
    }
    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void takeDamage(Champion other) {
        if (other.armour >= this.attack) {
            other.armour = 0;
            this.attack = 1;
        }
        this.life -= (other.attack - this.armour);

    }
    public String status() {
        if (life <= 0) {
            life = 0;
            return name + ": " + life + " of life (of died)";
        } else {
            return name + ": " + life + " of life";
        }

    }

}
