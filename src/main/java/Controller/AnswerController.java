package Controller;

import Model.Answer;
import Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @GetMapping("/answer/register")

    public String getRegisterPage(Model model) {

        model.addAttribute("answer", new Answer());

        return "Answer-Form";
    }

    @PostMapping("/answer/register")
    public String Register(@ModelAttribute Answer answer){
        answerService.SaveAnswer(answer);
        return "redirect:/answer/register";
    }
    @RequestMapping(path = {"/answer/list", "/"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("answers", answerService.FindAll());
        return "answer-list";
    }
    @GetMapping("/answer/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Answer answer= answerService.FindAnswerById(id);
        model.addAttribute("answer", answer);

        return "Answer-Form";

    }
}
