import org.ai.Adder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {
    // Add your test methods here
    @Test
    public void testAdd() {
        // Arrange
        int a = 1;
        int b = 2;

        // Act
        int sum = Adder.add(a, b);

        // Assert
        assertEquals(3, sum);
    }
}
