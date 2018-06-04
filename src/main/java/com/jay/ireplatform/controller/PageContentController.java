package com.jay.ireplatform.controller;

import com.jay.ireplatform.Common.Result;
import com.jay.ireplatform.Common.ResultGenerator;
import com.jay.ireplatform.service.PageContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jay
 * date : 2018/6/4
 * des :
 */
@Controller
@RequestMapping(value="/")
public class PageContentController {
    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    @Autowired
    private PageContentService pageContentService;

    @ResponseBody
    @RequestMapping("/findAll")
    public Result findAll(){
        return ResultGenerator.genSuccessResult(pageContentService.findAll());
    }




}
