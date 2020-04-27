package com.mar.mapper;

import com.mar.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 18:29
 */
public interface ArticleMapper {

    Article selectById(Integer id);

    List<Article> selectAll();
}
