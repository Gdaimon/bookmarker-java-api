package zone.webtraining.bookmarker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zone.webtraining.bookmarker.entities.User;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.Collection;

@Repository
public class UsersDaoImpl implements UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public Collection<User> getAll() {
        @SuppressWarnings("unchecked")
        TypedQuery<User> query = getSession().createQuery("from User");
        return query.getResultList();
    }

    public User get(Long id) {
        return null;
    }

    public Serializable create(User bookmark) {
        return getSession().save(bookmark);
    }

    public User update(User bookmark) {
        return null;
    }

    public User delete(User bookmark) {
        return null;
    }
}
