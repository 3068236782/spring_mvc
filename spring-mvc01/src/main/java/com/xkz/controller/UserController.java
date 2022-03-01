package com.xkz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/03/01/19:48:32
 * @Description:
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String save(){
        return "helloworld";
    }

}
