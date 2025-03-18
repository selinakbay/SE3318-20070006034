package org.questmanagement;
import java.util.ArrayList;
import java.util.List;

    public class Adventurer extends Character implements Joinable {
        private String race;
        private List<Quest> quests;

        public Adventurer(String name, String race) {
            super(name, ""); // No title for adventurers
            this.race = race;
            this.quests = new ArrayList<>();
        }

        @Override
        public void joinQuest(Quest quest) {
            quests.add(quest);
            quest.addAdventurer(this);
        }

        public List<Quest> getQuests() {
            return quests;
        }

        @Override
        public String toString() {
            return name + " the " + race;
        }
    }

