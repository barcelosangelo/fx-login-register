package org.academiadecodigo.bootcamp.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    private int id;
    private String location;
    private Date startDate;
    private Date endDate;
    private Set<CodeCadet> codecadets = new HashSet<CodeCadet>();



    public Bootcamp(int id, String location, Date startDate, Date endDate) {
        this.id = id;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addCadet(CodeCadet codeCadet){
        codecadets.add(codeCadet);
    }

    public int getId() {
        return id;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCodecadets(Set<CodeCadet> codecadets) {
        this.codecadets = codecadets;
    }

}
