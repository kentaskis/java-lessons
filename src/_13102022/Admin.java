package _13102022;

import lombok.Getter;

@Getter
public class Admin extends AUser {

    private String session;

    @Override
    public boolean isAuthorised() {
        return session.length() != 0;
    }

}
