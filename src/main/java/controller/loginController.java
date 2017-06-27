package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 吴娜 on 2017/6/27.
 */
@Controller

public class loginController {

    @RequestMapping("/toLogin")
    public String doLogin(@RequestParam("name") String name,@RequestParam("password") String password, Model model){
        if(name=="zhangtao@13.com")
            return "student_main";
        else
            return "teacher_main";
    }
}
