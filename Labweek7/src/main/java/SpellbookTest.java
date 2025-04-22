import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SpellbookTest {
    @Test
    public void testGetSpellByValidIndex() {
        Spellbook book = new Spellbook(Arrays.asList("Alohomora", "Lumos"));
        assertEquals("Alohomora", book.getSpell(0));
    }

    @Test
    public void testGetSpellByInvalidIndex() {
        Spellbook book = new Spellbook(Arrays.asList("Alohomora", "Lumos"));
        assertThrows(IndexOutOfBoundsException.class, () -> book.getSpell(5));
    }

    @Test
    public void testGetSpellsByPrefixExactMatch() {
        Spellbook book = new Spellbook(Arrays.asList("Alohomora", "Lumos", "Alarte"));
        List<String> results = book.getSpellsByPrefix("Alo");
        assertTrue(results.contains("Alohomora"));
    }

    @Test
    public void testGetSpellsByPrefixEmpty() {
        Spellbook book = new Spellbook(Arrays.asList("Alohomora", "Lumos"));
        List<String> results = book.getSpellsByPrefix("");
        assertEquals(2, results.size());
    }

    @Test
    public void testGetSpellsByPrefixNoMatch() {
        Spellbook book = new Spellbook(Arrays.asList("Alohomora", "Lumos"));
        List<String> results = book.getSpellsByPrefix("Zzz");
        assertTrue(results.isEmpty());
    }
}


