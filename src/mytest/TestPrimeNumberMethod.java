package mytest;

import org.junit.*;

import chapter6.PrimeNumberMethod;

import static org.junit.Assert.*;
import java.util.*;

public class TestPrimeNumberMethod {
    @Test
    public void test1() {
        assertEquals(true, PrimeNumberMethod.isPrime(1));
        assertEquals(false, PrimeNumberMethod.isPrime(4));
        assertEquals(true, PrimeNumberMethod.isPrime(6));
    }

}
