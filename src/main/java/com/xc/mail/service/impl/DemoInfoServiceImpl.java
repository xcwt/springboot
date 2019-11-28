package com.xc.mail.service.impl;

import com.xc.mail.entity.DemoInfo;
import com.xc.mail.repository.DemoInfoRepository;
import com.xc.mail.service.DemoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * on 2019/11/28 14:03
 *
 * @author zhuweitao
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DemoInfoServiceImpl implements DemoInfoService {

    @Resource
    private DemoInfoRepository dr;

    @Resource
    private RedisTemplate<String,String> redisTemplate;


    //keyGenerator="myKeyGenerator"
    @Cacheable(value="demoInfo") //缓存,这里没有指定key.
    @Override
    public DemoInfo findById(long id) {
        System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);
        return dr.findOne(id);
    }

    @CacheEvict(value="demoInfo")
    @Override
    public void deleteFromCache(long id) {
        System.out.println("DemoInfoServiceImpl.delete().从缓存中删除.");
    }

    @Override
    public void test() {
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("mykey4", "random1="+Math.random());
        System.out.println(valueOperations.get("mykey4"));
    }
}
