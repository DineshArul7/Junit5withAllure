package org.example;


import org.junit.jupiter.api.*;



/**
 * Unit test for simple App.
 */
public class LoginTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Entering the url");
        Assertions.assertEquals(true, true);
    }

    @Test
    public void login()
    {
        System.out.println("logging in");
        Assertions.assertEquals(true, true);
    }
    @Test
    public void successfulllogin()
    {
        System.out.println("logged in successfully");
        Assertions.assertEquals(true, true);
    }
    @Test
    public void tailedlogin()
    {
        System.out.println("login failed");
        Assertions.assertEquals(true, true);
    }
    @BeforeAll
    public static void beforeTest(){
        System.out.println("Before all test in login");
    }
    @BeforeEach
    public void beforeeachtest(){
        System.out.println("before each test in login");
    }
    @AfterAll
    public static void afterall(){
        System.out.println("after all tests in login");
    }
    @AfterEach
    public void aftereach(){
        System.out.println("After each tests in login");

    }

}
