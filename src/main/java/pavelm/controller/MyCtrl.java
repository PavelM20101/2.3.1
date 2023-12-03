package pavelm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pavelm.entity.User;
import pavelm.service.CarService;
import pavelm.service.UserService;

import java.util.List;

@Controller
public class MyCtrl {
    @Autowired
    private UserService userService;
    @Autowired
    private CarService carService;
    @RequestMapping("/users")
    public String getAllUsers(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "all-users";
    }
    @RequestMapping("/users{id}")
    public String getUser(@PathVariable int id, Model model){
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "all-users";
    }
    @RequestMapping("/addNewUser")
    public String addNewUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "user-info";
    }
    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam("userId") int id, Model model){
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user-info";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId") int id){
        userService.deleteUser(id);
        return "redirect:/users";
    }
}