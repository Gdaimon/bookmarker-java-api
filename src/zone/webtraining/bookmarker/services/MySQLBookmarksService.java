package zone.webtraining.bookmarker.services;

//import org.springframework.beans.factory.annotation.Autowired;

import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zone.webtraining.bookmarker.daos.BookmarksDao;
import zone.webtraining.bookmarker.models.Bookmark;

import java.util.Collection;

@Service
@Transactional(readOnly = true)
public class MySQLBookmarksService implements BookmarksService {

    //    @Autowired
    private BookmarksDao bookmarksDao;

    public Collection<Bookmark> getAll() {
        System.out.println("LOG MySQLBookmarksService.getAll()");
        return bookmarksDao.getAll();
    }

    public Bookmark get(Long id) {
        return null;
    }

    @Transactional(readOnly = false)
    public Bookmark create(Bookmark bookmark) {
        Long id = (Long) bookmarksDao.create(bookmark);
        return get(id);
    }

    public Bookmark update(Bookmark bookmark) {
        return null;
    }

    public Bookmark delete(Bookmark bookmark) {
        return null;
    }

    public void setBookmarksDao(BookmarksDao bookmarksDao) {
        this.bookmarksDao = bookmarksDao;
    }
}
