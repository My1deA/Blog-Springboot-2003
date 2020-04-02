package com.example.demo.result;

//用于返回具体result对象
public class ResultUtil{

    //返回成功状态码和消息以及数据
    public static Result success(Object data){
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMessage(),data);
    }

    //返回错误状态码和消息以及数据
    public static Result error(Object data){
        return new Result(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getMessage(),data);
    }
}
