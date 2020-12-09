package com.cm.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈萌
 * @version 1.0
 * @date 2020/12/8 13:48
 */
@Controller
public class LoginController {

    @RequestMapping("/shouFengQin")
    public String shouFengQin () {
        return "shouFengQin";
    }
    @RequestMapping("/shouFengQin1")
    public String shouFengQin1 () {
        return "shouFengQin1";
    }

}
