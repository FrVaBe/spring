package de.frvabe.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalcControllerTest {

    @Autowired
    CalcController calc;

    @Test
	public void divisionByZero() {
	    System.out.println(1 / 0);
	}

}
