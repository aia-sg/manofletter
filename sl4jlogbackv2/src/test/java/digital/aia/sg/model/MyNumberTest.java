package digital.aia.sg.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class MyNumberTest {

   private static final Logger logger = LoggerFactory.getLogger(MyNumberTest.class);

   private MyNumber number1, number2; // Test fixtures
 
   @Before
   public void setUp() throws Exception {
      logger.info ("Run @Before"); // for illustration
      number1 = new MyNumber(11);
      number2 = new MyNumber(22);
   }
 
   @After
   public void tearDown() throws Exception {
    logger.info ("Run @After"); // for illustration
   }
 
   @Test
   public void testGetterSetter() {
      logger.info ("Run @Test testGetterSetter"); // for illustration
      int value = 33;
      number1.setNumber(value);
      assertEquals("error in getter/setter", value, number1.getNumber());
   }
 
   @Test
   public void testAdd() {
      logger.info ("Run @Test testAdd"); // for illustration
      assertEquals("error in add()", 33, number1.add(number2).getNumber());
      assertEquals("error in add()", 55, number1.add(number2).getNumber());
   }
 
   @Test
   public void testDiv() {
      logger.info ("Run @Test testDiv"); // for illustration
      assertEquals("error in div()", 2, number2.div(number1).getNumber());
      assertEquals("error in div()", 0, number2.div(number1).getNumber());
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testDivByZero() {
      logger.info ("Run @Test testDivByZero"); // for illustration
      number2.setNumber(0);
      number1.div(number2);
   }
}