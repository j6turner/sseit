package com.turner.sseit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.turner.sseit.model.Record;
import com.turner.sseit.util.DbUtil;

import java.sql.*;
import java.util.ArrayList;

public class EntryAction extends ActionSupport {

    private String os;
    private String osVersion;
    private String notes;

    ArrayList<Record> list = new ArrayList<Record>();

    public String execute() throws SQLException {
        Connection conn;
        conn = DbUtil.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        Statement stmt;


        try {

            // Execute query
            System.out.println("Creating statement....");
            stmt = conn.createStatement();
            String sqlSelect = "SELECT * FROM sseitturner.entries";
            rs = stmt.executeQuery(sqlSelect);
            String sqlInsert = "INSERT INTO sseitturner.entries (os, osVersion, notes) VALUES (?,?,?)";
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, getOs());
            ps.setString(2, getOsVersion());
            ps.setString(3, getNotes());
            ps.executeUpdate();

            while (rs.next()) {
                Record record = new Record();
                record.setId(rs.getInt("id"));
                record.setOs(rs.getString("os"));
                record.setOsVersion(rs.getString("osVersion"));
                record.setNotes(rs.getString("notes"));
                record.setTimestamp(rs.getTimestamp("timestamp"));
                list.add(record);
            }

            return "success";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // Validation
        if (os != null && osVersion != null) {
            return "success";
        } else {
            return "input";
        }

    }

    //  Getters and setters
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<Record> getList() {
    return list;
    }

    public void setList(ArrayList<Record> list) {
        this.list = list;
    }

}
