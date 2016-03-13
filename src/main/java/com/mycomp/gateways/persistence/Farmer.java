package com.mycomp.gateways.persistence;

import org.springframework.data.annotation.Id;

/**
 * Created by spadhi on 13/03/16.
 */

public class Farmer {

    @Id
    private String id;
    private String fname;
    private String lname;
    private String adress;


    public Farmer(){}


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
