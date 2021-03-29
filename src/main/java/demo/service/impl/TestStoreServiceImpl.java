package demo.service.impl;

import demo.dao.Test1Dao;
import demo.dao.Test2Dao;
import demo.service.TestStoreService;

public class TestStoreServiceImpl implements TestStoreService {
    private Test1Dao test1Dao;
    private Test2Dao test2Dao;

    public Test1Dao getTest1Dao() {
        return test1Dao;
    }

    public void setTest1Dao(Test1Dao test1Dao) {
        this.test1Dao = test1Dao;
    }

    public Test2Dao getTest2Dao() {
        return test2Dao;
    }

    public void setTest2Dao(Test2Dao test2Dao) {
        this.test2Dao = test2Dao;
    }
}
