package __21102022;

import java.util.ArrayList;

public class DB implements IDb {
    private Connection connection;

    public DB(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object getById(int id) {
        return new Object();
    }

    @Override
    public ArrayList<Object> select(String query) {
//        connection.query(query);
        return new ArrayList<>();
    }


    @Override
    public int update(Object model) {
        return 0;
    }

    @Override
    public int insert(Object model) {
        return 12;
    }

    @Override
    public boolean delete(Object model) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

}
