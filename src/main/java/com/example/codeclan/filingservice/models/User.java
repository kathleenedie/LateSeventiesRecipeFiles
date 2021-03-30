package com.example.codeclan.filingservice.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @Column(name = "folders")
//    private List<Folder> folders;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
//        this.folders = new ArrayList<Folder>();
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Folder> getFolders() {
//        return folders;
//    }
//
//    public void setFolders(List<Folder> folders) {
//        this.folders = folders;
//    }
//
//    public void addFolderToUser(Folder folder){
//        this.folders.add(folder);
//    }
}