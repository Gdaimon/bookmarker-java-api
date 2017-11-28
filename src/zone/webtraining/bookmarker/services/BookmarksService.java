package zone.webtraining.bookmarker.services;

import zone.webtraining.bookmarker.dao.BookmarksDao;
import zone.webtraining.bookmarker.entities.Bookmark;

import java.util.Collection;

// Business Object BookmarksBO
public interface BookmarksService {
    Collection<Bookmark> getAll();

    Bookmark get(Long id);

    Bookmark create(Bookmark bookmark);

    Bookmark update(Bookmark bookmark);

    Bookmark delete(Bookmark bookmark);

    void setBookmarksDao(BookmarksDao bookmarksDao);
}
