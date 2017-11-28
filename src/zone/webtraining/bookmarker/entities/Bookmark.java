package zone.webtraining.bookmarker.entities;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import java.io.Serializable;


@Entity
@Table(name = "bookmarks")
public class Bookmark implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(name = "user_id" insert= "false" update= "false")
//    private int userId;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String url;

    @Column(name = "created", updatable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private LocalDateTime created;

    @Column
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private LocalDateTime modified;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Bookmark() {
    }

    public Bookmark(Long id, String title, String description, String url, LocalDateTime created, LocalDateTime modified) {
        this.id = id;
//        this.userId = userId;
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

//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }

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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
