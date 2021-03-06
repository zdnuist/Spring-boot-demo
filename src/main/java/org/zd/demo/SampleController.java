package org.zd.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World!";
//    }


    @RequestMapping("/boot")
    @ResponseBody
    String home2(){
        logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.info("I am info log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.");
        return "{\"a\":\"b\"}";
    }

    @GetMapping(value = "/greeting" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "world" ) String name, Model model){
        model.addAttribute("name" , name);
        return "greeting";
    }

    @RequestMapping("/page")
    public String page(){
        return "bootpage";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
//    }
}