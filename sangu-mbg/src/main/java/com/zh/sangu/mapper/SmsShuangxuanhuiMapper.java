package com.zh.sangu.mapper;

import com.zh.sangu.model.SmsShuangxuanhui;
import com.zh.sangu.model.SmsShuangxuanhuiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsShuangxuanhuiMapper {
    long countByExample(SmsShuangxuanhuiExample example);

    int deleteByExample(SmsShuangxuanhuiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsShuangxuanhui record);

    int insertSelective(SmsShuangxuanhui record);

    List<SmsShuangxuanhui> selectByExample(SmsShuangxuanhuiExample example);

    SmsShuangxuanhui selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsShuangxuanhui record, @Param("example") SmsShuangxuanhuiExample example);

    int updateByExample(@Param("record") SmsShuangxuanhui record, @Param("example") SmsShuangxuanhuiExample example);

    int updateByPrimaryKeySelective(SmsShuangxuanhui record);

    int updateByPrimaryKey(SmsShuangxuanhui record);
}