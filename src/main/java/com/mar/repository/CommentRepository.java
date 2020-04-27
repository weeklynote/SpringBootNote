package com.mar.repository;

import com.mar.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 18:42
 */
public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
