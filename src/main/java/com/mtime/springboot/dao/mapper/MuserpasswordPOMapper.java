package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MuserpasswordPO;
import com.mtime.springboot.model.po.MuserpasswordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuserpasswordPOMapper {
    long countByExample(MuserpasswordPOExample example);

    int deleteByExample(MuserpasswordPOExample example);

    int deleteByPrimaryKey(Long passwordId);

    int insert(MuserpasswordPO record);

    int insertSelective(MuserpasswordPO record);

    List<MuserpasswordPO> selectByExample(MuserpasswordPOExample example);

    MuserpasswordPO selectByPrimaryKey(Long passwordId);

    int updateByExampleSelective(@Param("record") MuserpasswordPO record, @Param("example") MuserpasswordPOExample example);

    int updateByExample(@Param("record") MuserpasswordPO record, @Param("example") MuserpasswordPOExample example);

    int updateByPrimaryKeySelective(MuserpasswordPO record);

    int updateByPrimaryKey(MuserpasswordPO record);
}