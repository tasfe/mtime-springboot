package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MusertokenPO;
import com.mtime.springboot.model.po.MusertokenPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusertokenPOMapper {
    long countByExample(MusertokenPOExample example);

    int deleteByExample(MusertokenPOExample example);

    int deleteByPrimaryKey(Long tokenId);

    int insert(MusertokenPO record);

    int insertSelective(MusertokenPO record);

    List<MusertokenPO> selectByExample(MusertokenPOExample example);

    MusertokenPO selectByPrimaryKey(Long tokenId);

    int updateByExampleSelective(@Param("record") MusertokenPO record, @Param("example") MusertokenPOExample example);

    int updateByExample(@Param("record") MusertokenPO record, @Param("example") MusertokenPOExample example);

    int updateByPrimaryKeySelective(MusertokenPO record);

    int updateByPrimaryKey(MusertokenPO record);
}