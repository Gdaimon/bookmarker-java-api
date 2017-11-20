package zone.webtraining.bookmarker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookmarksController {

    @RequestMapping(name = "bookmarks", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }
}
