package com.yihou.dao.test;

import com.yihou.dao.ResourceMapper;
import com.yihou.dao.ResourceRoleMapper;
import com.yihou.entity.ResourceExample;
import com.yihou.entity.ResourceRoleExample;
import com.yihou.entity.RoleExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class ResourceMapperTest {

    @Autowired
    private ResourceMapper resourceMapper;

    @Autowired
    private ResourceRoleMapper resourceRoleMapper;

    @Test
    public void testSelectByExample() {
        System.out.println("============================");
        ResourceExample example = new ResourceExample();
        example.or().andIdEqualTo(1L);
        example.or().andIdEqualTo(2L);
        System.out.println(resourceMapper.selectByExample(example).size());
        System.out.println("============================");
    }

}
