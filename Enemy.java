package eldoria;

public class Enemy extends Character {
    public Enemy(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println(name + " growls: You shall not pass!");
    }
}
