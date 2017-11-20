package zone.webtraining.bookmarker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zone.webtraining.bookmarker.controllers.BookmarksController;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public BookmarksController bookmarksController() {
        BookmarksController bookmarksController = new BookmarksController();

        return bookmarksController;
    }
}
