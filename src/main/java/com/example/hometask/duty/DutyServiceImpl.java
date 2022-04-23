package com.example.hometask.duty;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DutyServiceImpl implements DutyService {
    private static List<Duty> dutyList = new ArrayList<>();

    static {
        dutyList.add(new Duty(1L, "Cleaning", DutyState.INPROGRESS));
        dutyList.add(new Duty(2L, "Ironing", DutyState.DONE));
        dutyList.add(new Duty(3L, "Shopping", DutyState.TODO));
    }

    @Override
    public List<Duty> findAll() {
        return dutyList;
    }

    @Override
    public Duty getDuty(Long dutyId) {
        Optional<Duty> maybeDuty = dutyList.stream().filter(d -> d.getId().equals(dutyId)).findFirst();
        if(maybeDuty.isEmpty()){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Actor Not Found");
        }

        return maybeDuty.get();
    }


}
