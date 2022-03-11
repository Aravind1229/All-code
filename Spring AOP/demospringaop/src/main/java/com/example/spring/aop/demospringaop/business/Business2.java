package com.example.spring.aop.demospringaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.aop.demospringaop.data.Dao2;

@Service
public class Business2 {
@Autowired
private Dao2 dao2;
public String calculate() {
	return dao2.retrievesomething();
}
}
