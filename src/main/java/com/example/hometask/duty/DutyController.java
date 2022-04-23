package com.example.hometask.duty;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DutyController {

    private final DutyService dutyService;

    @GetMapping("/duties")
    public String getAllDuties(Model model){
        List<Duty> duties = dutyService.findAll();
        model.addAttribute("duties", duties);
        return "duties";
    }

    @GetMapping("/duties/{dutyId}")
    public String dutyDetails(@PathVariable Long dutyId, Model model){
        Duty dutyDetails = dutyService.getDuty(dutyId);
        //TODO: Pobrać użytkowników
        model.addAttribute("duty", dutyDetails);
        return "duty-details";
    }

//    @PostMapping("/duties/{dutyId}/assigments/{userId}")
//    public String dutyAssigment(@PathVariable Long dutyId, Model model){
//        Duty dutyDetails = dutyService.getDuty(dutyId);
//        model.addAttribute("duty", dutyDetails);
//        return "redirect:/duties";
//    }
}
