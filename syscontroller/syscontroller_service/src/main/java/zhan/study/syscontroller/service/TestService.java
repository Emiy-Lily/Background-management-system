package zhan.study.syscontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhan.study.syscontroller.domain.UserTest;
import zhan.study.syscontroller.mapper.UserTestMapper;

/**
 * @author
 * @date : Created in 2020/6/2715:43
 * @description: ${description}
 * @version: 1.0.0$
 */
@Service
public class TestService {

    @Autowired
    private UserTestMapper userTestMapper;

    public UserTest query(){
        System.out.println("开始查询");
        UserTest userTest = userTestMapper.selectByPrimaryKey(1);
        System.out.println(userTest);
        return userTest;
    }

}
