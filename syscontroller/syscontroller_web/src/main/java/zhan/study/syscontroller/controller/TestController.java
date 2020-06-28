package zhan.study.syscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import zhan.study.syscontroller.domain.UserTest;
import zhan.study.syscontroller.service.TestService;

/**
 * @author
 * @date : Created in 2020/6/2714:59
 * @description: ${description}
 * @version: 1.0.0$
 */
@RestController
@RequestMapping()
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/index")
    public ModelAndView quick(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/quick2")
    public UserTest query(){
        System.out.println("开始查询");
        UserTest userTest = testService.query();
        System.out.println(userTest);
        return userTest;
    }

}
