package Controller;


import Service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import Model.Voter;

@Controller
public class VoterController {
    @Autowired
    private VoterService voterService;
    @GetMapping("/voter/register")

    public String getRegisterPage(Model model) {

        model.addAttribute("voter", new Voter());

        return "Voter-Form";
    }
    @PostMapping("/voter/register")
    public String Register(@ModelAttribute Voter voter){
      voterService.SaveVoter(voter);
        return "redirect:/voter/register";
    }
    @RequestMapping(path = {"/voter/list", "/"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("voters", voterService.FindAll());
        return "voter-list";
    }
    @GetMapping("/voter/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
       Voter voter = voterService.FindVoterById(id);
        model.addAttribute("voter", voter);

        return "Voter-Form";

    }


}
