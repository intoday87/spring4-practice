package qualifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfiguration.class)
public class DessertConfigurationTest {
    @Autowired
    @Cold
    @Creamy
    Dessert iceCream;

    @Autowired
    @Cold
    @Fruity
    Dessert popsicle;

    @Test
    public void iceCreamIsColdAndCreamy() throws Exception {
        assertThat(iceCream).isInstanceOf(IceCream.class);
    }

    @Test
    public void popsicleIsColdAndFruity() throws Exception {
        assertThat(popsicle).isInstanceOf(Popsicle.class);
    }
}