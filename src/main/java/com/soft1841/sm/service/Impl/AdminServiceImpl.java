package com.soft1841.sm.service.Impl;

import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.utils.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();
    @Override
    public List<Admin> getAllAdmins() {
        List<Admin> adminList = new ArrayList<>();
        try {
            adminList = adminDAO.selectAllAdmin();
        } catch (SQLException e) {
            System.err.println("查询管理员信息出现异常");
        }
        return adminList;
    }

    @Override
    public int countByAddress(String address) {
        int result = 0;
        try {
            result = adminDAO.countByAddress(address);
        } catch (SQLException e) {
            System.err.println("根据地址统计管理员信息出现异常");
        }
        return result;
    }
}
