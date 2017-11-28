package zone.webtraining.bookmarker.services;

import zone.webtraining.bookmarker.dao.UsersDao;
import zone.webtraining.bookmarker.entities.User;

import java.util.Collection;

// Business Object UsersBO
public interface UsersService {
    Collection<User> getAll();

    User get(Long id);

    User create(User user);

    User update(User user);

    User delete(User user);

    void setUsersDao(UsersDao usersDao);
}
