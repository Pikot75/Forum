package by.webproject.forum.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPConnectionPool implements ConnectionPool{
  //  private static final HikariConfig CONFIG = new HikariConfig();

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }
}
