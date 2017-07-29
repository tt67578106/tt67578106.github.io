package cn.java.mapper;

import java.util.List;

import cn.java.entity.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Long id);

    List<Member> selectAll();

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}