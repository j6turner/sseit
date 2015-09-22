package com.turner.sseit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="entries")
public class Record {

    private int id;
    private String os;
    private String osVersion;
    private String notes;
    private Timestamp timestamp;

    @GeneratedValue

    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Column(name="osVersion")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Column(name="notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name="timestamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}
