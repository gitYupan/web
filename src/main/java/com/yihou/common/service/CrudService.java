package com.yihou.common.service;

import com.yihou.common.dao.CrudDao;
import com.yihou.common.model.BaseModel;
import com.yihou.common.model.SqlPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 增删改查基类
 * Created by YuPan on 2016/4/15.
 */
public abstract class CrudService<D extends CrudDao<T>, T extends BaseModel<T>> extends BaseService {

    @Autowired
    protected D dao;

    /**
     * 查询带个数据
     *
     * @param entity 数据实体对象,建议以实体对象的id来查询
     * @return 数据实体对象
     */
    public T findOne(T entity) {
        if (entity == null)
            return null;
        return dao.findOne(entity);
    }

    /**
     * 查询实体列表
     *
     * @param entity 实体对象条件
     * @return 实体列表对象
     */
    public List<T> find(T entity) {
        return dao.find(entity);
    }

    /**
     * 分页查询实体列表
     *
     * @param entity 实体对象条件
     * @param sqlPage 分页对象
     * @return 实体列表对象
     */
    public List<T> find(T entity, SqlPage sqlPage) {
        return dao.find(entity, sqlPage);
    }

    /**
     * 添加实体对象
     *
     * @param entity 实体对象
     * @return 实体对象
     */
    public T add(T entity) {
        dao.add(entity);
        return entity;
    }

    /**
     * 更新实体对象
     *
     * @param entity 实体对象
     * @return 实体对象
     */
    public T update(T entity) {
        dao.update(entity);
        return entity;
    }

    /**
     * 删除实体对象
     *
     * @param entity 实体对象
     * @return 实体对象
     */
    public T delete(T entity) {
        dao.delete(entity);
        return entity;
    }

}
