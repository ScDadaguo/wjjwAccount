package com.guohao.account.service;

import com.guohao.account.model.Wjjw;

import java.util.List;

public interface WjjwService {

    /**
     * 插入账单
     * @param wjjw
     */
    Object insertWjjw(Wjjw wjjw);

    /**
     * 修改账单
     * @param wjjw
     * @return
     */
    Object updateWjjw(Wjjw wjjw);

    /**查询所有账单
     * @return
     */
    List<Wjjw> queryWjjw(String openId);

    /**
     * 根据id删除账单
     * @param id
     * @return
     */
    boolean deleteWjjw(Integer id);


    /**
     * 根据id查询账单
     * @return
     */
    Wjjw queryWjjwById(Integer id);

}
