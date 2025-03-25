package com.hogwarts;

import java.util.Random;

public class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        System.out.println("Duel between " + s1.getName() + " and " + s2.getName());

        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("It's a draw! No one knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins the duel!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins the duel!");
        } else {
            Random random = new Random();
            if (random.nextBoolean()) {
                System.out.println(s1.getName() + " wins the duel!");
            } else {
                System.out.println(s2.getName() + " wins the duel!");
            }
        }
    }
}


