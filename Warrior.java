
package eldoria;

public class Warrior extends Hero implements Questable {
    public Warrior(String name, int level) {
        super(name, level);
    }

    public void attack() {
        System.out.println(name + " swings their sword mightily!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " accepts quest: " + questName);
    }
}
