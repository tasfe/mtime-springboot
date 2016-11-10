package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MuserqqPO;
import com.mtime.springboot.model.po.MuserqqPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuserqqPOMapper {
    long countByExample(MuserqqPOExample example);

    int deleteByExample(MuserqqPOExample example);

    int deleteByPrimaryKey(Long qqId);

    int insert(MuserqqPO record);

    int insertSelective(MuserqqPO record);

    List<MuserqqPO> selectByExample(MuserqqPOExample example);

    MuserqqPO selectByPrimaryKey(Long qqId);

    int updateByExampleSelective(@Param("record") MuserqqPO record, @Param("example") MuserqqPOExample example);

    int updateByExample(@Param("record") MuserqqPO record, @Param("example") MuserqqPOExample example);

    int updateByPrimaryKeySelective(MuserqqPO record);

    int updateByPrimaryKey(MuserqqPO record);
}