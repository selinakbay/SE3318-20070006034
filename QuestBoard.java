package eldoria;

public class QuestBoard {
    public void assignQuest(Questable character, String questName) {
        character.acceptQuest(questName);
        System.out.println("Quest '" + questName + "' assigned.");
    }
}
