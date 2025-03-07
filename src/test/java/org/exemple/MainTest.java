package org.exemple;

import org.junit.jupiter.api.Test;  // Import JUnit 5 annotations (si vous utilisez JUnit 5)

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;  // Import assertions JUnit 5

class MainTest {
    @Test
    void testMain() {
        // Ceci est un test très basique.  Pour un vrai test, vous devriez
        // vérifier quelque chose de significatif dans votre application.
        // Dans cet exemple, on vérifie simplement que 1 + 1 est égal à 2.

        assertEquals(String.valueOf(2), 1 + 1, "1 + 1 should equal 2");
    }
}