package com.cc.java;

public class App {

  public static void main(String[] args) {
      
    // Controller als statische Klasse
    
    // Namenslisten  --> Array
    String [] dogNames = {"Fifi", "Boo", "Cassie", "Bonzo"};
    String [][] catAttributes = {{"Suzan","26"},{"Grizabella","29"}};
    String [][] tomcatAttributes = {{"Alonzo","30"},{"RumTumTugger","45"}};
    
    // Init Dogs
    for (int i = 0; i < dogNames.length; i++) {
      Controller.addNewDog(dogNames[i]);
    } 
    
    // Init Cats
    for (int i = 0; i < catAttributes.length; i++) {
      Controller.addNewCat(catAttributes[i]);
    }
    
    // Init Tomcats
    for (int i = 0; i < tomcatAttributes.length; i++) {
      Controller.addNewTomcat(tomcatAttributes[i]);
    }
    
    ausgabe("----------------");
    
    // Hund --> Katze/Kater: Name??
    ausgabe(Controller.getSomeRandomDog().askACatItsName());		
    // Katze/Kater --> Katze/Kater: Name??
    ausgabe(Controller.getSomeRandomFelidae().askACatItsName());
    
    ausgabe("----------------");
    
    // Katze/Kater --> Katze/Kater: Alter??
    ausgabe(Controller.getSomeRandomFelidae().askACatHerAge());
    ausgabe(Controller.getSomeRandomFelidae().askACatHerAge());
    ausgabe(Controller.getSomeRandomFelidae().askACatHerAge());
    ausgabe(Controller.getSomeRandomFelidae().askACatHerAge());
    ausgabe(Controller.getSomeRandomFelidae().askACatHerAge());
    
   ausgabe("----------------");
    
   ausgabe(Controller.getSomeRandomDog().petSounds());
   ausgabe(Controller.getSomeRandomFelidae().petSounds());
    
  }

  public static void ausgabe(String outStr) {
    System.out.println(outStr);
    }


}
