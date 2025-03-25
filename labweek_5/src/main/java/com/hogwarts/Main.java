package com.hogwarts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HogwartsStudent harry = new HogwartsStudent("Harry Potter", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco Malfoy", "Slytherin", 5);
        HogwartsStudent hermione = new HogwartsStudent("Hermione Granger", "Gryffindor", 5);

        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Serpensortia");
        hermione.learnSpell("Alohomora");

        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Expelliarmus");
        spellbook.addSpell("Serpensortia");
        spellbook.addSpell("Alohomora");

        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(hermione);

        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus", "Alohomora"));
        exam.evaluate(harry);
        exam.evaluate(hermione);

        Duel.start(harry, draco, "Expelliarmus");
        Duel.start(draco, hermione, "Alohomora");
    }
}
