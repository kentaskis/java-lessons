package _13102022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AUser {
    private int id;
    private int[] permissions;

    public abstract boolean isAuthorised();

    public void changePermissions(int[] permissionIds) {
        setPermissions(permissionIds);
    }
}
