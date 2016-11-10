package com.mtime.springboot.dao.mapper;

import com.mtime.springboot.model.po.MuserwechatPO;
import com.mtime.springboot.model.po.MuserwechatPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuserwechatPOMapper {
    long countByExample(MuserwechatPOExample example);

    int deleteByExample(MuserwechatPOExample example);

    int deleteByPrimaryKey(Long wechatId);

    int insert(MuserwechatPO record);

    int insertSelective(MuserwechatPO record);

    List<MuserwechatPO> selectByExample(MuserwechatPOExample example);

    MuserwechatPO selectByPrimaryKey(Long wechatId);

    int updateByExampleSelective(@Param("record") MuserwechatPO record, @Param("example") MuserwechatPOExample example);

    int updateByExample(@Param("record") MuserwechatPO record, @Param("example") MuserwechatPOExample example);

    int updateByPrimaryKeySelective(MuserwechatPO record);

    int updateByPrimaryKey(MuserwechatPO record);
}