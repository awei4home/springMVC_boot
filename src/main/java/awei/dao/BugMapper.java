package awei.dao;

import awei.model.Bug;

public interface BugMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bug record);

    int insertSelective(Bug record);

    Bug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Bug record);

    int updateByPrimaryKeyWithBLOBs(Bug record);

    int updateByPrimaryKey(Bug record);
}