package com.neoteric.november.november.privateconstructor;

public class PrivateVarbles {
    public String name;
    public String fatherName;
    public String motherName;
    public String number;
    public String proof;


    private PrivateVarbles(String name, String fatherName, String motherName, String number) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.number = number;
    }


    public static PrivateVarbles getInstance(String name, String fatherName, String motherName, String number) {

        return new PrivateVarbles(name,fatherName,motherName,number);
    }
}
