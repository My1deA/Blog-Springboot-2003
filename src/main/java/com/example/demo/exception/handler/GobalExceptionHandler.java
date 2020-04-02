package com.example.demo.exception.handler;

import com.example.demo.exception.CommonException;
import com.example.demo.result.Result;
import com.example.demo.result.ResultEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GobalExceptionHandler {

    @ExceptionHandler({CommonException.class})
    public Result CommonExceptionHandler(HttpServletRequest req, CommonException e) throws Exception {
        e.printStackTrace();
        Result result = new Result(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMessage());
        return result;
    }
}
