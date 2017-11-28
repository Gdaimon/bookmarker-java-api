package zone.webtraining.bookmarker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zone.webtraining.bookmarker.entities.Bookmark;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.Collection;

@Repository
public class BookmarksDaoImpl implements BookmarksDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public Collection<Bookmark> getAll() {

        @SuppressWarnings("unchecked")
        TypedQuery<Bookmark> query = getSession().createQuery("from Bookmark");
        return query.getResultList();
    }

    public Bookmark get(Long id) {
        @SuppressWarnings("unchecked")
        String BOOKMARK_HQL = "from Bookmark where id=:id";
        Query<Bookmark> query = getSession().createQuery(BOOKMARK_HQL);
        query.setParameter("id", id);
        return query.list().get(0);
    }

    public Serializable create(Bookmark bookmark) {
        return getSession().save(bookmark);
    }

    public Bookmark update(Bookmark bookmark) {
        return null;
    }

    public Bookmark delete(Bookmark bookmark) {
        return null;
    }
}
