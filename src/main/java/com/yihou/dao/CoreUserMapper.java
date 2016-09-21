package com.yihou.dao;

import com.yihou.dao.entity.CoreUser;
import com.yihou.dao.entity.CoreUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreUserMapper {
    int countByExample(CoreUserExample example);

    int deleteByExample(CoreUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(CoreUser record);

    int insertSelective(CoreUser record);

    List<CoreUser> selectByExampleWithBLOBs(CoreUserExample example);

    List<CoreUser> selectByExample(CoreUserExample example);

    CoreUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    int updateByExampleWithBLOBs(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    int updateByExample(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    int updateByPrimaryKeySelective(CoreUser record);

    int updateByPrimaryKeyWithBLOBs(CoreUser record);

    int updateByPrimaryKey(CoreUser record);
}