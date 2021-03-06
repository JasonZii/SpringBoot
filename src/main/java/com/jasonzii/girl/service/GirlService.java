package com.jasonzii.girl.service;

import com.jasonzii.girl.domain.Girl;
import com.jasonzii.girl.enums.ResultEnum;
import com.jasonzii.girl.exception.GirlException;
import com.jasonzii.girl.repository.GirlRepository;
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
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findById(id).get();
        Integer age = girl.getAge();
        if (age < 10) {
            //返回“你还在上小学把” code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16) {
            //返回”你可能还在上初中“ code=101
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

        //...
    }

    /**
     * 通过id查询一个女生的信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findById(id).get();
    }
}

