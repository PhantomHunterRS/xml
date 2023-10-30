package com.phantom.xml.parser;

import java.sql.Date;
import java.time.LocalDate;

public class AdressObject {
    private long id;
    private long objectID;
    private String objectGuid;
    private long changeId;
    private String name;
    private String typename;
    private int level;
    private long operTypeID;
    private long prevID;
    private long nextID;
    private LocalDate updateDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private int isactual;
    private int isactive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getObjectID() {
        return objectID;
    }

    public void setObjectID(long objectID) {
        this.objectID = objectID;
    }

    public String getObjectGuid() {
        return objectGuid;
    }

    public void setObjectGuid(String objectGuid) {
        this.objectGuid = objectGuid;
    }

    public long getChangeId() {
        return changeId;
    }

    public void setChangeId(long changeId) {
        this.changeId = changeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getOperTypeID() {
        return operTypeID;
    }

    public void setOperTypeID(long operTypeID) {
        this.operTypeID = operTypeID;
    }

    public long getPrevID() {
        return prevID;
    }

    public void setPrevID(long prevID) {
        this.prevID = prevID;
    }

    public long getNextID() {
        return nextID;
    }

    public void setNextID(long nextID) {
        this.nextID = nextID;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getIsactual() {
        return isactual;
    }

    public void setIsactual(int isactual) {
        this.isactual = isactual;
    }

    public int getIsactive() {
        return isactive;
    }

    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

}
