package com.example.base.mapper;

import com.example.base.entity.AomengOrder;
import com.example.base.entity.AomengOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AomengOrderMapper {
    int countByExample(AomengOrderExample example);

    int deleteByExample(AomengOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(AomengOrder record);

    int insertSelective(AomengOrder record);

    List<AomengOrder> selectByExample(AomengOrderExample example);

    AomengOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AomengOrder record, @Param("example") AomengOrderExample example);

    int updateByExample(@Param("record") AomengOrder record, @Param("example") AomengOrderExample example);

    int updateByPrimaryKeySelective(AomengOrder record);

    int updateByPrimaryKey(AomengOrder record);
}