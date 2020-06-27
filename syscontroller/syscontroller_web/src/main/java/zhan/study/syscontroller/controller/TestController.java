package zhan.study.syscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhan.study.syscontroller.domain.UserTest;
import zhan.study.syscontroller.service.TestService;

import javax.annotation.Resource;

/**
 * @author
 * @date : Created in 2020/6/2714:59
 * @description: ${description}
 * @version: 1.0.0$
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/quick")
    public String quick(){
        return "springboot start";
    }

    @GetMapping("/quick2")
    public UserTest query(){
        System.out.println("开始查询");
        UserTest userTest = testService.query();
        System.out.println(userTest);
        return userTest;
    }

}
