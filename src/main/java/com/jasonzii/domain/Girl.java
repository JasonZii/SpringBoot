package com.jasonzii.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.3.9  03:08
 */
//这个注解表示，此类对应hibernate在数据库生成表
@Entity
public class Girl {

    @Id
    @GeneratedValue   //表示自增
    private Integer id;

    private String cupSize;

    @Min(value = 18,message = "未成年禁止")    //设定最小值
    private Integer age;

    public Girl() {                //必须有一个无参构造函数和所有getset
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
