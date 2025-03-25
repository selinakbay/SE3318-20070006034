package com.hogwarts;

import java.util.HashSet;
import java.util.Set;

public class HogwartsStudent {
    private String name;
    private String house;
    private int year;
    private Set<String> spellsLearned;

    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new HashSet<>();
    }

    /**
     * Learn a spell
     * @param spell The spell to learn
     * @return true if learned successfully, false otherwise
     * Requires: spell is not null
     * Effects: Adds spell to spellsLearned if not already known
     */
    public boolean learnSpell(String spell) {
        if (spell == null || spellsLearned.contains(spell)) {
            return false;
        }
        spellsLearned.add(spell);
        return true;
    }

    /**
     * Check if a student knows a spell
     * @param spell The spell to check
     * @return true if known, false otherwise
     */
    public boolean knowsSpell(String spell) {
        return spellsLearned.contains(spell);
    }

    public String getName() { return name; }
    public String getHouse() { return house; }
    public int getYear() { return year; }
    public Set<String> getSpellsLearned() { return spellsLearned; }
}
