package zone.webtraining.bookmarker.models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private DateTime created;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private DateTime modified;

//    @OneToMany(mappedBy = "user")
//    private Set<Bookmark> bookmarks;


    public User() {
    }

    public User(Long id, String email, String password, DateTime created, DateTime modified) {
        this.id = id;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

//    public Set<Bookmark> getBookmarks() {
//        return bookmarks;
//    }
//
//    public void setBookmarks(Set<Bookmark> bookmarks) {
//        this.bookmarks = bookmarks;
//    }
}
