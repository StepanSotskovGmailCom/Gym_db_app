package gymApplication.repository;

import gymApplication.entities.Activity_type;
import gymApplication.entities.Employees;

import java.util.List;

public class EmployeesRepository extends CrudRepository<Employees>{
    private static final String HIBERNATE_SELECT_QUERY = "from Employees";
    private static final String ID_PARAM = "employee_id";
    private static final String DELETE_QUERY = "delete from Employees e where e.employee_id = :" + ID_PARAM;

    public void delete(Long id) {
        runInTransaction((session) ->
                session.createQuery(DELETE_QUERY)
                        .setParameter(ID_PARAM, id)
                        .executeUpdate());
    }

    public Employees findOne(Long id) {
        return super.findOne(id, Employees.class);
    }

    public List<Employees> findAll() {
        return super.findAll(HIBERNATE_SELECT_QUERY, Employees.class);
    }
}
