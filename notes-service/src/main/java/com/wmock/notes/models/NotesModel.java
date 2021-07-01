package com.wmock.notes.models;

public class NotesModel {

    private String chapterId;
    private int notes;

    public NotesModel(String chapterId, int notes) {
        this.chapterId = chapterId;
        this.notes = notes;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }

}
