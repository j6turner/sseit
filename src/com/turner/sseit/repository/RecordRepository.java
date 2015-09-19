package com.turner.sseit.repository;

import com.turner.sseit.model.Record;
import com.turner.sseit.util.DbUtil;

import java.sql.*;
import java.util.ArrayList;

public class RecordRepository {
    private Connection conn;

    public RecordRepository() {
        conn = DbUtil.getConnection();
    }

    private final String sqlInsert = "insert into sseitturner.entries values (?,?,?)";
    private final String sqlSelect = "select * from sseitturner.entries";

    public void insertRecord(Record record) {
        try {
            sqlInsert(record);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void extractRecord(Record record) {
        try {
            sqlSelect(record.getRecordList());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void sqlSelect(ArrayList<Record> recordList) throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        try {
            conn = DbUtil.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlSelect);
            while (rs.next()) {
                Record newRecord = new Record();
                newRecord.setOs(rs.getString("os"));
                newRecord.setOsVersion("osVersion");
                newRecord.setNotes("notes");
                recordList.add(newRecord);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private void sqlInsert(Record record) throws SQLException, ClassNotFoundException {
        conn = DbUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlInsert);
        ps.setString(1, record.getOs());
        ps.setString(2, record.getOsVersion());
        ps.setString(3, record.getNotes());
        ps.executeUpdate();
    }

}
