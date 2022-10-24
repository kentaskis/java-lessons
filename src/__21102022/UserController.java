package __21102022;

import javax.naming.AuthenticationException;
import java.security.NoSuchAlgorithmException;

public class UserController {

    public User login(String username, String password) {
        try {
            AuthorizationService authorizationService = new AuthorizationService(
                    new UserRepository(
                            new DB(new Connection())), new SHAEncoder());

            authorizationService.authorization(password, username);

            return (User) authorizationService.getUserModel();

        } catch (AuthenticationException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public User Registration(UserDTO user) {
        // TODO: validate(UserDTO); здесь же валидация если такой юзернейм существует
        UserRepository userRepository = new UserRepository(new DB(new Connection()));
        int userId = userRepository.create(user);

        return userRepository.getById(userId);
    }
}
