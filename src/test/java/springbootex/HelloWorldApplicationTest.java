package springbootex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {HelloWorldApplication.class})
@SpringBootTest(classes= {HelloWorldApplication.class})
public class HelloWorldApplicationTest {
	
	@Test
	public void contextLoads() {
	}
}
