package zone.webtraining.bookmarker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zone.webtraining.bookmarker.entities.Bookmark;
import zone.webtraining.bookmarker.models.BookmarksResponse;
import zone.webtraining.bookmarker.services.BookmarksService;

import java.util.Collection;

@Controller
@CrossOrigin
@RequestMapping("/bookmarks")
public class BookmarksController {

    @Autowired
    private BookmarksService bookmarksService;

    @GetMapping
    public ResponseEntity<BookmarksResponse> getAll() {
        Collection<Bookmark> bookmarkList = this.bookmarksService.getAll();
        BookmarksResponse bookmarksResponse = new BookmarksResponse(bookmarkList);

        return new ResponseEntity<BookmarksResponse>(bookmarksResponse, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bookmark> getSingle(@PathVariable int id) {
        Bookmark bookmark = this.bookmarksService.get((long) id);

        return new ResponseEntity<Bookmark>(bookmark, HttpStatus.OK);
    }

    @PostMapping(path = "/", consumes = "application/json")
    public ResponseEntity<Bookmark> create(@RequestBody Bookmark bookmark) {

        this.bookmarksService.create(bookmark);

        return new ResponseEntity<Bookmark>(bookmark, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bookmark> delete(@PathVariable int id) {
        Long idToDelete = (long) id;
        Bookmark bookmarkDeleted = this.bookmarksService.delete(this.bookmarksService.get(idToDelete));

        return new ResponseEntity<Bookmark>(bookmarkDeleted, HttpStatus.OK);
    }

    @PutMapping(path = "/{id}", consumes = "application/json")
    public ResponseEntity<Bookmark> update(@PathVariable int id, @RequestBody Bookmark bookmark) {
        Bookmark bookmarkUpdated = this.bookmarksService.update(bookmark);

        System.out.println("Update is invoked");
        System.out.println("ID:" + bookmark.getId());

        return new ResponseEntity<Bookmark>(bookmarkUpdated, HttpStatus.OK);
    }

//    public void setBookmarksService(BookmarksService bookmarksService) {
//        this.bookmarksService = bookmarksService;
//    }

}
