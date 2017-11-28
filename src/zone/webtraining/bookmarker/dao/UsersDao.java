package zone.webtraining.bookmarker.dao;

import zone.webtraining.bookmarker.entities.User;

import java.io.Serializable;
import java.util.Collection;

public interface UsersDao {
    Collection<User> getAll();

    User get(Long id);

    Serializable create(User bookmark);

    User update(User bookmark);

    User delete(User bookmark);
}
