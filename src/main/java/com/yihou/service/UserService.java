package com.yihou.service;

import com.yihou.common.service.CrudService;
import com.yihou.dao.UserDao;
import com.yihou.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudService<UserDao,User> {


}
