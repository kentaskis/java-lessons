package __21102022;

import java.security.NoSuchAlgorithmException;

public interface PasswordEncoderInterface {
    public String encodePassword(String password) throws NoSuchAlgorithmException;
}
