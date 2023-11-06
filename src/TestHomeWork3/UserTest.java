import org.example.homeWork3.User;
import org.example.homeWork3.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    public UserTest() {
    }

    @Test
    void userCreation() {
        User user = new User("user_0", "psw123", false);
        Assertions.assertTrue(user.authenticate("user_0", "psw123"));
    }

    @Test
    void userCreationFailed() {
        User user = new User("user_0", "123psw", false);
        Assertions.assertFalse(user.authenticate("user_0", "psw123"));
    }

    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user_0", "psw123", false);
        userRepository.addUser(userNA);
        Assertions.assertFalse(userRepository.findByName(userNA.name));
    }

    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user_0", "psw123", false);
        userNA.authenticate("user_0", "psw23");
        userRepository.addUser(userNA);
        Assertions.assertFalse(userRepository.findByName(userNA.name));
    }

    @Test
    void adminHasAccessListUsers() {
        UserRepository userRepository = new UserRepository();
        User userNotAdmin1 = new User("user_0", "psw0", false);
        User userNotAdmin2 = new User("user_1", "psw1", false);
        userNotAdmin1.authenticate("user_0", "psw0");
        userNotAdmin2.authenticate("user_1", "psw1");
        userRepository.addUser(userNotAdmin1);
        userRepository.addUser(userNotAdmin2);
        userRepository.logoutAll();
        Assertions.assertFalse(userNotAdmin1.isAuthenticate);
    }
}