package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MuserinfoPO;
import com.mtime.springboot.model.po.MuserinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuserinfoPOMapper {
    long countByExample(MuserinfoPOExample example);

    int deleteByExample(MuserinfoPOExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(MuserinfoPO record);

    int insertSelective(MuserinfoPO record);

    List<MuserinfoPO> selectByExample(MuserinfoPOExample example);

    MuserinfoPO selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") MuserinfoPO record, @Param("example") MuserinfoPOExample example);

    int updateByExample(@Param("record") MuserinfoPO record, @Param("example") MuserinfoPOExample example);

    int updateByPrimaryKeySelective(MuserinfoPO record);

    int updateByPrimaryKey(MuserinfoPO record);
}