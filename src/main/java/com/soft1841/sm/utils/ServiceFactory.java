package com.soft1841.sm.utils;

import com.soft1841.sm.service.Impl.SellerLoginServiceImpl;
import com.soft1841.sm.service.SellerLoginService;

public class ServiceFactory {
    public static SellerLoginService getSellerServiceInstance(){ return new SellerLoginServiceImpl(); }

}


