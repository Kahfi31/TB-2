package com.example.journaldev.tb2_moprog.model;

public class TableRowCount {
    private long studentRow;
    private long subjectRow;
    private long takenSubjectRow;

    public TableRowCount(long studentRow, long subjectRow, long takenSubjectRow) {
        this.studentRow = studentRow;
        this.subjectRow = subjectRow;
        this.takenSubjectRow = takenSubjectRow;
    }

    public long getStudentRow() {
        return studentRow;
    }

    public long getSubjectRow() {
        return subjectRow;
    }

    public long getTakenSubjectRow() {
        return takenSubjectRow;
    }
}
