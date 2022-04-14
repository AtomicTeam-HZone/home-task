package com.example.hometask.duty;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
