package gymApplication.repository;

import gymApplication.entities.Companies;

import java.util.List;

public class CompaniesRepository extends CrudRepository<Companies>{

    private static final String HIBERNATE_SELECT_QUERY = "from Companies";
    private static final String ID_PARAM = "company_name";
    private static final String DELETE_QUERY = "delete from Companies c where c.company_name = :" + ID_PARAM;

    public void delete(Long id) {
        runInTransaction((session) ->
                session.createQuery(DELETE_QUERY)
                        .setParameter(ID_PARAM, id)
                        .executeUpdate());
    }

    public Companies findOne(Integer id) {
        return super.findOne(id, Companies.class);
    }

    public List<Companies> findAll() {
        return super.findAll(HIBERNATE_SELECT_QUERY, Companies.class);
    }

}
