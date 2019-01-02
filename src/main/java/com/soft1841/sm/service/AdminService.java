package com.soft1841.sm.service;

import com.soft1841.sm.entity.Admin;

import java.util.List;

/**
 * @Author LiuLian
 * @2018.12.31
 */

public interface AdminService {
    /**
     * 查询所有管理员
     * @return
     *
     */


    List<Admin> getAllAdmins();
    /**
     * @param address
     * @return
     */
    int countByAddress(String address);

}
