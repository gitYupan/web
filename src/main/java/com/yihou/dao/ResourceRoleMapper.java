package com.yihou.dao;

import com.yihou.entity.ResourceRoleExample;
import org.omg.CORBA.Object;

import java.util.List;
import java.util.Map;

public interface ResourceRoleMapper {

    List<Map<String, Object>> fzlhcx(ResourceRoleExample resourceRoleExample);

}