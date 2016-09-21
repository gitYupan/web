package com.yihou.dao.test;

import com.alibaba.fastjson.JSON;
import com.yihou.dao.CoreUserMapper;
import com.yihou.dao.entity.CoreUserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class ResourceMapperTest {

    @Autowired
    public CoreUserMapper coreUserMapper;

    @Test
    public void testUser() {
        CoreUserExample coreUserExample = new CoreUserExample();
        coreUserExample.createCriteria().andUserIdEqualTo(1L);
        System.out.println(JSON.toJSONString(coreUserMapper.selectByExample(coreUserExample)));
    }


}
