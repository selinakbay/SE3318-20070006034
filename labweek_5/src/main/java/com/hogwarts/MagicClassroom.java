package com.hogwarts;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class MagicClassroom {
    private List<HogwartsStudent> students;

    public MagicClassroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(HogwartsStudent student) {
        if (student != null) {
            students.add(student);
        }
    }

    public HogwartsStudent findStudent(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public HogwartsStudent findStudentBySpell(String spell) {
        return students.stream()
                .filter(s -> s.knowsSpell(spell))
                .findFirst()
                .orElse(null);
    }

    public List<HogwartsStudent> getStudentsByHouse(String house) {
        return students.stream()
                .filter(s -> s.getHouse().equalsIgnoreCase(house))
                .collect(Collectors.toList());
    }
}
