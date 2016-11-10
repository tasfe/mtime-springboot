package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MusertokenlogPO;
import com.mtime.springboot.model.po.MusertokenlogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusertokenlogPOMapper {
    long countByExample(MusertokenlogPOExample example);

    int deleteByExample(MusertokenlogPOExample example);

    int deleteByPrimaryKey(Long tokenLogId);

    int insert(MusertokenlogPO record);

    int insertSelective(MusertokenlogPO record);

    List<MusertokenlogPO> selectByExample(MusertokenlogPOExample example);

    MusertokenlogPO selectByPrimaryKey(Long tokenLogId);

    int updateByExampleSelective(@Param("record") MusertokenlogPO record, @Param("example") MusertokenlogPOExample example);

    int updateByExample(@Param("record") MusertokenlogPO record, @Param("example") MusertokenlogPOExample example);

    int updateByPrimaryKeySelective(MusertokenlogPO record);

    int updateByPrimaryKey(MusertokenlogPO record);
}