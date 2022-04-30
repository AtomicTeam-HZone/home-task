package com.example.hometask.duty;

public class Duty {

    private Long id;
    private String dutyName;
    private DutyState dutyState;

    private Long asignedUserId;

    public Duty() {
        this.dutyState = DutyState.TODO;
    }

    public Duty(Long id, String dutyName, DutyState dutyState) {
        this.id = id;
        this.dutyName = dutyName;
        this.dutyState = dutyState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getAsignedUserId() {
        return asignedUserId;
    }

    public void asignUser(Long asignedUserId){
        this.asignedUserId = asignedUserId;
    }
}
