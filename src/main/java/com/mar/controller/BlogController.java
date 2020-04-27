package com.mar.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mar.mapper.ArticleMapper;
import com.mar.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 12:00
 */
@Controller
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private ArticleMapper articleMapper;

    @RequestMapping("home")
    public String home(@RequestParam("pageIndex") int pageIndex, @RequestParam("pageSize") int pageSize, Model model){
        PageHelper.startPage(pageIndex, pageSize, true);
        // 每次都只返回2条数据
        final List<Article> articles = articleMapper.selectAll();
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        model.addAttribute("articles", pageInfo.getList());
        model.addAttribute("total", pageInfo.getTotal());
        model.addAttribute("pageIndex", pageInfo.getPageNum());
        model.addAttribute("home", pageInfo.getNavigateFirstPage());
        model.addAttribute("pre", pageInfo.getPrePage());
        model.addAttribute("preFlag", pageInfo.isHasPreviousPage());
        model.addAttribute("next", pageInfo.getNextPage());
        model.addAttribute("nextFlag", pageInfo.isHasNextPage());
        model.addAttribute("last", pageInfo.getNavigateLastPage());
        return "blog";
    }

}
