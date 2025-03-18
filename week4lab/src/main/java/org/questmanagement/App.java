package org.questmanagement;
    public class App {
        public static void main(String[] args) {
            // Creating Mentors
            Mentor gandalf = new Mentor("Gandalf", "The Grey");
            Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");

            // Creating Quests
            Quest destroyRing = new Quest("Destroy the One Ring", 10, gandalf);
            Quest defendHelmsDeep = new Quest("Defend Helm’s Deep", 8, elrond);

            // Creating Adventurers
            Adventurer frodo = new Adventurer("Frodo Baggins", "Hobbit");
            Adventurer aragorn = new Adventurer("Aragorn", "Man");
            Adventurer legolas = new Adventurer("Legolas", "Elf");
            Adventurer gimli = new Adventurer("Gimli", "Dwarf");

            // Adventurers joining quests
            frodo.joinQuest(destroyRing);
            aragorn.joinQuest(defendHelmsDeep);
            legolas.joinQuest(defendHelmsDeep);
            gimli.joinQuest(defendHelmsDeep);

            // Displaying quest details
            System.out.println(destroyRing);
            System.out.println(defendHelmsDeep);
        }
    }


