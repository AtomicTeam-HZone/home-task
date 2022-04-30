package com.example.hometask.duty;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class DutyServiceImpl implements DutyService {

    private static Map<Long, Duty> duties = new HashMap<>();

    static {

        duties.put(1l, new Duty(1L, "Cleaning", DutyState.INPROGRESS));
        duties.put(2l, new Duty(2L, "Ironing", DutyState.DONE));
        duties.put(3l, new Duty(3L, "Shopping", DutyState.TODO));
    }

    @Override
    public List<Duty> findAll() {
        return new ArrayList<>(duties.values());
    }

    @Override
    public Duty getDuty(Long dutyId) {
        Duty maybeDuty = duties.get(dutyId);

        if (maybeDuty == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Actor Not Found");
        }

        return maybeDuty;
    }

    @Override
    public void asignDutyToUser(Long dutyId, Long userId) {
        // TODO implement method body
        Duty duty = getDuty(dutyId);
        duty.asignUser(userId);
        duties.put(dutyId, duty);
    }

    public List<Duty> addDuty(Duty duty) {
        duties.put(duties.size() + 1L, duty);
        return findAll();
    }
}
