package com.phantom.xml.parser;

import java.time.LocalDate;

public class AdmHierarchy {
    private long id;

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

    public long getParentObjID() {
        return parentObjID;
    }

    public void setParentObjID(long parentObjID) {
        this.parentObjID = parentObjID;
    }

    public long getChangeId() {
        return changeId;
    }

    public void setChangeId(long changeId) {
        this.changeId = changeId;
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

    public int getIsactive() {
        return isactive;
    }

    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

    private long objectID;
    private long parentObjID;
    private long changeId;
    private long prevID;
    private long nextID;
    private LocalDate updateDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private int isactive;
}
