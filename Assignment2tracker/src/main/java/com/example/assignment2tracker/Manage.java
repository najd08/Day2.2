package com.example.assignment2tracker;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.SupportedAnnotationTypes;

@Data @SupportedAnnotationTypes({})
@NoArgsConstructor
public class Manage {
    private String id;

    private String name;

    private String description;

    private boolean Status;

    public Manage(){

    }

    public void setManage(String id, String name, String description, boolean Status) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.Status = Status;
    }


}


