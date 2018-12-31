package com.soft1841.sm.service;

/**
 * author LiuLian
 * 2018.12.31
 */

public interface AdminLoginService {
    /**
     * @param job_id
     * @param password
     * @return
     */
    boolean login(Integer job_id,String password);

}
