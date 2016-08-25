package com.yihou.common.dao.plugin;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yihou.common.model.SqlPage;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Properties;

@Intercepts(@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class PagePlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        final Object[] args = invocation.getArgs();
        Object param = args[1];
        SqlPage sqlPage = null;
        if (param instanceof SqlPage) {
            sqlPage = (SqlPage) param;
        } else {
            if (param instanceof MapperMethod.ParamMap) {
                MapperMethod.ParamMap map = (MapperMethod.ParamMap) param;
                for (Object key : map.keySet()) {
                    Object value = map.get(key);
                    if (value instanceof SqlPage) {
                        sqlPage = (SqlPage) value;
                        break;
                    }
                }
            }
        }
        if (sqlPage != null && !sqlPage.isForceNotPaging()) {
            if (sqlPage.isPaging() && sqlPage.isSort()) {//分页并排序
                if (sqlPage.getPage() > 0) {
                    PageHelper.startPage(sqlPage.getPage(), sqlPage.getRows(), sqlPage.getOrder());
                } else {
                    if (sqlPage.getLimit() > 0) {
                        PageHelper.offsetPage(sqlPage.getOffset(), sqlPage.getLimit(), sqlPage.getOrder());
                    }
                }
            } else {
                if (sqlPage.isPaging()) {//只分页,不排序
                    if (sqlPage.getPage() > 0) {
                        PageHelper.startPage(sqlPage.getPage(), sqlPage.getRows());
                    } else {
                        if (sqlPage.getLimit() > 0) {
                            PageHelper.offsetPage(sqlPage.getOffset(), sqlPage.getLimit());
                        }
                    }
                } else {
                    if (sqlPage.isSort()) {//只排序,不分页
                        PageHelper.orderBy(sqlPage.getOrder());
                    }
                }
            }
        }
        Object result = invocation.proceed();
        if (result instanceof Page) {
            return result;
        } else {
            Page page = new Page();
            page.addAll((List) result);
            return page;
        }
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
