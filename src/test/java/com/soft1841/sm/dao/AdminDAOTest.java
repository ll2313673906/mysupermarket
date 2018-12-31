package com.soft1841.sm.dao;
/**
 * 单元测试类
 * @Author LiuLian
 * @2018.12.31
 * @15:16
 */

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class AdminDAOTest {
    private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();
    @Test
    public void selectAllAdmin()throws SQLException{
        List <Admin> adminList = adminDAO.selectAllAdmin();
        adminList.forEach(admin -> System.out.println(admin));

    }
    @Test
    public void countByAddress() throws SQLException{
        int n = adminDAO.countByAddress("山西");
        System.out.println(n);
    }
}
