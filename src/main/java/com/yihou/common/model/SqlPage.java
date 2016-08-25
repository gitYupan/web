package com.yihou.common.model;

import java.io.Serializable;

/**
 * SQL查询语句分页辅助类
 */
public class SqlPage implements Serializable {

    private static final long serialVersionUID = -6469724259475556142L;

    /**
     * 强制不分页
     */
    private boolean forceNotPaging = false;
    /**
     * 当前页
     */
    private int page;
    /**
     * 每页显示记录数
     */
    private int rows;
    /**
     * 开始条数
     */
    private int offset;
    /**
     * 结束条数
     */
    private int limit;
    /**
     * 查询排序 id desc
     */
    private String order;

    public SqlPage() {
        super();
    }

    public SqlPage(int page, int rows) {
        super();
        this.page = page;
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isPaging() {
        return this.page > 0 || this.limit > 0;
    }

    public boolean isSort() {
        return !(this.order == null || "".equals(this.order));
    }

    public boolean isForceNotPaging() {
        return forceNotPaging;
    }

    public void setForceNotPaging(boolean forceNotPaging) {
        this.forceNotPaging = forceNotPaging;
    }

}
