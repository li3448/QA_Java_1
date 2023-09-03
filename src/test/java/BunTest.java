package practicum;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    @Test
    public void getBunName() {
        Bun bun = new Bun("testBun", 100);
        Assert.assertEquals("testBun", bun.getName());
    }
}