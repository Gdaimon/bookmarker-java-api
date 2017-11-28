package zone.webtraining.bookmarker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import zone.webtraining.bookmarker.entities.User;
import zone.webtraining.bookmarker.models.UsersResponse;
import zone.webtraining.bookmarker.services.UsersService;

import java.util.Collection;

@Controller
@CrossOrigin
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public ResponseEntity<UsersResponse> getAll() {
        Collection<User> usersList = this.usersService.getAll();
        UsersResponse usersResponse = new UsersResponse(usersList);


        return new ResponseEntity<UsersResponse>(usersResponse, HttpStatus.OK);
    }
}
