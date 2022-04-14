package com.example.hometask.duty;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DutyServiceImpl implements DutyService{

    @Override
    public List<Duty> findAll() {
        List<Duty> dutyList = new ArrayList<>();
        dutyList.add(new Duty(1L, "Cleaning", DutyState.INPROGRESS));
        dutyList.add(new Duty(2L, "Ironing", DutyState.DONE));
        dutyList.add(new Duty(3L, "Shopping", DutyState.TODO));
        return dutyList;
    }



}
