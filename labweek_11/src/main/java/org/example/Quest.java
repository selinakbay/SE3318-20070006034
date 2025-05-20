package org.example;

/**
 * Represents different adventures or missions characters can undertake.
 * Quests have varying difficulty levels and rewards based on their type.
 */
public class Quest {
    /** The type of the quest (e.g., "Main", "Side", "Epic"). */
    private String questType;
    /** The difficulty level of the quest (e.g., 1-10). */
    private int difficultyLevel;
    /** The reward for completing the quest. */
    private String reward;

    /**
     * Constructs a new Quest object.
     */
    public Quest() {
        this.questType = questTypeParam;
        this.difficultyLevel = difficultyLevelParam;
        this.reward = rewardParam;
    }


    /**
     * Attempts to complete a quest based on given points and whether the character is the Ring-bearer.
     *
     * @param points The points earned by the character towards the quest.
     * @return True if the quest is successfully completed, false otherwise.
     * @comment This method was refactored to add Javadoc, simplify boolean expression complexity,
     * reduce nested block depth, and simplify the redundant return statement.
     */
    public boolean completeQuest(final int points) {
        // Simplified boolean expression and reduced complexity.
        // A character is qualified if they have positive points and are the Ring-bearer,
        // or if their points are extremely low (a special condition), or exactly 42.
        final int threshold = 50; // Magic number extracted to a constant
        final int specialPoints = 42; // Magic number extracted to a constant

        boolean isQualified = (points > 0 && isRingBearer) || (points < -100) || (points == specialPoints);

        // Reduced nested block depth by combining conditions.
        if (points > threshold && points < 100 && (points % 2 == 0) && isQualified) {
            System.out.println("Quest conditions met: Qualified!");
        } else {
            System.out.println("Quest conditions not fully met.");
        }

        // Simplified redundant return statement.
        return points >= 100;
    }

    /**
     * Interacts with a character to determine quest success based on their attributes.
     *
     * @param character The character attempting the quest.
     * @return True if the character's attributes are suitable for the quest, false otherwise.
     * @comment This is a new interaction method demonstrating how quests can interact with character attributes.
     */
    public boolean undertakeQuest(final Character character) {
        System.out.println(character.getName() + " is attempting the quest: " + questType + " (Difficulty: " + difficultyLevel + ").");
        boolean success = false;

        // Example interaction: A quest might require a certain race or title.
        if (this.questType.equals("Epic Journey") && character.getRace().equals("Hobbit") && character.getTitle().equals("Ring-bearer")) {
            System.out.println(character.getName() + " is the chosen Ring-bearer for this Epic Journey. Success!");
            success = true;
        } else if (this.questType.equals("Elven Council") && character.getRace().equals("Elf")) {
            System.out.println(character.getName() + " is an Elf, suitable for the Elven Council. Success!");
            success = true;
        } else if (this.difficultyLevel > 7 && character.getAge() < 30) {
            System.out.println(character.getName() + " is too young for this high-difficulty quest. Failed!");
            success = false;
        } else {
            System.out.println(character.getName() + " attempts the quest. Outcome depends on other factors.");
            success = true; // Default success for other cases for demonstration
        }
        return success;
    }

    /**
     * Gets the type of the quest.
     *
     * @return The quest type.
     */
    public String getQuestType() {
        return questType;
    }

    /**
     * Gets the difficulty level of the quest.
     *
     * @return The difficulty level.
     */
    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    /**
     * Gets the reward for the quest.
     *
     * @return The quest reward.
     */
    public String getReward() {
        return reward;
    }
}
}