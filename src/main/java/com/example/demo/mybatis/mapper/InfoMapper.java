package com.example.demo.mybatis.mapper;

import com.example.demo.mybatis.entity.Info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InfoMapper {
  void addInfo(Info info);
  List<Info> findInfoById(int receiveUserId);
}
