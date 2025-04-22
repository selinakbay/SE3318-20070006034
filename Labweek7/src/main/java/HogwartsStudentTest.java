import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class HogwartsStudentTest {
    @Test
    public void testLearnValidSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry");
        student.learnSpell("Expelliarmus");
        assertTrue(student.knowsSpell("Expelliarmus"));
    }

    @Test
    public void testLearnNullSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry");
        assertThrows(IllegalArgumentException.class, () -> student.learnSpell(null));
    }

    @Test
    public void testLearnDuplicateSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry");
        student.learnSpell("Lumos");
        student.learnSpell("Lumos"); // should not duplicate
        assertEquals(1, student.getKnownSpells().size());
    }

    @Test
    public void testKnowsSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry");
        student.learnSpell("Alohomora");
        assertTrue(student.knowsSpell("Alohomora"));
        assertFalse(student.knowsSpell("Avada Kedavra"));
    }
}
