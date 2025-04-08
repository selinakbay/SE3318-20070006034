package eldoria;

public class BattleManager {
    public void startBattle(Hero hero, Enemy enemy) {
        System.out.println(hero.getName() + " battles " + enemy.getName());
        if (hero.getLevel() >= enemy.getLevel()) {
            System.out.println(hero.getName() + " wins!");
        } else {
            System.out.println(enemy.getName() + " wins!");
        }
    }
}

