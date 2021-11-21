package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

public class paymentsTest {
    @DisplayName("payment started test case")
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("payment initiated");
        Assertions.assertEquals(true, true);
    }
    @DisplayName("Enter the info")
    @Test
    public void login()
    {
        System.out.println("Entering the nesscessary information");
        Assertions.assertEquals(true, true);
    }
    @DisplayName("parameterized Test")
    @ParameterizedTest
    @ValueSource(strings = {"Deekay","Dinesh","Devil","Darkdevil"})
    public void param(String names)
    {
        System.out.println("Entering the nesscessary information      "+names);
        Assertions.assertEquals(true, true);
    }

    @DisplayName("Repeated Test")
    @RepeatedTest(value = 5)
    public void  test()
    {
            System.out.println("Repeated Test");


        Assertions.assertEquals(true, true);
    }
    @DisplayName("Succes")
    @Test
    public void successfulllogin()
    {
        System.out.println("pamenent successful");
        Assertions.assertEquals(true, true);
    }
    @DisplayName("failed")
    @Test
    public void tailedlogin()
    {
        System.out.println("payment failed");
        Assertions.assertEquals(true, true);
    }
    @DisplayName("method surse")
    @ParameterizedTest
    @MethodSource("listofname")
    public void methodsource(String name){
        System.out.println(name);
    }

    public static List<String> listofname(){
        return Arrays.asList("nithya","sangeetha","bharathi","pragitha","swetha","sankari");
    }

    @DisplayName("Csv file source")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void csvfileparam(String names){
        System.out.println(names);
    }
}
