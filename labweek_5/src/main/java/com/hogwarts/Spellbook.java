package com.hogwarts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Spellbook {
    private List<String> spells;

    public Spellbook() {
        this.spells = new ArrayList<>();
    }

    public void addSpell(String spell) {
        if (spell != null && !spells.contains(spell)) {
            spells.add(spell);
        }
    }

    public String getSpell(int index) {
        return (index >= 0 && index < spells.size()) ? spells.get(index) : null;
    }

    public List<String> getSpellsByPrefix(String prefix) {
        return spells.stream()
                .filter(spell -> spell.startsWith(prefix))
                .collect(Collectors.toList());
    }
}
