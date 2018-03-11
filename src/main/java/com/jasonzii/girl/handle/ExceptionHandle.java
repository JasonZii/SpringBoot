package com.jasonzii.girl.handle;

import com.jasonzii.girl.domain.Result;
import com.jasonzii.girl.exception.GirlException;
import com.jasonzii.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.3.9  20:57
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)  //声明捕获哪个异常类
    @ResponseBody    //返回json格式
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
            logger.error("【系统异常】{}",e);
            return ResultUtil.error(-1,"未知错误");
        }
        //service层抛出的异常传给controller，然后controller再往外抛，到这里捕获到，并交给ResultUtil处理
    }


}
