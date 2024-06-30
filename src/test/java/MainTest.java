import org.ai.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Act
        Main.main(new String[]{});

        // Capture the output and print for debugging
        String actualOutput = outputStream.toString().trim();
        System.out.println("Actual output: [" + actualOutput + "]");

        // Assert
        assertEquals("Hello world!", actualOutput);

        // Restore the original System.out
        System.setOut(originalOut);
    }
}
