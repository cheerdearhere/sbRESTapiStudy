package com.example.restfulwebservice.exception;
//ControllerAdvice: 모든 컨트롤러 실행시 적용
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
//handler표시
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    //ExceptionResponse class의 filed 생성자
//    @ExceptionHandler(Exception.class)//Exception처리 표시
//    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){
//        ExceptionResponse exceptionResponse =
//                new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
//        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);//code: 500
//    }
 /* 두 ExceptionHandler가 모두 전체 예외를 관리하면 모호성이 짙어져 에러발생. 세분화하여 사용을 권장함*/
    //사용자 못찾음
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleUserNotFoundExceptions(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);//code: 400
    }
}
