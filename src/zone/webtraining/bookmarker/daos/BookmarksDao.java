package zone.webtraining.bookmarker.daos;

import zone.webtraining.bookmarker.models.Bookmark;

import java.io.Serializable;
import java.util.Collection;

public interface BookmarksDao {
    Collection<Bookmark> getAll();

    Bookmark get(Long id);

    Serializable create(Bookmark bookmark);

    Bookmark update(Bookmark bookmark);

    Bookmark delete(Bookmark bookmark);
}
