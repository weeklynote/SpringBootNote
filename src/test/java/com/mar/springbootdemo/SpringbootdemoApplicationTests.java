package com.mar.springbootdemo;

import com.mar.controller.DemoController;
import com.mar.mapper.ArticleMapper;
import com.mar.mapper.CommentMapper;
import com.mar.pojo.*;
import com.mar.repository.CommentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootdemoApplicationTests {

    @Autowired
    private DemoController demoController;
    @Autowired
    private Person person;
    @Autowired
    private TestProperty testProperty;
    @Autowired
    private MyRandom myRandom;
    @Autowired
    private ReferenceProperty referenceProperty;

    @Test
    public void testController() {
        String demo = demoController.demo();
        System.out.println(demo);
    }

    @Test
    public void testCustomConfig() {
        System.err.println(person);
    }

    @Test
    public void testMyProperties() {
        System.err.println(testProperty);
    }

    @Test
    public void testRandom(){
        System.err.println(myRandom);
    }

    @Test
    public void testReference(){
        System.err.println(referenceProperty);
    }

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void testMybatis(){
        final Comment byId = commentMapper.findById(1);
        System.err.println(byId);
    }

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testMybatisV1(){
        final Article article = articleMapper.selectById(1);
        System.err.println(article);
    }

    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void testJpa(){
        Optional<Comment> byId = commentRepository.findById(1);
        if (byId.isPresent()){
            System.err.println(byId.get());
        }
        byId = commentRepository.findById(1);
        if (byId.isPresent()){
            System.err.println(byId.get());
        }
        byId = commentRepository.findById(1);
        if (byId.isPresent()){
            System.err.println(byId.get());
        }
    }
}
