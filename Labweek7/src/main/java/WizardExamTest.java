import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class WizardExamTest {
    @Test
    public void testPassTrue() {
        HogwartsStudent student = new HogwartsStudent("Hermione");
        student.learnSpell("Lumos");
        student.learnSpell("Alohomora");
        WizardExam exam = new WizardExam(Arrays.asList("Lumos", "Alohomora"));
        assertTrue(exam.pass(student));
    }

    @Test
    public void testPassFalse() {
        HogwartsStudent student = new HogwartsStudent("Ron");
        student.learnSpell("Lumos");
        WizardExam exam = new WizardExam(Arrays.asList("Lumos", "Alohomora"));
        assertFalse(exam.pass(student));
    }

    @Test
    public void testEvaluateOutput() {
        HogwartsStudent student = new HogwartsStudent("Harry");
        student.learnSpell("Lumos");
        WizardExam exam = new WizardExam(Arrays.asList("Lumos"));
        exam.evaluate(student); // Assume prints "Harry passed the exam!"
    }
}

