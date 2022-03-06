package com.xkz.controller;


import com.xkz.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.Normalizer;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/03/01/19:48:32
 * @Description:
 */
@Controller
@Service
@RequestMapping("/usercontroller")
public class UserController {

    @PostMapping("/user")
    @ResponseBody
    public String queryform(String username, String password, String sex, Integer age, @RequestParam List<String> aihao){
        String data = username+"\n"+
                password+"\n"+
                sex+"\n"+
                age+"\n"+
                aihao;
        System.out.println(data);
        return data;
    }

    @GetMapping("/mav")
    public String modeAndView(Form form, Model model){
        form.setUsername("123456789");
        form.setPassword("123456789");
        model.addAttribute("form", form);
        return "modeAndView";
    }
}
