package me.xiaff.crawler.acmfellow.onetime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetDblpLinksTest {

    @Autowired
    private GetDblpLinks getDblpLinks;

    @Test
    public void run() throws Exception {
        getDblpLinks.getAminerScholarsLinks();
    }

    @Test
    public void getFellowsLinks() throws Exception {
        getDblpLinks.getFellowsLinks();
    }
}