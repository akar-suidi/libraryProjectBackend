package com.akar_dev.project.Controller;


import com.akar_dev.project.ServiceImplementation.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    BookServiceImpl bookServiceimpl;
    @GetMapping("/home")
    private String homePage(Model model){
//        model.addAttribute("" , bookServiceimpl.retrieveBook());
        return "home_page";
    }


}
