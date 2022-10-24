package __21102022;

public abstract class AbstractRepository {
    private IDb db;
    private Object model;

    public AbstractRepository(IDb db, Object model) {
        this.db = db;
        this.model = model;
    }

    public IDb getDb() {
        return db;
    }

    public Object getModel() {
        return model;
    }

    public abstract Object getById(int id);
}
