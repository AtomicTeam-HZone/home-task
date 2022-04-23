package com.example.hometask.duty;

import java.util.List;

public interface DutyService {

    List<Duty> findAll();

    Duty getDuty(Long dutyId);
}
