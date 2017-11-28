package zone.webtraining.bookmarker.models;

import zone.webtraining.bookmarker.entities.User;

import java.util.Collection;

public class UsersResponse {
    private Collection<User> users;

    public UsersResponse() {
    }

    public UsersResponse(Collection<User> users) {
        this.users = users;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
