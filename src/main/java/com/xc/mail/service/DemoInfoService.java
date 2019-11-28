package com.xc.mail.service;

import com.xc.mail.entity.DemoInfo;

/**
 * on 2019/11/28 14:03
 *
 * @author zhuweitao
 */
public interface DemoInfoService {

    DemoInfo findById(long id);

    void deleteFromCache(long id);

    void test();
}
