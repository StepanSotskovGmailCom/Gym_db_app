package gymApplication.repository;

import gymApplication.entities.Activity_type;
import gymApplication.entities.Companies;

import java.util.List;

public class ActivityTypeRepository extends CrudRepository<Activity_type> {
    private static final String HIBERNATE_SELECT_QUERY = "from Activity_type";
    private static final String ID_PARAM = "activity_type";
    private static final String DELETE_QUERY = "delete from Activity_type a where a.activity_type = :" + ID_PARAM;

    public void delete(Long id) {
        runInTransaction((session) ->
                session.createQuery(DELETE_QUERY)
                        .setParameter(ID_PARAM, id)
                        .executeUpdate());
    }

    public Activity_type findOne(Long id) {
        return super.findOne(id, Activity_type.class);
    }

    public List<Activity_type> findAll() {
        return super.findAll(HIBERNATE_SELECT_QUERY, Activity_type.class);
    }
}
