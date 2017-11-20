package zone.webtraining.bookmarker.models;

import org.joda.time.DateTime;

public class Bookmark {
    private int id;
    private int userId;
    private String title;
    private String description;
    private String url;
    private DateTime created;
    private DateTime modified;

    public Bookmark() {
    }

    public Bookmark(int id, int userId, String title, String description, String url, DateTime created, DateTime modified) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.url = url;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public DateTime getModified() {
        return modified;
    }

    public void setModified(DateTime modified) {
        this.modified = modified;
    }
}
