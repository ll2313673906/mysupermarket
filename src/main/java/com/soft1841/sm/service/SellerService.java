package com.soft1841.sm.service;

import com.soft1841.sm.entity.Seller;

import java.util.List;

/**
 * 单元测试类
 * @Author LiuLina
 * @2018.12.31
 * @15.42
 */

public interface SellerService {
    /**
     * 获取所有收银员
     * @return
     */
    List<Seller> getAllSellers();
    /**
     * 新增收银员
     * @param Seller
     * @return
     */
    Long addSeller(Seller Seller);
    /**
     * 根据Id删除收银员
     * @param id
     */
    void deleteSeller(long id);
    /**
     * 修改收银员的信息
     * @param seller
     */
    void updateSeller(Seller seller);

}
