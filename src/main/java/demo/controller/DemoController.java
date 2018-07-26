package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/post")
    @ResponseBody
    public String post(){
        return "{\"appKey\":\"\",\"signature\":\" \",\"timestamp\":\"'\" ,\"sts\" :\"200\" }";
    }



}
