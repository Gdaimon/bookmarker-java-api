package zone.webtraining.bookmarker.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import zone.webtraining.bookmarker.daos.BookmarksDao;
import zone.webtraining.bookmarker.daos.BookmarksDaoImpl;
import zone.webtraining.bookmarker.services.BookmarksService;
//import zone.webtraining.bookmarker.services.DummyBookmarksService;
import zone.webtraining.bookmarker.services.MySQLBookmarksService;


@Configuration
public class AppConfig {

    @Bean
    @Profile("default")
    public BookmarksService bookmarksService() {

        // return new DummyBookmarksService();

        BookmarksDao bookmarksDao = new BookmarksDaoImpl();



        BookmarksService bookmarksService = new MySQLBookmarksService();

        bookmarksService.setBookmarksDao(bookmarksDao);

        return bookmarksService;
    }

}
