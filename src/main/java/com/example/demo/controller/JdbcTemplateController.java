package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.JdbcTemplates;
import com.example.demo.model.GetEmployeeReqBean;
import com.example.demo.service.JdbcTemplateService;

@RestController
public class JdbcTemplateController {
	@Autowired
	JdbcTemplateService jdbcTemplateService;
	
	@GetMapping("/findAll")
	public List<JdbcTemplates> fetchAll() {
		return jdbcTemplateService.fetchAll();
	}
	
	@GetMapping("/findAllEmployee")
	public List<Map<String,Object>> findselectedEmploye(@RequestBody GetEmployeeReqBean bean) {
		return jdbcTemplateService.findselectedEmploye(bean);
	}
}
