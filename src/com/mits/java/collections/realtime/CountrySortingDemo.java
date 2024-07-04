package com.mits.java.collections.realtime;

import java.util.ArrayList;
import java.util.Collections;

class Country  implements Comparable<Country>{
      private String countryName;
      private int  population;
      private String worldRating;


      // Key Area
      public int compareTo(Country country){
          return this.population - country.population;
      }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public String getWorldRating() {
        return worldRating;
    }

    public Country(String countryName , int population , String worldRating){
          this.countryName = countryName;
          this.population =  population;
          this.worldRating = worldRating;

    }

}

public class CountrySortingDemo{

    public static void main(String[] args) {
        ArrayList<Country> list  = new  ArrayList<Country>();

        list.add( new Country("India" , 140, "5th Economy"));
        list.add( new Country( "USA" ,  30, "1st Economy"));
        list.add( new Country( "China" ,  130, "2nd Economy"));
        list.add( new Country( "Japan" ,  40, "3rd Economy"));
        list.add( new Country( "Germany" ,  50, "4th Economy"));

        Collections.sort(list);;

        list.forEach(e -> System.out.println( " Country : "+ e.getCountryName() + " Population  " + e.getPopulation() + " Economy "+ e.getWorldRating()));



    }





}