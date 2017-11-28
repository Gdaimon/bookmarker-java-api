package zone.webtraining.bookmarker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zone.webtraining.bookmarker.dao.UsersDao;
import zone.webtraining.bookmarker.entities.User;

import java.util.Collection;

@Service
public class MySQLUsersService implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Transactional(readOnly = true)
    public Collection<User> getAll() {
        return usersDao.getAll();
    }

    public User get(Long id) {
        return null;
    }

    @Transactional
    public User create(User user) {
        Long id = (Long) usersDao.create(user);
        return get(id);
    }

    public User update(User user) {
        return null;
    }

    public User delete(User user) {
        return null;
    }

    public void setUsersDao(UsersDao bookmarksDao) {
        this.usersDao = bookmarksDao;
    }
}
