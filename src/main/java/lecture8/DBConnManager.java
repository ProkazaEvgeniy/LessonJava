package lecture8;

import org.h2.jdbcx.JdbcConnectionPool;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnManager {

    public static JdbcConnectionPool pool;

    public static Connection getConnection() {

        if (pool == null) {

            String dbHost = null;
            String dbLogin = null;
            String dbPassword = null;

            FileReader fileReader = null;
            Properties properties = new Properties();

            try {
//                fileReader = new FileReader("jdbc.properties");
//                properties.load(fileReader);

                dbHost = "jdbc:h2:tcp://localhost/~/test";//properties.getProperty("db.host");
                dbLogin = "sa";//properties.getProperty("db.login");
                dbPassword = ""; //properties.getProperty("db.password");
//            } catch (IOException e) {
//                System.out.println("blah");
            } finally {
                try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                } catch (IOException e) {
                    System.out.println("blah");
                }
            }

            pool = JdbcConnectionPool.create(dbHost, dbLogin, dbPassword);
        }

        try {
            return pool.getConnection();
        } catch (SQLException se) {
            return null;
        }
    }

    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException se) {
            System.out.println("blah");
        }
    }

}
