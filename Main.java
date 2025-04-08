package eldoria;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Aelwyn", 10);
        Warrior warrior = new Warrior("Thorin", 8);
        Enemy enemy = new Enemy("Shadowbeast", 9);

        mage.speak();
        warrior.speak();
        enemy.speak();

        QuestBoard questBoard = new QuestBoard();
        questBoard.assignQuest(mage, "Defend the Realm");
        questBoard.assignQuest(warrior, "Retrieve the Lost Artifact");

        mage.castSpell();
        warrior.attack();

        BattleManager battleManager = new BattleManager();
        battleManager.startBattle(mage, enemy);
        battleManager.startBattle(warrior, enemy);
    }
}

