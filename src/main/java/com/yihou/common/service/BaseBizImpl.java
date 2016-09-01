/**
 * 版权所有：恒生电子股份有限公司 保留所有权利
 * 版本： 1.0
 * ******************************************
 * Copyright (c)  by Hundsun ,Ltd.
 * All right reserved.
 * Last version:  1.0
 */
package com.yihou.common.service;

import com.github.pagehelper.Page;
import com.yihou.common.dao.BaseMapper;
import com.yihou.common.model.SqlPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Description:biz基础实现，增删改查
 * author yupan@18551
 * date 2016-09-01 13:24
 */
public abstract class BaseBizImpl<D extends BaseMapper<T, E>, T, E>{

    @Autowired
    protected D dao;

    public int insert(T record) {
        return dao.insert(record);
    }

    public int insertSelective(T record) {
        return dao.insertSelective(record);
    }

    public int deleteByExample(E example) {
        return dao.deleteByExample(example);
    }

    public int updateByExample(T record, E example) {
        return dao.updateByExample(record, example);
    }

    public int updateByExampleSelective(T record, E example) {
        return dao.updateByExampleSelective(record, example);
    }

    public int updateByPrimaryKey(T record) {
        return dao.updateByPrimaryKey(record);
    }

    public int updateByPrimaryKeySelective(T record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    public int countByExample(E example) {
        return dao.countByExample(example);
    }

    public List<T> selectByExample(E example) {
        return dao.selectByExample(example);
    }

    public Page<T> selectPageByExample(E example, SqlPage sqlPage) {
        return dao.selectPageByExample(example, sqlPage);
    }
}
