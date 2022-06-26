package com.mycom.happy.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mycom.happy.dto.UserDto;

@Mapper
public interface UserDao {
	public int userRegister(UserDto userDto);
	public int modify(UserDto userDto);
	public int remove(int userSeq);
	
}
