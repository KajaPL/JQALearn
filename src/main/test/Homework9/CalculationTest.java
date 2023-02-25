package Homework9;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculationTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testCube1(){
        System.out.println("test case cube1");
        assertEquals(27,Calculation.cube(3));
    }

    @Test
    public void testCube2  (){
        System.out.println("test case cube2");
        assertEquals(125,Calculation.cube(5));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }

}