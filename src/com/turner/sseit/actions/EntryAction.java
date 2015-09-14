package com.turner.sseit.actions;

import com.turner.sseit.actions.model.Record;

public class EntryAction {

    private Record record;
    private String os;
    private String osVersion;
    private String notes;

    public String execute() throws Exception {
        return "success";
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
