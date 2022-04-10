package com.example.hometask;

public class Duty {

    private long id;
    private String dutyName;
    private DutyState dutyState;

    public Duty() {
    }

    public Duty(long id, String dutyName, DutyState dutyState) {
        this.id = id;
        this.dutyName = dutyName;
        this.dutyState = dutyState;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public DutyState getDutyState() {
        return dutyState;
    }

    public void setDutyState(DutyState dutyState) {
        this.dutyState = dutyState;
    }
}
