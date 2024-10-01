package com.jd.infectious.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Collections;
import java.util.List;

/**
 * <p></p>
 *
 * @author mazhiqiang21
 * @version 1.0.0
 * @date 2021/11/29 18:28
 */
public class PageResult<T> implements IPageResult<T> {
    /**
     * 当前页
     */
    protected long current = 1;
    /**
     * 每页显示条数，默认 10
     */
    protected long size = 10;
    /**
     * 总数
     */
    protected long total = 0;
    /**
     * 已填报人数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected long completed = 0;

    /**
     * 最新一条记录的更新时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected String updateTime;
    /**
     * 权限
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected Integer permission = 0;
    /**
     * 记录
     */
    protected List<T> records = Collections.emptyList();

    public PageResult(long current, long size) {
        this(current, size, 0, 0);
    }

    public PageResult(long current, long size, long total, long completed) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.completed = completed;
        this.updateTime = updateTime;
        this.permission = permission;
    }

    public PageResult() {

    }

    @Override
    public long getCurrent() {
        return current;
    }

    @Override
    public PageResult<T> setCurrent(long current) {
        this.current = current;
        return this;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public PageResult<T> setSize(long size) {
        this.size = size;
        return this;
    }

    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public PageResult<T> setTotal(long total) {
        this.total = total;
        return this;
    }


    @Override
    public List<T> getRecords() {
        return records;
    }

    @Override
    public PageResult<T> setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    public long getCompleted() {
        return completed;
    }

    public PageResult<T> setCompleted(long completed) {
        this.completed = completed;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public PageResult<T> setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getPermission() {
        return permission;
    }

    public PageResult<T> setPermission(Integer permission) {
        this.permission = permission;
        return this;
    }
}
