package org.example;

/**
 * The main application class for "The Lord of the Rings" simulation.
 * This class demonstrates the creation and interaction of Characters, Middle-Earth Map, and Quests.
 *
 * @comment This class was refactored to add Javadoc and update method calls
 * to match the new signatures and demonstrate new features.
 */
public final class App {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private App() {
        // Private constructor
    }

    /**
     * The main method, entry point of the application.
     * It initializes characters, map, and quests, then simulates interactions.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(final String[] args) {
        System.out.println("Starting The Lord of the Rings Simulation!");

        // --- Characters ---
        // Create new characters with their unique attributes
        Character frodo = new Character("Frodo", "Hobbit", 50, "Ring-bearer");
        Character aragorn = new Character("Aragorn", "Human", 87, "King of Gondor");
        Character legolas = new Character("Legolas", "Elf", 2931, "Prince of Mirkwood");
        Character gandalf = new Character("Gandalf", "Maia", 2019, "The White");

        System.out.println("\n--- Character Details ---");
        frodo.printDetails();
        aragorn.printDetails();
        legolas.printDetails();
        gandalf.printDetails();

        // --- Middle-Earth Map ---
        MiddleEarthMap map = new MiddleEarthMap();

        System.out.println("\n--- Map Navigation ---");
        // Demonstrate navigation with and without secret passages
        map.navigate("Shire", "Bree", false);
        map.navigate("Bree", "Rivendell", false);
        map.navigate("Rivendell", "Moria", true); // Attempt secret passage
        map.navigate("Rivendell", "Lothlórien", false);
        map.navigate("Mordor", "Mount Doom", true); // Attempt secret passage
        map.navigate("Gondor", "Minas Tirith", false);
        map.navigate("Unknown Place", "Mordor", false); // Unknown current location
        map.navigate("Shire", "Mordor", false); // No direct path

        // --- Quests ---
        // Create new quests with different types and difficulties
        Quest ringQuest = new Quest("Epic Journey", 10, "Destruction of the One Ring");
        Quest elvenPathQuest = new Quest("Elven Council", 5, "Elven Wisdom");
        Quest orcHuntQuest = new Quest("Side Mission", 7, "Orc Slayer Title");

        System.out.println("\n--- Quest Interactions ---");

        // Frodo attempts the Ring Quest
        System.out.println("\nFrodo's Quest:");
        boolean frodoQuestCompleted = ringQuest.completeQuest(100, true);
        System.out.println("Frodo completed the Ring Quest: " + frodoQuestCompleted);
        ringQuest.undertakeQuest(frodo);

        // Aragorn attempts a high-difficulty quest
        System.out.println("\nAragorn's Quest:");
        boolean aragornQuestCompleted = orcHuntQuest.completeQuest(75, false);
        System.out.println("Aragorn completed the Orc Hunt Quest: " + aragornQuestCompleted);
        orcHuntQuest.undertakeQuest(aragorn);

        // Legolas attempts an Elven quest
        System.out.println("\nLegolas's Quest:");
        boolean legolasQuestCompleted = elvenPathQuest.completeQuest(60, false);
        System.out.println("Legolas completed the Elven Path Quest: " + legolasQuestCompleted);
        elvenPathQuest.undertakeQuest(legolas);

        // Gandalf attempts a quest with special points
        System.out.println("\nGandalf's Quest:");
        boolean gandalfQuestCompleted = ringQuest.completeQuest(42, false); // Special points
        System.out.println("Gandalf completed the Ring Quest (special points): " + gandalfQuestCompleted);
        ringQuest.undertakeQuest(gandalf);

        System.out.println("\nSimulation Finished!");
    }
}
