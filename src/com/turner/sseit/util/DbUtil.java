package com.turner.sseit.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DbUtil {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn != null) {
            return conn;
        } else {
            try {
                InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("db.properties");
                Properties properties = new Properties();
                properties.load(inputStream);

                String dbDriver = properties.getProperty("dbDriver");
                String connectionUrl = properties.getProperty("connectionUrl");
                String user = properties.getProperty("user");
                String password = properties.getProperty("");

                Class.forName(dbDriver).newInstance();
                conn = DriverManager.getConnection(connectionUrl, user, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
        }
    }

}
