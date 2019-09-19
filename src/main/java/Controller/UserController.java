package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import Model.User;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/register")

    public String getRegisterPage(Model model) {

        model.addAttribute("user", new User());

        return "User-Form";
    }

    @PostMapping("/user/register")
    public String Register(@ModelAttribute User user){
        userService.SaveUser(user);
        return "redirect:/user/register";
    }

    @RequestMapping(path = {"/user/list", "/"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("users", userService.FindAll());
        return "user-list";
    }

    @GetMapping("/student/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        User user = userService.FindUserById(id);
        model.addAttribute("user", user);

        return "User-Form";

    }

}
