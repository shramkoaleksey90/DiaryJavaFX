package com.dimonandpumba.diary.dto;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Record {
    private final String subject;
    private final String exposition;

    public Record(String subject, String exposition) {
        this.subject = subject;
        this.exposition = exposition;
    }

    public String getSubject() {
        return subject;
    }

    public String getExposition() {
        return exposition;
    }

    @Override
    public String toString() {
        return String.format("subject = %s  exposition = %s", subject, exposition);
    }
}
