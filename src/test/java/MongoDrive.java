import com.mongodb.DBCursor;
import com.mongodb.MongoClientURI;
import databases.Queriable;

import java.util.function.Predicate;

public class MongoDrive implements Queriable<String> {

    private static final String uri = "";

    @Override
    public String findOne(Predicate predicate) {
        MongoClientURI clientURI = new MongoClientURI(uri);
        return null;
    }

    @Override
    public String[] find(Predicate predicate) {
        return new String[0];
    }
}
