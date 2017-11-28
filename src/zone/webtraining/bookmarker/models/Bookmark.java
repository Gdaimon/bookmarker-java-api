package zone.webtraining.bookmarker.models;

import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private int userId;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String url;

    @Column
    private DateTime created;

    @Column
    private DateTime modified;

    //private User user;

    public Bookmark() {
    }

    public Bookmark(Long id, int userId, String title, String description, String url, DateTime created, DateTime modified) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.url = url;
        this.created = created;
        this.modified = modified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
/*
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
