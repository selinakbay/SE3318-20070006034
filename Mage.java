package eldoria;

public class Mage extends Hero implements Questable {
    public Mage(String name, int level) {
        super(name, level);
    }

    public void castSpell() {
        System.out.println(name + " casts a powerful spell!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " accepts quest: " + questName);
    }
}

