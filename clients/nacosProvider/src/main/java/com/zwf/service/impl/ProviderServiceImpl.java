package com.zwf.service.impl;

import com.zwf.dao.ProviderDao;
import com.zwf.pojo.TestEntity;
import com.zwf.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Discription:
 * @Author: 张文峰
 * @Date: 2021-09-25 15:13:37
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderDao dao;

    /**
     * 获取测试数据
     *
     * @param
     * @return : com.zwf.pojo.TestEntity
     * @Date 2021/9/25 - 15:14
     */
    @Override
    public TestEntity getData() {
        return dao.getData();
    }
}
