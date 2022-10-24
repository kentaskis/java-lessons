package __21102022;

import javax.naming.AuthenticationException;
import java.security.NoSuchAlgorithmException;

public abstract class UserIdentify {
    private String token;
    private UserInterface userModel;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserInterface getUserModel() {
        return userModel;
    }

    public void setUserModel(UserInterface userModel) {
        this.userModel = userModel;
    }

    protected abstract void authorization(String password, String username) throws NoSuchAlgorithmException, AuthenticationException;

    public boolean isAuthorise() {
        return !token.isEmpty();
    }

}
