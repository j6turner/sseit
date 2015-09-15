package com.turner.sseit.repository;

import com.turner.sseit.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntryRepository {

    private Connection conn;

    public EntryRepository() {
        conn = DbUtil.getConnection();
    }

    public void addRecord(String os, String osVersion, String notes) throws SQLException {
        if (conn != null) {
            try {
                String query = ("INSERT INTO entries (os, osVersion, notes) VALUES (os:VARCHAR, osVersion:VARCHAR , notes:VARCHAR)");
                PreparedStatement ps = conn.prepareStatement(query);
                //noinspection JpaQueryApiInspection
                ps.setString(1, os);
                //noinspection JpaQueryApiInspection
                ps.setString(2, osVersion);
                //noinspection JpaQueryApiInspection
                ps.setString(3, notes);
                ps.executeBatch();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
