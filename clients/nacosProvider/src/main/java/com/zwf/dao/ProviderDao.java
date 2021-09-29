package com.zwf.dao;

import com.zwf.pojo.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Discription: 示例数据操作层
 * @Author: 张文峰
 * @Date: 2021-09-25 15:08:59
 */
@Repository // 将TestDao的Bean放到Spring容器中
public class ProviderDao {

    public TestEntity getData() {
        return new TestEntity("T" + System.currentTimeMillis(), "TEST", 0.00, new Date());
    }
}
