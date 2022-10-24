package __21102022;

import javax.naming.AuthenticationException;
import java.security.NoSuchAlgorithmException;

public class AuthorizationService extends UserIdentify {

    private AuthorizationRepositoryInterface userRepository;

    private PasswordEncoderInterface passwordEncoderInterface;

    public AuthorizationService(AuthorizationRepositoryInterface userRepository, PasswordEncoderInterface passwordEncoderInterface) {
        this.userRepository = userRepository;
        this.passwordEncoderInterface = passwordEncoderInterface;
    }

    @Override
    protected void authorization(String password, String username) throws NoSuchAlgorithmException, AuthenticationException {
        User user = (User) userRepository.getByUsername(username);
        if (user == null) {
            throw new AuthenticationException();
        }

        if (user.getStatus() != Status.ACTIVE) {
            throw new AuthenticationException();
        }

        if (user.getPassword().equals(passwordEncoderInterface.encodePassword(password))) {
            this.setUserModel(user);
            return;
        }

        throw new AuthenticationException();
    }
}
