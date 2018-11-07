package com.dimonandpumba.diary.javafx.DAO;

public class Record {
    private String subject;
    private String exposition;

    public Record(String subject, String exposition) {
        this.subject = subject;
        this.exposition = exposition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExposition() {
        return exposition;
    }

    public void setExposition(String exposition) {
        this.exposition = exposition;
    }
}
