package com.skycloud.datax.web;

import com.skycloud.datax.web.dao.JobConfigMapper;
import com.skycloud.datax.web.model.entity.JobConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataxWebApplicationTests {

    @Autowired
    JobConfigMapper jobConfigMapper;

    @Test
    public void contextLoads() {
        JobConfig jobConfig = new JobConfig();
        jobConfig.setConfigJson("{}");
        jobConfigMapper.insert(jobConfig);
    }

}
