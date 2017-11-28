package zone.webtraining.bookmarker.models;


import zone.webtraining.bookmarker.entities.Bookmark;

import java.util.ArrayList;
import java.util.Collection;

public class BookmarksResponse {
    private Collection<Bookmark> bookmarks;

    public BookmarksResponse() {
        this.bookmarks = new ArrayList<Bookmark>();
    }

    public BookmarksResponse(Collection<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public Collection<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(Collection<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }
}
