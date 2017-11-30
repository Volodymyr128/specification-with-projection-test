package com.vbakh.test.service;

import com.vbakh.test.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import static org.junit.Assert.assertEquals;

/**
 * Created by volodymyr.bakhmatiuk on 11/30/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
@DataJpaTest
public class DocumentServiceTest {

    @Resource
    private DocumentService service;

    @Test
    public void test() {
        assertEquals(2, service.findAll().size());
    }
}
