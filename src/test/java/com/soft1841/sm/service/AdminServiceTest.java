package com.soft1841.sm.service;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.utils.ServiceFactory;
import org.junit.Test;

import java.lang.invoke.SerializedLambda;
import java.util.List;

public class AdminServiceTest {
    private AdminService adminService = ServiceFactory.getAdminsServiceInstance();
    @Test
    public void getAllAdmin(){
        List<Admin> adminList = adminService.getAllAdmins();
        adminList.forEach(admin -> System.out.println(admin));
    }
    @Test
    private void countByAddress(){
        adminService.countByAddress("山西");
    }
}
