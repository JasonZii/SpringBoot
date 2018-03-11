package com.jasonzii.girl.exception;

import com.jasonzii.girl.enums.ResultEnum;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.3.9  21:05
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
