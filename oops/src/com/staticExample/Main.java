package com.staticExample;

public class Main {
   public static void main(String[] args){

      System.out.println(Human.population);
      Human human1 = new Human(18,"Sudhanshu","India", 10000 , false);
      Human human2 = new Human(19,"Harsh","India", 20000 , false);

      System.out.println(Human.population);
      System.out.println(Human.population);

      Main obj = new Main();
      obj.greeting();
   }


   void greeting(){
//      fun();
      System.out.println("Hello world");
   }
}
