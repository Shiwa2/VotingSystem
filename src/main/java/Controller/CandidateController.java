package Controller;

import Model.Candidate;
import Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidate/register")

    public String getRegisterPage(Model model) {

        model.addAttribute("answer", new Candidate());

        return "Candidate-Form";
    }

    @PostMapping("/candidate/register")
    public String Register(@ModelAttribute Candidate candidate){
        candidateService.SaveCandidate(candidate);
        return "redirect:/candidate/register";
    }
    @RequestMapping(path = {"/candidate/list", "/"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("candidates", candidateService.FindAll());
        return "candidate-list";
    }
    @GetMapping("/candidate/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Candidate candidate= candidateService.FindCandidateById(id);
        model.addAttribute("candidate", candidate);

        return "Candidate-Form";

    }
}
