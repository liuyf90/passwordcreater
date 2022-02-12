package com.wmtower.passwordcreater.dao;

import com.wmtower.passwordcreater.entity.CustomUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomUserRepository 
extends JpaRepository<CustomUser,Long>,JpaSpecificationExecutor<CustomUser> {
    CustomUser findCustomUserByName(String name);

 }

