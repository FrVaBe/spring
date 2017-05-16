package de.frvabe.spring.boot.extconfig.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.frvabe.spring.boot.extconfig.demo.test.config.AppPropToSysPropTranscriber;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class, AppPropToSysPropTranscriber.class})
public class AppPropToSysPropTest {

    /**
     * Test if the config matches to the values of the classpath 'application.properties' file.
     */
    @Test
    public void systemPropertyTest() {
        assertEquals("Hello", System.getProperty("demo.greeting"));
        assertEquals("Foo", System.getProperty("demo.name"));
    }
}
