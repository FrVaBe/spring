package de.frvabe.spring.boot.extconfig.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class ClasspathApplicationPropertiesTest {

    @Autowired
    DemoProperties demoProperties;

    /**
     * Test if the config matches to the values of the classpath 'application.properties' file.
     */
    @Test
    public void configTest() {
        assertEquals("Hello", demoProperties.getGreeting());
        assertEquals("Foo", demoProperties.getName());
    }

}
