package org.questmanagement;
import java.util.ArrayList;
import java.util.List;

    public class Mentor extends Character {
        private List<Quest> quests;

        public Mentor(String name, String title) {
            super(name, title);
            this.quests = new ArrayList<>();
        }

        public void addQuest(Quest quest) {
            quests.add(quest);
        }

        public List<Quest> getQuests() {
            return quests;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


