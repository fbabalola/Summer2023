/** 
 * Class: CMSC201
 * Instructor: [Instructor's Name]
 * Description: 
 * This program is a JUnit test class that tests the methods length, charAt, substring, and indexOf
 * in the java.lang.String class. The test methods check various scenarios for each of the mentioned
 * methods to ensure their correctness.
 * Due: 07/24/23
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Oluwafirebami Babalola
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringTest {

    // Test the length() method
    @Test
    public void testStringLength() {
        String str = "Hello, world!";
        assertEquals(13, str.length()); // Check if the length of the string is correct
    }

    // Test the charAt() method
    @Test
    public void testCharAt() {
        String str = "Java";
        assertEquals('J', str.charAt(0)); // Check if the character at index 0 is 'J'
        assertEquals('a', str.charAt(1)); // Check if the character at index 1 is 'a'
        assertEquals('v', str.charAt(2)); // Check if the character at index 2 is 'v'
        assertEquals('a', str.charAt(3)); // Check if the character at index 3 is 'a'
    }

    // Test the substring() method
    @Test
    public void testSubstring() {
        String str = "Hello, world!";
        assertEquals("Hello", str.substring(0, 5)); // Check if substring from index 0 to 4 is "Hello"
        assertEquals("world!", str.substring(7)); // Check if substring from index 7 to the end is "world!"
    }

    // Test the indexOf() method
    @Test
    public void testIndexOf() {
        String str = "Java is fun!";
        assertEquals(0, str.indexOf("Java")); // Check if the index of "Java" is 0
        assertEquals(5, str.indexOf("is")); // Check if the index of "is" is 5
        assertEquals(-1, str.indexOf("Python")); // Check if "Python" is not found (-1)
    }
}
