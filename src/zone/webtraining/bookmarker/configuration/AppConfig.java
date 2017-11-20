package zone.webtraining.bookmarker.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import zone.webtraining.bookmarker.services.BookmarksService;
import zone.webtraining.bookmarker.services.DummyBookmarksService;


@Configuration
public class AppConfig {

    @Bean
    @Profile("default")
    public BookmarksService bookmarksService() {
        return new DummyBookmarksService();
    }

}
