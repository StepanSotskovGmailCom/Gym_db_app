package gymApplication.repository;

import gymApplication.entities.Employees;
import gymApplication.entities.Extra;

import java.util.List;

public class ExtraRepository extends CrudRepository<Extra>{



    private static final String HIBERNATE_SELECT_QUERY = "from Extra";
    private static final String ID_PARAM = "extra_id";
    private static final String DELETE_QUERY = "delete from Extra e where e.extra_id = :" + ID_PARAM;

    public void delete(Long id) {
        runInTransaction((session) ->
                session.createQuery(DELETE_QUERY)
                        .setParameter(ID_PARAM, id)
                        .executeUpdate());
    }

    public Extra findOne(Long id) {
        return super.findOne(id, Extra.class);
    }

    public List<Extra> findAll() {
        return super.findAll(HIBERNATE_SELECT_QUERY, Extra.class);
    }

}
