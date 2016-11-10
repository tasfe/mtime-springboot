package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MuseraddressPO;
import com.mtime.springboot.model.po.MuseraddressPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuseraddressPOMapper {
    long countByExample(MuseraddressPOExample example);

    int deleteByExample(MuseraddressPOExample example);

    int deleteByPrimaryKey(Long addressId);

    int insert(MuseraddressPO record);

    int insertSelective(MuseraddressPO record);

    List<MuseraddressPO> selectByExample(MuseraddressPOExample example);

    MuseraddressPO selectByPrimaryKey(Long addressId);

    int updateByExampleSelective(@Param("record") MuseraddressPO record, @Param("example") MuseraddressPOExample example);

    int updateByExample(@Param("record") MuseraddressPO record, @Param("example") MuseraddressPOExample example);

    int updateByPrimaryKeySelective(MuseraddressPO record);

    int updateByPrimaryKey(MuseraddressPO record);
}