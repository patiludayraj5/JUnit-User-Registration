import org.junit.Test;
import org.example.UserRegistration;
import static org.junit.Assert.*;

public class UserRegistrationTest {

    // Happy Scenarios

    @Test
    public void testHappyFirstName() {
        assertTrue(UserRegistration.isValidName("John"));
    }

    @Test
    public void testHappyLastName() {
        assertTrue(UserRegistration.isValidName("Doe"));
    }

    @Test
    public void testHappyEmail() {
        assertTrue(UserRegistration.isValidEmail("john.doe@example.com"));
    }

    @Test
    public void testHappyMobileNumber() {
        assertTrue(UserRegistration.isValidMobileNumber("91 9876543210"));
    }

    @Test
    public void testHappyPassword() {
        assertTrue(UserRegistration.isValidPassword("SecurePwd1!"));
    }

    // Sad Scenarios

    @Test
    public void testSadFirstName() {
        assertFalse(UserRegistration.isValidName("john")); // Should start with a capital letter
    }

    @Test
    public void testSadLastName() {
        assertFalse(UserRegistration.isValidName("doe")); // Should start with a capital letter
    }

    @Test
    public void testSadEmail() {
        assertFalse(UserRegistration.isValidEmail("invalid.email@com"));
    }

    @Test
    public void testSadMobileNumber() {
        assertFalse(UserRegistration.isValidMobileNumber("9876543210")); // Missing country code and space
    }

    @Test
    public void testSadPassword() {
        assertFalse(UserRegistration.isValidPassword("weak")); // Too short
    }
}
