package com.lawteam.lawinfo;

import java.io.Serializable;

/**
 * Created by nikitareutov on 06.04.2018.
 */

public class Person implements Serializable {
    private String name;
    private String urlPhoto;
    private String group;
    private String workingOn;
    private String description;

    Person(String _name, String _group, String _workingOn, String _urlPhoto, String _description){
        name = _name;
        group = _group;
        workingOn = _workingOn;
        urlPhoto = _urlPhoto;
        description = _description;
    }

    String getName(){
        return name;
    }
    String getGroup(){
        return group;
    }
    String getWorkingOn(){
        return workingOn;
    }
    String getUrlPhoto(){ return urlPhoto;}
    String getDescription() {return description;}
}
