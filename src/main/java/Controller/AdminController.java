package Controller;

import Service.AdminService;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import Model.Admin;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/Admin/register")

    public String getRegisterPage(Model model) {

        model.addAttribute("admin", new Admin());

        return "Admin-Form";
    }

    @PostMapping("/admin/register")
    public String Register(@ModelAttribute Admin admin){
        adminService.SaveAdmin(admin);
        return "redirect:/admin/register";
    }
    @RequestMapping(path = {"/admin/list", "/"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("admins", adminService.FindAll());
        return "admin-list";
    }
    @GetMapping("/admin/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Admin admin= adminService.FindAdminById(id);
        model.addAttribute("admin", admin);

        return "Admin-Form";

    }
}
