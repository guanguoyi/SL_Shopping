package ggy;

import com.sy.config.SpringConfig;
import com.sy.service.ggy.Info_annexesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SpringBootTest(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
    @Autowired
    Info_annexesService infoAnnexesService;
    @Test
    public void test(){
        System.out.println(infoAnnexesService.findAll());
    }
}
