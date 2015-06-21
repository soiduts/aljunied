package aljunied.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aljunied.service.EventService;

@Controller
public class IndexController {

    @Autowired
    EventService eventService;

    @RequestMapping("/")
    // @ResponseBody
    public String index() {

        eventService.registSampleUsers();
        eventService.participate();

        return "index";
    }

    @RequestMapping("/post")
    public String post(@Valid IndexForm form, BindingResult bindingResult, Model model) {

//        eventService.regist();

        if (bindingResult.hasErrors()) {
            model.addAttribute("error", "エラーがありますよ！");
        } else {
            model.addAttribute("name", form.getName());
        }

        return "index";
    }

}
