package com.wmtower.passwordcreater.service;

import com.wmtower.passwordcreater.model.entity.CustomUser;
import java.util.List;
/**
 * @author liuyf90
 **/
public interface IUserService{

    public List<CustomUser> getUserList();
}
