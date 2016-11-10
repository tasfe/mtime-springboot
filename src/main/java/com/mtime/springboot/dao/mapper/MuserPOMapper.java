package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MuserPO;
import com.mtime.springboot.model.po.MuserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuserPOMapper {
    long countByExample(MuserPOExample example);

    int deleteByExample(MuserPOExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(MuserPO record);

    int insertSelective(MuserPO record);

    List<MuserPO> selectByExample(MuserPOExample example);

    MuserPO selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") MuserPO record, @Param("example") MuserPOExample example);

    int updateByExample(@Param("record") MuserPO record, @Param("example") MuserPOExample example);

    int updateByPrimaryKeySelective(MuserPO record);

    int updateByPrimaryKey(MuserPO record);
}