package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MusermobilePO;
import com.mtime.springboot.model.po.MusermobilePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusermobilePOMapper {
    long countByExample(MusermobilePOExample example);

    int deleteByExample(MusermobilePOExample example);

    int deleteByPrimaryKey(Long mobileId);

    int insert(MusermobilePO record);

    int insertSelective(MusermobilePO record);

    List<MusermobilePO> selectByExample(MusermobilePOExample example);

    MusermobilePO selectByPrimaryKey(Long mobileId);

    int updateByExampleSelective(@Param("record") MusermobilePO record, @Param("example") MusermobilePOExample example);

    int updateByExample(@Param("record") MusermobilePO record, @Param("example") MusermobilePOExample example);

    int updateByPrimaryKeySelective(MusermobilePO record);

    int updateByPrimaryKey(MusermobilePO record);
}