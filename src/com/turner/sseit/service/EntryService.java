package com.turner.sseit.service;

import com.turner.sseit.repository.EntryRepository;

public class EntryService {

    private EntryRepository entryRepository;

    public EntryService() {
        entryRepository = new EntryRepository();
    }

    public String save(String os, String osVersion, String notes) {
        entryRepository.save(os, osVersion, notes);
            return "Record successfully created.";
    }

}
