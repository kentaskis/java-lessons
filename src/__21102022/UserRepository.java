package __21102022;

public class UserRepository extends AbstractRepository implements AuthorizationRepositoryInterface {

    public UserRepository(IDb db) {
        super(db, new User());
    }

    @Override
    public UserInterface getModel() {
        return (UserInterface) super.getModel();
    }

    @Override
    public User getById(int id) {
        return (User) this.getDb().getById(id);
    }

    @Override
    public UserInterface getByUsername(String username) {
        // find user in DB by username
        return new User();
    }

    public int create(UserDTO userDTO) {
        return getDb().insert(userDTO);
    }
}
