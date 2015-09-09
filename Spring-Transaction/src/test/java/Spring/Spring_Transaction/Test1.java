package Spring.Spring_Transaction;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.silva.spring.transation.service.AccountService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-beans.xml")
public class Test1 
   
{   
	@Resource(name="accountService")
    private AccountService accountService;
    
	@Test
    public void test( )
    {
        accountService.transfer("aaa", "bbb", 200.0);
    }

   
}
