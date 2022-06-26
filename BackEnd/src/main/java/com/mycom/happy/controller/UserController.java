package com.mycom.happy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.happy.dto.UserDto;
import com.mycom.happy.dto.UserResultDto;
import com.mycom.happy.service.UserService;

@RestController
@CrossOrigin(
		// localhost:5500 과 127.0.0.1 구분
		origins = "http://localhost:5500", //allowCredentials = "true" 인 경우, origins="*" 는 X
		allowCredentials = "true",
		allowedHeaders = "*",
		methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.HEAD, RequestMethod.OPTIONS}
)
public class UserController {

	@Autowired
	UserService userService;

	private static final int SUCCESS = 1;

	@PostMapping(value = "/register")
	public ResponseEntity<Map<String, String>> register(@RequestBody UserDto dto, HttpSession session) {

		UserResultDto userResultDto = userService.userRegister(dto);

		Map<String, String> map = new HashMap<>();

		if (userResultDto.getResult() == SUCCESS) {
			map.put("result", "success");
			return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);
		} else {
			map.put("result", "fail");
			return new ResponseEntity<Map<String, String>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// 수정
	// put /students dto... <= parameter로 put 구현 부분 확인
	@PutMapping(value = "/modify")
	public int modify(@RequestBody UserDto userdto) {
		return userService.modify(userdto);
	}

	// 삭제
	@DeleteMapping(value = "/remove/{userSeq}")
	public int remove(@PathVariable int userSeq) {
		return userService.remove(userSeq);
	}
}
