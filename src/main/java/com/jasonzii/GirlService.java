package com.jasonzii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.3.9  04:05
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional            //事物注解
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }
}
