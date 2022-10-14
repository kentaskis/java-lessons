package _13102022;

public class Guest extends AUser {

    @Override
    public boolean isAuthorised() {
        return false;
    }

    @Override
    public void changePermissions(int[] permissionIds) {
        super.changePermissions(permissionIds);
    }
}
