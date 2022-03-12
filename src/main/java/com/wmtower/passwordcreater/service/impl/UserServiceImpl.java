package com.wmtower.passwordcreater.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.wmtower.passwordcreater.dao.CustomUserRepository;
import com.wmtower.passwordcreater.model.entity.CustomUser;
import com.wmtower.passwordcreater.service.IUserService;

import org.springframework.stereotype.Service;

/**
 * @author liuyf90
 **/
@Service
public class UserServiceImpl implements IUserService{

    @Resource
    private CustomUserRepository customUserRepository;
    @Override
    public List<CustomUser> getUserList(){
        return (List<CustomUser>)customUserRepository.findAll();
    }
    @Override
    public String toString() {
        return "UserServiceImpl []";
    }
    
}
