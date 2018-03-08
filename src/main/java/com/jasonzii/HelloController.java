package com.jasonzii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.3.8  23:10
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

 //   @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id){

        return "id: " + id;

        //return girlProperties.getCupSize();
    }


}
