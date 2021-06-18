package gymApplication.repository;

import gymApplication.entities.Extra;
import gymApplication.entities.Membership;

import java.util.List;

public class MembershipRepository extends CrudRepository<Membership>{

    private static final String HIBERNATE_SELECT_QUERY = "from Extra";
    private static final String ID_PARAM = "membership_type";
    private static final String DELETE_QUERY = "delete from Membership m where m.membership_type = :" + ID_PARAM;

    public void delete(Long id) {
        runInTransaction((session) ->
                session.createQuery(DELETE_QUERY)
                        .setParameter(ID_PARAM, id)
                        .executeUpdate());
    }

    public Membership findOne(Long id) {
        return super.findOne(id, Membership.class);
    }

    public List<Membership> findAll() {
        return super.findAll(HIBERNATE_SELECT_QUERY, Membership.class);
    }

}
