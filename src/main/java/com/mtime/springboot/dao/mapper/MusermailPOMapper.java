package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MusermailPO;
import com.mtime.springboot.model.po.MusermailPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusermailPOMapper {
    long countByExample(MusermailPOExample example);

    int deleteByExample(MusermailPOExample example);

    int deleteByPrimaryKey(Long emailId);

    int insert(MusermailPO record);

    int insertSelective(MusermailPO record);

    List<MusermailPO> selectByExample(MusermailPOExample example);

    MusermailPO selectByPrimaryKey(Long emailId);

    int updateByExampleSelective(@Param("record") MusermailPO record, @Param("example") MusermailPOExample example);

    int updateByExample(@Param("record") MusermailPO record, @Param("example") MusermailPOExample example);

    int updateByPrimaryKeySelective(MusermailPO record);

    int updateByPrimaryKey(MusermailPO record);
}