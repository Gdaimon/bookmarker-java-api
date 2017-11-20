package zone.webtraining.bookmarker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import zone.webtraining.bookmarker.models.Bookmark;
import zone.webtraining.bookmarker.services.BookmarksService;

import java.util.Collection;

@Controller
@RequestMapping("/bookmarks")
public class BookmarksController {

    private BookmarksService bookmarksService;

    @GetMapping
    public ResponseEntity<Collection<Bookmark>> getAll() {
        Collection<Bookmark> bookmarkList = this.bookmarksService.getAll();

        return new ResponseEntity<Collection<Bookmark>>(bookmarkList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bookmark> create() {
        Bookmark bookmark = this.bookmarksService.get(1);

        return new ResponseEntity<Bookmark>(bookmark, HttpStatus.CREATED);
    }

    public void setBookmarksService(BookmarksService bookmarksService) {
        this.bookmarksService = bookmarksService;
    }

}
