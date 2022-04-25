package com.example.hometask.duty;

import java.util.Objects;

public class DutyAsignmentForm {

    private Long userId;

    public DutyAsignmentForm() {
    }

    public DutyAsignmentForm(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DutyAsignmentForm that = (DutyAsignmentForm) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
