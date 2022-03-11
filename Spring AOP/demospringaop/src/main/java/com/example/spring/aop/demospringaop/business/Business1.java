package com.example.spring.aop.demospringaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.aop.demospringaop.data.Dao1;

@Service
public class Business1 {
@Autowired
private Dao1 dao1;
public String calculate() {
	return dao1.retrievesomething();
}
}
