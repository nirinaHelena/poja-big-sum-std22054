package com.poja.bigsum.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@AllArgsConstructor
public class SumController {
    @GetMapping(value = "/big-sum")
    public BigInteger getTeachers(
            @RequestParam BigInteger a,
            @RequestParam BigInteger b
    ){
        return a.add(b);
    }
}
