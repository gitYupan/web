/**
 * 版权所有：恒生电子股份有限公司 保留所有权利
 * 版本： 1.0
 * ******************************************
 * Copyright (c)  by Hundsun ,Ltd.
 * All right reserved.
 * Last version:  1.0
 */
package com.yihou.common.dao;

import com.github.pagehelper.Page;
import com.yihou.common.model.SqlPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 实现基础增删改查mapper<br/>
 * T:表示数据库对象，E:表示example查询条件
 * author yupan@18551
 * date 2016-09-01 13:29
 */
public interface BaseMapper<T, E> {

    /**
     * 添加实体对象的所有字段到数据库
     *
     * @param record example查询条件
     * @return 影响数据库行数
     */
    int insert(T record);

    /**
     * 添加实体对象的不为空字段到数据库
     *
     * @param record example查询条件
     * @return 影响数据库行数
     */
    int insertSelective(T record);

    /**
     * 根据example查询条件删除实体对象
     *
     * @param example example查询条件
     * @return 实体列表
     */
    int deleteByExample(E example);

    /**
     * 更新实体对象的所有字段到数据库
     *
     * @param record  实体对象
     * @param example example查询条件
     * @return 影响数据库行数
     */
    int updateByExample(@Param("record") T record, @Param("example") E example);

    /**
     * 更新实体对象的不为空字段到数据库
     *
     * @param record  实体对象
     * @param example example查询条件
     * @return 影响数据库行数
     */
    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    /**
     * 根据主键更新实体对象的所有字段到数据库
     *
     * @param record 实体对象
     * @return 影响数据库行数
     */
    int updateByPrimaryKey(T record);

    /**
     * 根据主键更新实体对象的不为空字段到数据库
     *
     * @param record 实体对象
     * @return 影响数据库行数
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据example查询条件查询总条数
     *
     * @param example example查询条件
     * @return 实体列表
     */
    int countByExample(E example);

    /**
     * 根据example查询条件查询实体列表
     *
     * @param example example查询条件
     * @return 实体列表
     */
    List<T> selectByExample(E example);

    /**
     * 根据example查询条件分页查询实体列表
     *
     * @param example example查询条件
     * @return 实体分页列表
     */
    Page<T> selectPageByExample(@Param("example") E example, @Param("sqlPage") SqlPage sqlPage);

}
