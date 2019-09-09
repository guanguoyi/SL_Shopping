package com.sy.controller.ggy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @RequestMapping("aa")
    public String test(){
        return "html/aaa";
    }
}
