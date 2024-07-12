package ilp037.creational.singleton;

import java.util.logging.Logger;

public class App {
    static Logger log = Logger.getLogger("arquivo-unico");

    public static void main(String[] args) {
        Database db1 = new Database();
        db1.getConnection();
        log.info(Integer.toString(Connection.counter));

        Database db2 = new Database();
        db2.getConnection();
        log.info(Integer.toString(Connection.counter));

        Connection c1 = Connection.getInstance();
        log.info(Integer.toString(Connection.counter));
    }

}
