package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MusersinaPO;
import com.mtime.springboot.model.po.MusersinaPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusersinaPOMapper {
    long countByExample(MusersinaPOExample example);

    int deleteByExample(MusersinaPOExample example);

    int deleteByPrimaryKey(Long sinaId);

    int insert(MusersinaPO record);

    int insertSelective(MusersinaPO record);

    List<MusersinaPO> selectByExample(MusersinaPOExample example);

    MusersinaPO selectByPrimaryKey(Long sinaId);

    int updateByExampleSelective(@Param("record") MusersinaPO record, @Param("example") MusersinaPOExample example);

    int updateByExample(@Param("record") MusersinaPO record, @Param("example") MusersinaPOExample example);

    int updateByPrimaryKeySelective(MusersinaPO record);

    int updateByPrimaryKey(MusersinaPO record);
}