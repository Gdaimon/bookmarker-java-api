package zone.webtraining.bookmarker.services;

import org.joda.time.DateTime;
import zone.webtraining.bookmarker.models.Bookmark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DummyBookmarksService implements BookmarksService {

    private List<Bookmark> list = new ArrayList<Bookmark>();

    public DummyBookmarksService() {
        super();

        for (int i = 0; i < 100; i++) {
            this.list.add(this._createBookmarkInstance(i));
        }
    }

    private Bookmark _createBookmarkInstance(int id) {
        return new Bookmark(id, 1,
                "Webtraining.Zone",
                "Plataforma para ayudar",
                "https://webtraining.zone/",
                new DateTime(),
                new DateTime());
    }

    public Collection<Bookmark> getAll() {
        return this.list;
    }

    public Bookmark get(int id) {
        return this.list.get(id);
    }

    public Bookmark create(Bookmark bookmark) {
        this.list.add(bookmark);
        return bookmark;
    }

    public Bookmark update(Bookmark bookmark) {
        this.list.set(bookmark.getId(), bookmark);

        return bookmark;
    }

    public Bookmark delete(Bookmark bookmark) {
        this.list.remove(bookmark.getId());
        return bookmark;
    }
}
