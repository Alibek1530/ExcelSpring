package com.ali.excel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ali")
public class Tutorial {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    public Tutorial() {
    }
    public Tutorial(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + "]";
    }
}
