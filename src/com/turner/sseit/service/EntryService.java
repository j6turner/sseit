package com.turner.sseit.service;

import com.turner.sseit.repository.EntryRepository;

import java.sql.SQLException;

public class EntryService {

    private EntryRepository entryRepository;

    public EntryService() {
        entryRepository = new EntryRepository();
    }

    public String addRecord(String os, String osVersion, String notes) {
        try {
            entryRepository.addRecord(os, osVersion, notes);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Record successfully created.";
    }

}
