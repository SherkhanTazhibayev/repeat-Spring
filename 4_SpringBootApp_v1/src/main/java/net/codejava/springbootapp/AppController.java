package net.codejava.springbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("AppController->welcome()");
        return "index";
    }

    @RequestMapping("/list_contact")
    public String listContact(Model model){
        ContactBusiness business = ContactBusiness();
        List<Contact> contactList = business.getContactList();

        model.addAttribute("contacts", "contactList");

        return "contact";
    }
}
