package zhan.study.syscontroller.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author
 * @date : Created in 2020/6/2714:45
 * @description: ${description}
 * @version: 1.0.0$
 */
@Table(name = "usertest")
@Data
public class UserTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    @Column(name = "username")
    private String username;

    @Column(name = "userpassword")
    private String userpassword;

}
