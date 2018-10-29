package com.test.springboot01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxuan
 * @date 2018/10/29
 * @time 20:04
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("index")
    public String index() {
        return "hello springBoot";
    }

    @RequestMapping("login")
    @ResponseBody
    public Object login() {
        Map map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","19");
        return map;
    }
}
