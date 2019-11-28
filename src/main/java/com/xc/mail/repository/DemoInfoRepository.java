package com.xc.mail.repository;

import com.xc.mail.entity.DemoInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * on 2019/11/28 14:01
 *
 * @author zhuweitao
 */
@Repository
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {
}
