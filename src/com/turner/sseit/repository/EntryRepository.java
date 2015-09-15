package com.turner.sseit.repository;

import com.turner.sseit.model.Record;
import com.turner.sseit.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntryRepository {

    private Connection conn;

    public EntryRepository() {
        conn = DbUtil.getConnection();
    }

    public void addRecord(Record record) throws SQLException {
        if (conn != null) {
            try {
                String query = ("INSERT INTO entries (os, osVersion, notes) VALUES (os:VARCHAR, osVersion:VARCHAR , notes:VARCHAR)");
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, record.getOs());
                ps.setString(2, record.getOsVersion());
                ps.setString(3, record.getNotes());
                ps.executeBatch();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
