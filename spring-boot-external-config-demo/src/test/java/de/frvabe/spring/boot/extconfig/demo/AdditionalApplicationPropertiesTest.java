package de.frvabe.spring.boot.extconfig.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class AdditionalApplicationPropertiesTest {

    static {
        // Test properties are usually set with the @TestPropertySource annotation but in this
        // test the usage of the 'spring.config.location' should be demonstrated
        System.setProperty("spring.config.location",
                System.getProperty("user.dir") + "/src/test/resources/additional.properties");
    }

    @Autowired
    DemoProperties demoProperties;

    /**
     * Check if the property values in the additional config file were taken. Also check that
     * parameter which were not declared in the additional file are still take from the
     * application.propertis file in the root of the classpath.
     */
    @Test
    public void configTest() {
        // from classpath application.properties
        assertEquals("Hello", demoProperties.getGreeting());
        // from additional config file
        assertEquals("Bar", demoProperties.getName());
    }

}
