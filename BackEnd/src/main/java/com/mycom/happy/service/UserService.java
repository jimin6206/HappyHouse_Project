package com.mycom.happy.service;

import com.mycom.happy.dto.UserDto;
import com.mycom.happy.dto.UserResultDto;

public interface UserService {
	public UserResultDto userRegister(UserDto userDto);
	public int modify(UserDto userDto);
	public int remove(int userSeq);
}
