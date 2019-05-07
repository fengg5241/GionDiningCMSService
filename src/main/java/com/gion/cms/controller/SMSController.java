package com.gion.cms.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gion.cms.entity.TUser;
import com.gion.cms.entity.TUserTransaction;
import com.gion.cms.service.UserService;

@RestController
@RequestMapping("/sms")
public class UserController {

	
	@PostMapping("/insert")
	public void insert(@RequestBody TUser record) {
		userService.insert(record);
	}
	
	
	
	
	
}
