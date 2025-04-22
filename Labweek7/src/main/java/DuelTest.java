import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DuelTest {
    @Test
    public void testDuelBothKnowSpell() {
        HogwartsStudent a = new HogwartsStudent("Harry");
        HogwartsStudent b = new HogwartsStudent("Draco");
        a.learnSpell("Expelliarmus");
        b.learnSpell("Expelliarmus");
        Duel duel = new Duel();
        String result = duel.duel(a, b, "Expelliarmus");
        assertNotNull(result);
    }

    @Test
    public void testDuelOneKnowsSpell() {
        HogwartsStudent a = new HogwartsStudent("Harry");
        HogwartsStudent b = new HogwartsStudent("Neville");
        a.learnSpell("Stupefy");
        Duel duel = new Duel();
        String result = duel.duel(a, b, "Stupefy");
        assertNotNull(result);
    }

    @Test
    public void testDuelNeitherKnowsSpell() {
        HogwartsStudent a = new HogwartsStudent("Harry");
        HogwartsStudent b = new HogwartsStudent("Ron");
        Duel duel = new Duel();
        String result = duel.duel(a, b, "Avada Kedavra");
        assertEquals("Draw", result);
    }

    @Test
    public void testDuelWithNull() {
        HogwartsStudent a = new HogwartsStudent("Harry");
        Duel duel = new Duel();
        assertThrows(IllegalArgumentException.class, () -> duel.duel(a, null, "Lumos"));
    }
}
