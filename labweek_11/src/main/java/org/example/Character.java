package org.example;

/**
 * Represents a character from "The Lord of the Rings" universe.
 * Each character has properties like name, race, age, and a unique title.
 */
public class Character {
    /** The name of the character. */
    private String name;
    /** The race of the character (e.g., Hobbit, Elf, Human). */
    private String race;
    /** The age of the character. */
    private int age;
    /** A unique title or attribute of the character (e.g., "Ring-bearer", "King"). */
    private String title;

    /**
     * Constructs a new Character object.
     *
     * @param nameParam The name of the character.
     * @param raceParam The race of the character.
     * @param ageParam  The age of the character.
     */
    public Character(final String nameParam, final String raceParam, final int ageParam) {
        this.name = nameParam;
        this.race = raceParam;
        this.age = ageParam;
        this.title = titleParam;
    }

    /**
     * Prints the details of the character.
     * This method demonstrates conditional logic based on character properties.
     *
     * @comment This method was refactored to add Javadoc, fix missing braces for if/else statements,
     * and remove an empty else block.
     */
    public void printDetails() {
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit.");
        } else {
            System.out.println("Character is not a Hobbit, but a " + race + ".");
        }

        if (age >= 50) {
            System.out.println("Character is 50 or older.");
        } else if (name.equals("Frodo")) {
            System.out.println("Character is Frodo.");
        }

        System.out.println("Character Name: " + name + ", Race: " + race + ", Age: " + age + ", Title: " + title + ".");
    }

    /**
     * Gets the name of the character.
     *
     * @return The character's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the race of the character.
     *
     * @return The character's race.
     */
    public String getRace() {
        return race;
    }

    /**
     * Gets the age of the character.
     *
     * @return The character's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the title of the character.
     *
     * @return The character's title.
     */
    public String getTitle() {
        return title;
    }
}
