package com.neoteric.november.november.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private String marks;


    private List<Subject> subjectList=new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String id) {
        this.marks = id;
    }
    public void add(){

    }
}
