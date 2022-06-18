package com.edwin.app.controller;

public class DocumentType {
    private Integer id;
    private String description;
    private int serie;

    public DocumentType() {
    }

    public DocumentType(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

}