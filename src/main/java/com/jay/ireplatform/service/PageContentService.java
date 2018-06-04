package com.jay.ireplatform.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Jay
 * date : 2018/6/4
 * des :
 */
public interface PageContentService {
    /**
     * 查找全部
     */
    JSONObject findAll();

    /**
     * 根据条件查询系统用户
     *
     * @return 系统用户
     */
}
