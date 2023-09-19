package com.example.web0919.controller.calculator;

import com.example.web0919.dto.calculator.request.CalculatorRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    //파라미터를 통해 값 전달 후 값 받아오기  + dto 이용
    @GetMapping("/add")
    public int addTwoNumbers(CalculatorRequest request){
        return request.getNumber1() + request.getNumber2();
    }
    // body를 통해 값 전달 후 값 받아오기 + dto 이용
    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorRequest request){
        return request.getNumber1()* request.getNumber2();
    }
}
