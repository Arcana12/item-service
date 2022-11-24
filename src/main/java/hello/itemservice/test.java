package hello.itemservice;

import hello.itemservice.domain.item.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class test {

    @PostMapping(name = "/join")
    public String join(@ModelAttribute Item a, Model model){



        return "joinForm";
    }

}
