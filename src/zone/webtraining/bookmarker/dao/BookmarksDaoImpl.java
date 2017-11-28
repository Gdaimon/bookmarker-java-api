package zone.webtraining.bookmarker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zone.webtraining.bookmarker.entities.Bookmark;

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
        System.out.println("LOG >> BookmarksDaoImpl.getAll()");
        System.out.println("LOG: session factory" + getSession());

        @SuppressWarnings("unchecked")
        TypedQuery<Bookmark> query = getSession().createQuery("from Bookmark");
        return query.getResultList();
//        List<Bookmark> bookmarks = getSession().createCriteria(Bookmark.class).list();
//        Query q = getSession().createQuery("from User");
//        List<Bookmark> allUsers = (List<Bookmark>) q.list();

//        return allUsers;
//        return bookmarks; // getSession().find(Bookmark.class);
    }

    public Bookmark get(Long id) {
        return null;
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
