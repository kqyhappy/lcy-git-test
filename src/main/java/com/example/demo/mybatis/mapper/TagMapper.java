package com.example.demo.mybatis.mapper;

import com.example.demo.mybatis.entity.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TagMapper {
  List<Tag> findAllTags();
  Tag findTag(String tagName);
  void addTag(Tag tag);
}
