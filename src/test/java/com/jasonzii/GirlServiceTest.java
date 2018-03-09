package com.jasonzii;

import com.jasonzii.domain.Girl;
import com.jasonzii.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.3.9  22:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest           //表示将启动整个spring的工程
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        Girl girl = girlService.findOne(1);
        //断言相同，两个参数都是object，拿第一个参数和第二个比较是否相同
        Assert.assertEquals(new Integer(18),girl.getAge());
    }
}
