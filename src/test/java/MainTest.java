import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void returnTrue_whenPasswordMatchesWithLowerCase(){
        // Given
        String pswd = "Hallo67ali";
        // When
        boolean actual = Main.validateLowerCase(pswd);
        boolean expected = true;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void returnFalse_whenPasswordMatchesWithNoLowerCase(){
        // Given
        String pswd = "HALLILOLA";
        // When
        boolean actual = Main.validateLowerCase(pswd);
        boolean expected = false;
        // Then
        assertEquals(expected, actual);
    }
    @Test
    void returnTrue_whenPasswordMatchesWithUpperCase(){
        // Given
        String pswd = "Hallo67ali";
        // When
        boolean actual = Main.validateUpperCase(pswd);
        boolean expected = true;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void returnFalse_whenPasswordMatchesWithNoUpperCase(){
        // Given
        String pswd = "hallo67ali";
        // When
        boolean actual = Main.validateUpperCase(pswd);
        boolean expected = false;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void returnTrue_whenPasswordMatchesWithDigit() {
        // Given
        String pswd = "Hall56alil";
        // When
        boolean actual = Main.validateDigits(pswd);
        boolean expected = true;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void returnFalse_whenPasswordMatchesWithNoDigit() {
        // Given
        String pswd = "Hallolila";
        // When
        boolean actual = Main.validateDigits(pswd);
        boolean expected = false;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void returnTrue_whenPasswordLengthGreaterThan8() {
        // Given
        String pswd = "Hallalilo";
        // When
        boolean actual = Main.validateLength(pswd);
        boolean expected = true;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void returnFalse_whenPasswordLengthSmallerThan8() {
        // Given
        String pswd = "Hallali";
        // When
        boolean actual = Main.validateLength(pswd);
        boolean expected = false;
        // Then
        assertEquals(expected, actual);
    }
}