package org.pojo;

import org.testng.annotations.Test;

public class A {
@Test
private void Tc30() {
System.out.println("Test Case 30");
System.out.println("Tc30 :" + Thread.currentThread().getId());
}
@Test
private void Tc31() {
System.out.println("Test Case 31");
System.out.println("Tc31 :" + Thread.currentThread().getId());
}
}