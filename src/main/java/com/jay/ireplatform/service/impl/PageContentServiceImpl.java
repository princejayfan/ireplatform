package com.jay.ireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jay.ireplatform.domain.PageContent;
import com.jay.ireplatform.repository.PageContentRepository;
import com.jay.ireplatform.service.PageContentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jay
 * date : 2018/6/4
 * des :
 */
public class PageContentServiceImpl implements PageContentService{

    @Autowired
    private PageContentRepository pageContentRepository;

    @Override
    public JSONObject findAll() {
        JSONObject jsonObject = new JSONObject();
        List<PageContent> allContent = pageContentRepository.findAll();
        jsonObject.put("data", allContent);
        return jsonObject;
    }
}
