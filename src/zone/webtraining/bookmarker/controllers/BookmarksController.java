package zone.webtraining.bookmarker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookmarks")
public class BookmarksController {

    @GetMapping
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<String>("Bookmarks all", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> create() {
        return new ResponseEntity<String>("Bookmark created", HttpStatus.CREATED);
    }

}
