package zone.webtraining.bookmarker.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import zone.webtraining.bookmarker.models.Bookmark;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


public class BookmarksDaoImpl implements BookmarksDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public Collection<Bookmark> getAll() {
        System.out.println("LOG >> BookmarksDaoImpl.getAll()");
        System.out.println("LOG: session factory" + getSession());
        List<Bookmark> bookmarks = getSession().createCriteria(Bookmark.class).list();
//        Query q = getSession().createQuery("from User");
//        List<Bookmark> allUsers = (List<Bookmark>) q.list();

//        return allUsers;
        return bookmarks; // getSession().find(Bookmark.class);
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
