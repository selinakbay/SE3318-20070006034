import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MagicClassroomTest {
    @Test
    public void testAddValidStudent() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Hermione");
        classroom.addStudent(student);
        assertEquals(student, classroom.findStudentByName("Hermione"));
    }

    @Test
    public void testAddNullStudent() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(null);
        assertNull(classroom.findStudentByName("null"));
    }

    @Test
    public void testFindStudentBySpell() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry");
        harry.learnSpell("Expecto Patronum");
        classroom.addStudent(harry);
        assertTrue(classroom.findStudentsBySpell("Expecto Patronum").contains(harry));
    }

    @Test
    public void testGetStudentsByHouseSorting() {
        MagicClassroom classroom = new MagicClassroom();
        // Let's assume the house is part of name for this test simplicity
        HogwartsStudent a = new HogwartsStudent("Zach"), b = new HogwartsStudent("Anna");
        classroom.addStudent(a);
        classroom.addStudent(b);
        List<HogwartsStudent> list = classroom.getStudentsByHouse("Gryffindor");
        assertEquals("Anna", list.get(0).getName());
    }
}
