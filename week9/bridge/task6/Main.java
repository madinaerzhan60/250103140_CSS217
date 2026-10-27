interface Weapon {
    void use();
}

class Sword implements Weapon {
    public void use() {
        System.out.println("Slash! Dealing 20 physical damage.");
    }
}

class MagicWand implements Weapon {
    public void use() {
        System.out.println("Zap! Dealing 35 magic damage.");
    }
}

abstract class Hero {
    // Composition creates the bridge between a hero and a weapon.
    protected Weapon weapon;

    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }
    public abstract void attack();
}

class Knight extends Hero {
    public Knight(Weapon weapon) {
        super(weapon);
    }
    public void attack() {
        weapon.use();
    }
}

class Wizard extends Hero {
    public Wizard(Weapon weapon) {
        super(weapon);
    }
    public void attack() {
        weapon.use();
    }
}

public class Main {
    public static void main(String[] args) {
        Knight swordKnight = new Knight(new Sword());
        Knight wandKnight = new Knight(new MagicWand());
        swordKnight.attack();
        wandKnight.attack();
    }
}
