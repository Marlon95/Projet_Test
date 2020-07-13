package main.java.com.github.jmaillard.mockito.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class OrderTest {

	@Test
	public void should_suggest_8_99_if_3_99_plus_5 () {
		// GIVEN
        Product a = Mockito.mock(Product.class);
        Product b = Mockito.mock(Product.class);
        List list = new ArrayList <Product>();
        list.add(a);
        list.add(b);
        Order command = new Order(list);

        // WHEN

        try {
			Mockito.when(a.getPrice()).thenReturn(new BigDecimal("3.99"));
			Mockito.when(b.getPrice()).thenReturn(new BigDecimal("5.00"));
			
		// THEN
	        Assert.assertEquals(new BigDecimal("8.99"), command.getTotalPrice());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
