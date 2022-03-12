package com.wmtower.passwordcreater.dao;


import com.wmtower.passwordcreater.model.entity.CustomUser;

import org.springframework.data.repository.CrudRepository;

public interface CustomUserRepository extends CrudRepository<CustomUser,Long>{//{{{
    CustomUser findCustomUserByName(String name);

 }//}}}

