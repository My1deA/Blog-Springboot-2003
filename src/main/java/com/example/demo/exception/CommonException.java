package com.example.demo.exception;

import com.example.demo.result.ResultEnum;

public class CommonException extends RuntimeException{
    private Integer code;

    public CommonException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public CommonException(){
        super(ResultEnum.ERROR.getMessage());
        this.code= ResultEnum.ERROR.getCode();
    }

}
