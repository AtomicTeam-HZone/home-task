package com.example.hometask.duty;

import com.example.hometask.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DutyController {

    private final DutyService dutyService;
    private final UserService userService;

    @GetMapping("/duties")
    public String getAllDuties(Model model) {
        List<Duty> duties = dutyService.findAll();
        model.addAttribute("duties", duties);
        return "duties";
    }

    @GetMapping("/duties/{dutyId}")
    public String dutyDetails(@PathVariable Long dutyId, Model model) {
        Duty dutyDetails = dutyService.getDuty(dutyId);
        model.addAttribute("users", userService.findAll());
        model.addAttribute("duty", dutyDetails);
        model.addAttribute("asignment", new DutyAsignmentForm(dutyDetails.getAsignedUserId()));
        return "duty-details";
    }

    @PostMapping("/duties/{dutyId}/asignments/")
    public String dutyAssigment(@PathVariable Long dutyId, @ModelAttribute("asignment") DutyAsignmentForm asignment, BindingResult result){
        dutyService.asignDutyToUser(dutyId, asignment.getUserId());
        return "redirect:/duties";
    }

//    @RequestMapping(value="/people/new", method = RequestMethod.POST)
//    public String insertData(ModelMap model,
//                             @ModelAttribute("person") @Valid PersonForm person,
//                             BindingResult result) {
//        if (!result.hasErrors()) {
//            personService.save(person);
//        }else {
//            return "add";
//        }
//        return "redirect:/people";
//    }
}
