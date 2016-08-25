package com.yihou.common.dao;

import com.yihou.common.model.SqlPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 增删改查操作数据库接口
 * Created by YuPan on 2016/4/15.
 */
public interface CrudDao<T> extends BaseDao {

    /**
     * 查询单个实体对象
     *
     * @param entity 实体对象条件
     * @return 实体对象
     */
    T findOne(T entity);

    /**
     * 查询多个实体对象集合
     *
     * @param entity 实体对象条件
     * @return 多个实体对象集合
     */
    List<T> find(@Param("entity") T entity);

    /**
     * 分页查询多个实体对象集合
     *
     * @param entity  实体对象条件
     * @param sqlPage 分页条件
     * @return 多个实体对象集合
     */
    List<T> find(@Param("entity") T entity, @Param("sqlPage") SqlPage sqlPage);

    /**
     * 添加实体对象
     *
     * @param entity 实体对象
     * @return 影响数据库行数
     */
    int add(T entity);

    /**
     * 更新实体对象
     *
     * @param entity 实体对象
     * @return 影响数据库行数
     */
    int update(T entity);

    /**
     * 删除实体对象
     *
     * @param entity 实体对象
     * @return 影响数据库行数
     */
    int delete(T entity);

}
