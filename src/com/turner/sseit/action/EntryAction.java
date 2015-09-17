package com.turner.sseit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.turner.sseit.model.Record;
import com.turner.sseit.util.DbUtil;

import java.sql.*;
import java.util.List;

public class EntryAction extends ActionSupport {

    private Record record;
    private static final long serialVersionUID = 1L;
    private String os;
    private String osVersion;
    private String notes;
    private Timestamp timestamp;
    private List<String> records;
    private Connection conn;

    @Override
    public String execute() throws SQLException {
        Connection conn;
        PreparedStatement ps;
        Statement stmt;
        ResultSet rs;
        conn = DbUtil.getConnection();

        try {

        // Execute a query
        System.out.println("Creating statement....");
        stmt = conn.createStatement();
        String sqlSelect = "SELECT * FROM sseitturner.entries";
        rs = stmt.executeQuery(sqlSelect);

//        String query = "INSERT INTO entries (os, osVersion, notes) VALUES ('OS X', '10.0.3', 'Note.')";
        String sqlInsert = "INSERT INTO sseitturner.entries (os, osVersion, notes) VALUES (?,?,?)";

            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, getOs());
            ps.setString(2, getOsVersion());
            ps.setString(3, getNotes());
            ps.executeUpdate();

            //  Extract data from result set
            while(rs.next()) {
                //Retrieve by column name
                int id  = rs.getInt("id");
                String os = rs.getString("os");
                String osVersion = rs.getString("osVersion");
                String notes = rs.getString("notes");
                Timestamp timestamp = rs.getTimestamp("timestamp");

                //  Display values
                System.out.println("ID: " + id);
                System.out.println("OS: " + os);
                System.out.println("OS Version: " + osVersion);
                System.out.println("Notes: " + notes);
                System.out.println("Timestamp: " + timestamp);
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



//
//

//
//            //  Extract data from result set
//            while(rs.next()) {
//                //Retrieve by column name
//                int id  = rs.getInt("id");
//                String os = rs.getString("os");
//                String osVersion = rs.getString("osVersion");
//                String notes = rs.getString("notes");
//                Timestamp timestamp = rs.getTimestamp("timestamp");
//
//                //  Display values
//                System.out.println("ID: " + id);
//                System.out.println("OS: " + os);
//                System.out.println("OS Version: " + osVersion);
//                System.out.println("Notes: " + notes);
//                System.out.println("Timestamp: " + timestamp);
//            }
                if (os != null && osVersion != null) {
                    return "success";
                } else {
                    return "input";
                }
//
    }


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

}
