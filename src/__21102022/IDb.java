package __21102022;

import java.util.ArrayList;

public interface IDb {
    public ArrayList<Object> select(String query);

    public Object getById(int id);

    public int update(Object model);

    /**
     * @param model
     * @return Id
     */
    public int insert(Object model);

    public boolean delete(Object model);

    public boolean deleteById(int id);
}
