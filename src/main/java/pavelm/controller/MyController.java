package pavelm.controller;//package com.pavelm.kata.laerning.controller;
//
//import com.pavelm.kata.laerning.entity.Car;
//import com.pavelm.kata.laerning.entity.User;
//import com.pavelm.kata.laerning.service.CarService;
//import com.pavelm.kata.laerning.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//@Controller
//public class MyController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private CarService carService;
//    @GetMapping("/users")
//    public String showAllUsers(Model model){
//        List<User> userList = userService.getAllUsers();
//        model.addAttribute("allUsers", userList);
//        return "all-users";
//    }
//    @RequestMapping("/users{id}")
//    public String showUserById(@PathVariable int id, Model model){
//        User user = userService.getUser(id);
//        model.addAttribute("user", user);
//        return "show-user-info";
//    }
//    @RequestMapping("/addNewUser")
//    public String addNewUser(Model model){
//        User user = new User();
//        model.addAttribute("newUser",user);
//        return "save-user";
//    }
//    //ДОРАБОТАТЬ !!!!!!!!!
//    //СОХРАНЯЕТ НОВОГО РАБОТНИКА С НОВЫМ id НЕ ЗНАЮ ПОЧЕМУ. РАЗОБРАТЬСЯ
//    @RequestMapping("/saveNewUser")
//    public String saveNewUser(@ModelAttribute("newUser") User user){
//        userService.saveUser(user);
//        return "redirect:/users";
//    }
//    @RequestMapping("/saveUser")
//    public String saveUser(@ModelAttribute("newUser") User user){
//        userService.saveUser(user);
//        return "redirect:/users";
//    }
//
//    @RequestMapping("deleteUser")
//    public String deleteUser(@RequestParam("userId") int id){
//        userService.deleteUser(id);
//        return "redirect:/users";
//    }
//    @RequestMapping("/updateUser")
//    public String updateUser(@RequestParam("userId") int id, Model model){
//        User user = userService.getUser(id);
//        model.addAttribute("newUser", user);
//        return "save-user";
//    }
//    //ДО СЮДА
//    /*------------------------------------------------------------------------------------------------------------*/
//    @RequestMapping("/cars")
//    public String showAllCars(Model model){
//        List<Car> carList = carService.getAllCars();
//        model.addAttribute("allCars", carList);
//        return "all-cars";
//    }
//    @RequestMapping("/cars{id}")
//    public String showCarById(@PathVariable int id, Model model){
//        Car car = carService.getCar(id);
//        model.addAttribute("car", car);
//        return "show-car-info";
//    }
//
//}
