package com.bc.user.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bc.user.data.UserEntity;
import com.bc.user.data.UsersRepository;
import com.bc.user.shared.UserDto;

@Service
public class UserServicesImpl implements UsersService {

	UsersRepository usersRepository;
	
	@Autowired
	public UserServicesImpl(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	@Override
	public UserDto createUser(UserDto userDetails) {
		
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
		userEntity.setEncryptedPassword("test");
		usersRepository.save(userEntity);
		return null;
	}
	
	
}
