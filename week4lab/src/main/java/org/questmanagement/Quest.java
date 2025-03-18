package org.questmanagement;
import java.util.ArrayList;
import java.util.List;

    public class Quest {
        private String name;
        private int difficulty;
        private Mentor mentor;
        private List<Adventurer> adventurers;

        public Quest(String name, int difficulty, Mentor mentor) {
            this.name = name;
            this.difficulty = difficulty;
            this.mentor = mentor;
            this.adventurers = new ArrayList<>();
            mentor.addQuest(this);
        }

        public void addAdventurer(Adventurer adventurer) {
            adventurers.add(adventurer);
        }

        @Override
        public String toString() {
            return "Quest: " + name + " (Difficulty: " + difficulty + ")\nMentor: " + mentor + "\nAdventurers: " + adventurers;
        }
    }

