package com.turner.sseit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.turner.sseit.model.Record;
import com.turner.sseit.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
//import java.sql.Statement;

public class EntryAction extends ActionSupport {

    private Record record;
    private String os;
    private String osVersion;
    private String notes;
    private Connection conn;

    @Override
    public String execute() throws SQLException {
        Connection conn;
        conn = DbUtil.getConnection();
        if (os != null && osVersion != null) {
            return "success";
        } else {
            return "input";
        }
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
