package com.driver;

public class Main {
  public static void main(String args[]) {
    RWOnly obj1 = new RWOnly();
//    obj1.name = "Surandan";       // gave an error cause name is private
//    System.out.println(obj1.name);
    obj1.setName("Surandan");
    System.out.println(obj1.getName());
  }
    
}
