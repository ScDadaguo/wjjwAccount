package com.guohao.account.mapper.base;

import com.guohao.account.model.Wjjw;
import org.apache.ibatis.annotations.Mapper;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
*  @author guohao
*/
@Mapper
public interface WjjwBaseMapper {

    int insertWjjw(Wjjw object);

    int updateWjjw(Wjjw object);

    int update(Wjjw.UpdateBuilder object);

    List<Wjjw> queryWjjw(String openId);

    Wjjw queryWjjwLimit1(Wjjw object);

    int deleteWjjw(Integer id);

    Wjjw queryWjjwById(Integer id);

}