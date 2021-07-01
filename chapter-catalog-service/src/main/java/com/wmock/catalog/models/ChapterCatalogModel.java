package com.wmock.catalog.models;

public class ChapterCatalogModel {

    private String name;
    private String desc;
    private Integer notes;

    public ChapterCatalogModel(String name, String desc, Integer notes) {
        this.name = name;
        this.desc = desc;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getNotes() {
        return notes;
    }

    public void setNotes(Integer notes) {
        this.notes = notes;
    }
}
