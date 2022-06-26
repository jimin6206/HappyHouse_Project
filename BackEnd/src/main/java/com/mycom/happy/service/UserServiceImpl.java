package com.mycom.happy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.happy.dao.UserDao;
import com.mycom.happy.dto.UserDto;
import com.mycom.happy.dto.UserResultDto;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	private static final int SUCCESS = 1;
	private static final int FAIL = -1;
	
	@Override
	public UserResultDto userRegister(UserDto userDto) {
		UserResultDto userResultDto = new UserResultDto();
		if( userDao.userRegister(userDto) == 1 ) {
			userResultDto.setResult(SUCCESS);
		}else {
			userResultDto.setResult(FAIL);
		}
		
		return userResultDto;
	}

	@Override
	public int modify(UserDto userDto) {
		
		return userDao.modify(userDto);
	}

	@Override
	public int remove(int userSeq) {
		
		return userDao.remove(userSeq);
	}
	
}
