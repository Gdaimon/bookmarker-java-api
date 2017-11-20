package zone.webtraining.bookmarker.services;

import org.joda.time.DateTime;
import zone.webtraining.bookmarker.models.Bookmark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MySQLBookmarksService implements BookmarksService {
    public Collection<Bookmark> getAll() {
        List<Bookmark> list = new ArrayList<Bookmark>();

        list.add(this.get(1));
        list.add(this.get(2));
        list.add(this.get(3));
        return list;
    }

    public Bookmark get(int id) {
        return new Bookmark(id, 1,
                "Webtraining.Zone",
                "Plataforma para ayudar",
                "https://webtraining.zone/",
                new DateTime(),
                new DateTime());
    }
}
