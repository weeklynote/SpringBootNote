package com.mar.mapper;

import com.mar.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 18:19
 */
public interface CommentMapper {

    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    Comment findById(Integer id);
}
