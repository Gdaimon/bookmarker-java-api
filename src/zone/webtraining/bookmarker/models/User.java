package zone.webtraining.bookmarker.models;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;

    @Column(name = "created", updatable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private LocalDateTime created;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private LocalDateTime modified;

//    @OneToMany(mappedBy = "user")
//    private Set<Bookmark> bookmarks;


    public User() {
    }

    public User(Long id, String email, String password, LocalDateTime created, LocalDateTime modified) {
        this.id = id;
        this.email = email;
        this.created = created;
        this.modified = modified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

//    public Set<Bookmark> getBookmarks() {
//        return bookmarks;
//    }
//
//    public void setBookmarks(Set<Bookmark> bookmarks) {
//        this.bookmarks = bookmarks;
//    }
}
