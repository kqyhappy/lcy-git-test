package com.example.demo.mybatis.service;

import com.example.demo.mybatis.entity.Tag;

import java.util.List;

/**
 * Created by 20372 on 2020/9/14.
 */
public interface TagService {
    List<Tag>findAllTags();
    boolean findTag(String tagName);
    void addTag(Tag tag);
}
